###########################################################################
# @licence app begin@
# SPDX-License-Identifier: MPL-2.0
#
# Component Name: navigation
#
# Author: Philippe Colliot
#
# Copyright (C) 2014, PCA Peugeot Citroën
# 
# License:
# This Source Code Form is subject to the terms of the
# Mozilla Public License, v. 2.0. If a copy of the MPL was not distributed with
# this file, You can obtain one at http://mozilla.org/MPL/2.0/.
#
# @licence end@
###########################################################################
project(navigation)
cmake_minimum_required(VERSION 2.8)

message(STATUS "navigation")

find_program(XSLTPROC xsltproc REQUIRED)
find_program(GIT git)

include_directories(${CMAKE_CURRENT_BINARY_DIR})

set (git_get_src_version git rev-parse HEAD)
set (git_executable ${GIT})

# Check if positioning stuff with the right version has been cloned and do it if necessary
# positioning_SRC_DIR is set by cmake -Dpositioning_SRC_DIR=<path to positioning src dir> 
set(positioning_URL http://git.projects.genivi.org/lbs/positioning.git)
set(positioning_VERSION fde1a780f531389d5a05e3b0486c98ad34df3dcb)

if (EXISTS ${positioning_SRC_DIR})
	execute_process(COMMAND ${git_get_src_version}  
					WORKING_DIRECTORY "${positioning_SRC_DIR}"
					RESULT_VARIABLE result
					OUTPUT_VARIABLE version)
	if (${version} MATCHES ${positioning_VERSION})
		message(STATUS "version of positioning up to date")	
	else()
		message(STATUS "get the right version of positioning")
	 	execute_process(
			COMMAND "${git_executable}" pull
			COMMAND "${git_executable}" checkout ${positioning_VERSION}
			WORKING_DIRECTORY "${positioning_SRC_DIR}"
			RESULT_VARIABLE error_code
		)
		if(error_code)
			message(FATAL_ERROR "Failed to checkout version: '${positioning_VERSION}'")
		endif()	
	endif()
else()
	message(STATUS "clone positioning")
	execute_process(
		COMMAND "${git_executable}" clone "${positioning_URL}" "${positioning_SRC_DIR}"
		RESULT_VARIABLE error_code
	)
 	if(error_code)
		message(FATAL_ERROR "Failed to clone repository: '${positioning_URL}'")
	endif()

	message(STATUS "get the right version of positioning")
 	execute_process(
		COMMAND "${git_executable}" pull
		COMMAND "${git_executable}" checkout ${positioning_VERSION}
		WORKING_DIRECTORY "${positioning_SRC_DIR}"
		RESULT_VARIABLE error_code
	)
	if(error_code)
		message(FATAL_ERROR "Failed to checkout version: '${positioning_VERSION}'")
	endif()	
endif()