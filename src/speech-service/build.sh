#!/bin/bash

###########################################################################
# @licence app begin@
# SPDX-License-Identifier: MPL-2.0
#
# \copyright Copyright (C) 2013-2017, PSA Group
#
# \file build.sh
#
# \brief This file is part of the Build System for speech.
#
# \author Philippe Colliot <philippe.colliot@mpsa.com>
#
# \version 1.0
#
# This Source Code Form is subject to the terms of the
# Mozilla Public License (MPL), v. 2.0.
# If a copy of the MPL was not distributed with this file,
# You can obtain one at http://mozilla.org/MPL/2.0/.
#
# For further information see http://www.genivi.org/.
#
# List of changes:
# 
#
# @licence end@
###########################################################################

clean=0 #no clean (means no cmake) -> -c option
dlt_option="OFF" #no DLT -> -l option
debug="OFF" #no debug -> -d option
 
while getopts cdhl opt
do
	case $opt in
	c)
		clean=1
		;;
	d)
		debug="ON"
		;;
	l)
		dlt_option="ON"
		;;
	h)
		echo "Usage:"
		echo "$0 [-cdhl]"
		echo "-c: Rebuild with clean"
		echo "-d: Enable the debug messages"
		echo "-h: Help"
		echo "-l: Build with dlt (only with -c)"
		exit 1
	esac
done

set -e

if [ "$clean" = 1 ]
then
	echo 'clean up the build folder'
	if [ -d "./build" ]
	then
		find ./build ! -name '*.cbp' -type f -exec rm -f {} +
	fi
fi

mkdir -p build
cd build

echo 'build speech output'
if [ "$clean" = 1 ]
then
	cmake -DWITH_DLT=$dlt_option -DWITH_DEBUG=$debug ../
fi
make


