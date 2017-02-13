#!/bin/bash

build_option=""
positioning_version='57345f36fa6095ecb6d7f7998a06abafbcd90a87'
navit_version='5607f355e77250cebd5326a7c7959eb07c12adc2'

echo "version of positioning is: $positioning_version"
echo "version of navit is: $navit_version"

echo -n "This script deletes, reloads and builds everything, are you sure ? (y or n) "
read input

if [ ! "$input" = 'y' ]
then
	exit 1
fi

while getopts m opt
do
	case $opt in
	m)
		build_option="-m"
		;;
	\?)
		echo "Usage:"
		echo "$0 [-m]"
		echo "-m: build with commonAPI plugins "
		exit 1
	esac
done


if [ -d "./build" ]
then
	find ./build ! -name '*.cbp' -type f -exec rm -f {} +
fi
rm -rf navit
rm -rf positioning

git clone https://github.com/GENIVI/positioning.git ./positioning
cd positioning
git checkout $positioning_version
cd ..
git clone https://github.com/navit-gps/navit.git
cd navit
git checkout $navit_version
patch -p0 -i ../patches/search_list_get_unique.diff
patch -p0 -i ../patches/fsa_issue_padding.diff
cd ..

./build.sh -c $build_option



