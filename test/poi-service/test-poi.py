#!/usr/bin/python

"""
**************************************************************************
* @licence app begin@
* SPDX-License-Identifier: MPL-2.0
*
* \copyright Copyright (C) 2016, PSA GROUP
*
* \file test-poi.py
*
* \brief This simple test shows how the poi search 
*              could be easily tested using a python script
*
* \author Philippe Colliot <philippe.colliot@mpsa.com>
*
* \version 1.0
*
* This Source Code Form is subject to the terms of the
* Mozilla Public License, v. 2.0. If a copy of the MPL was not distributed with
# this file, You can obtain one at http://mozilla.org/MPL/2.0/.
* List of changes:
*
* @licence end@
**************************************************************************
"""

import dbus
import gobject
import dbus.mainloop.glib
import time

import pdb;
#pdb.set_trace()
#from dltTrigger import *

#name of the test 
test_name = "poi search"

#constants as defined in the Navigation API
GENIVI_Configuration_Settings_LOCALE = 37
GENIVI_SearchStatusState_FINISHED = 512
GENIVI_SearchStatusState_NOT_STARTED = 510

#constants used into the script
TIME_OUT = 10000
LATITUDE_PARIS = 48.8578
LONGITUDE_PARIS = 2.3380
ALTITUDE_PARIS = 30.0
ID_HOTEL = 2
ID_STATION = 6
ATTRIBUTE_SOURCE = 0
ATTRIBUTE_PHONE = 2
RADIUS_HOTEL = 100 #in tenth of meter !
RADIUS_STATION = 500
STRING_TO_SEARCH = "Saint-Germain"

def catch_poi_configurationChanged_signal_handler(changedSettings):
    for changedSetting in changedSettings:
        if changedSetting == GENIVI_Configuration_Settings_LOCALE:
            ret=g_poiConfiguration_interface.GetLocale()
            print("language: " + ret[0]) 
            print("country: " + ret[1]) 
            print("script: " + ret[2])

def catch_poi_poiStatus_signal_handler(poiSearchHandle,statusValue):
    if poiSearchHandle == g_searchHandle:
        if statusValue == GENIVI_SearchStatusState_FINISHED:
            print("Search finished")
        elif statusValue == GENIVI_SearchStatusState_NOT_STARTED:
            g_poiSearch_interface.DeletePoiSearchHandle(poiSearchHandle)
            print("Test PASSED")
            exit()
         
def catch_poi_resultListChanged_signal_handler(poiSearchHandle,resultListSize):
    poiList=[]
    if poiSearchHandle == g_searchHandle and resultListSize != 0:
        ret=g_poiSearch_interface.RequestResultList(dbus.UInt32(poiSearchHandle),dbus.UInt16(0),dbus.UInt16(resultListSize),[ATTRIBUTE_SOURCE,ATTRIBUTE_PHONE])
        if ret[0] == GENIVI_SearchStatusState_FINISHED and ret[1] >= 0:
            print("Results: "+str(int(ret[1])))
            for result in ret[2]:
                poiList.append(result[0])
            ret=g_poiSearch_interface.GetPoiDetails(poiList)
            for resultDetail in ret:
                if resultDetail[1][0] == ID_HOTEL:
                    print("Hotel: " +resultDetail[0][1])
                elif resultDetail[1][0] == ID_STATION:
                    print("Station: " +resultDetail[0][1])
            g_poiSearch_interface.CancelPoiSearch(dbus.UInt32(poiSearchHandle))           
       
#timeout
def timeout():
    print ('Timeout Expired')
    print ('\nTest FAILED')
    exit()

def exit():
#    stopTrigger(test_name)
    loop.quit()

if __name__ == '__main__':
    dbus.mainloop.glib.DBusGMainLoop(set_as_default=True) 

print("Search for hotel and station with keyword: "+ STRING_TO_SEARCH)

#connect to session bus
bus = dbus.SessionBus()

bus.add_signal_receiver(catch_poi_configurationChanged_signal_handler, \
                        dbus_interface = "org.genivi.navigation.poiservice.POIConfiguration", \
                        signal_name = "ConfigurationChanged")

bus.add_signal_receiver(catch_poi_poiStatus_signal_handler, \
                        dbus_interface = "org.genivi.navigation.poiservice.POISearch", \
                        signal_name = "PoiStatus")

bus.add_signal_receiver(catch_poi_resultListChanged_signal_handler, \
                        dbus_interface = "org.genivi.navigation.poiservice.POISearch", \
                        signal_name = "ResultListChanged")

#startTrigger(test_name)

poiConfiguration = bus.get_object('org.genivi.navigation.poiservice.POIConfiguration','/org/genivi/poiservice/POIConfiguration')
g_poiConfiguration_interface = dbus.Interface(poiConfiguration, dbus_interface='org.genivi.navigation.poiservice.POIConfiguration')

poiContentAccess = bus.get_object('org.genivi.navigation.poiservice.POIContentAccess','/org/genivi/poiservice/POIContentAccess')
g_poiContentAccess_interface = dbus.Interface(poiContentAccess, dbus_interface='org.genivi.navigation.poiservice.POIContentAccess')

poiSearch = bus.get_object('org.genivi.navigation.poiservice.POISearch','/org/genivi/poiservice/POISearch')
g_poiSearch_interface = dbus.Interface(poiSearch, dbus_interface='org.genivi.navigation.poiservice.POISearch')

g_poiConfiguration_interface.SetLocale(dbus.String("fra"),dbus.String("FRA"),dbus.String("Latn"))

categories=[]
ret=g_poiSearch_interface.GetAvailableCategories()
for categoryAndName in ret:
    if categoryAndName[0] == ID_HOTEL or categoryAndName[0] == ID_STATION:
        print("Category ID: " + str(int(categoryAndName[0])))
        categories.append(categoryAndName[0])
        print("Name: " + categoryAndName[1])

attributes_hotel=[]
attributes_station=[]
attributesDetails=[]
ret=g_poiSearch_interface.GetCategoriesDetails(categories)
for results in ret:
    if results[0][0] == ID_HOTEL:
        for attribute in results[1]:
            attributes_hotel.append(attribute[0])
            attributesDetails.append(dbus.Struct([dbus.UInt32(attribute[0]),dbus.UInt32(ID_HOTEL),dbus.Int32(1280),dbus.Struct([dbus.Byte(2),dbus.String("")]),dbus.Int32(1314),dbus.Boolean(False)])) 
    elif results[0][0] == ID_STATION:
        for attribute in results[1]:
            attributes_station.append(attribute[0])
            attributesDetails.append(dbus.Struct([dbus.UInt32(attribute[0]),dbus.UInt32(ID_STATION),dbus.Int32(1280),dbus.Struct([dbus.Byte(2),dbus.String("")]),dbus.Int32(1314),dbus.Boolean(False)])) 
        
ret=g_poiSearch_interface.GetRootCategory()

g_searchHandle=g_poiSearch_interface.CreatePoiSearchHandle()
print("Search handle: " + str(int(g_searchHandle)))

lat = LATITUDE_PARIS
lon = LONGITUDE_PARIS
alt = ALTITUDE_PARIS

g_poiSearch_interface.SetCenter(g_searchHandle,dbus.Struct([lat,lon,alt]))

g_poiSearch_interface.SetCategories(g_searchHandle,[dbus.Struct([dbus.UInt32(ID_HOTEL),dbus.UInt32(RADIUS_HOTEL)]),dbus.Struct([dbus.UInt32(ID_STATION),dbus.UInt32(RADIUS_STATION)])])

g_poiSearch_interface.SetAttributes(g_searchHandle,attributesDetails)

g_poiSearch_interface.StartPoiSearch(g_searchHandle,dbus.String(STRING_TO_SEARCH),dbus.Int32(1376))


#main loop 
gobject.timeout_add(TIME_OUT, timeout)
loop = gobject.MainLoop()
loop.run()
