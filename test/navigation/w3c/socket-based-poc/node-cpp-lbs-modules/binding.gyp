{
  'targets': [
    {
	'target_name': 'NavigationCoreProxy',
      	'product_prefix': 'lib',
      	'type': 'shared_library',
      	'sources': [ './dbus-proxies/NavigationCoreProxy.cpp' ],
	'include_dirs': ['./','/usr/include/dbus-c++-1/','/usr/include/glib-2.0/','/usr/lib/i386-linux-gnu/glib-2.0/include/','/usr/lib/x86_64-linux-gnu/glib-2.0/include/'],
	'cflags_cc': ['-Wall', '-std=gnu++11', '-fexceptions','-fPIC'],
	'libraries': ['-ldbus-c++-1 -ldbus-1 -ldbus-c++-glib-1', '-L/usr/lib/i386-linux-gnu/']
    },
    {
      	'target_name': 'NavigationCoreConfigurationWrapper',
      	'dependencies': [ 'NavigationCoreProxy' ],
      	'sources': [ './NavigationCoreConfigurationWrapper.cpp' ],
	'include_dirs': ['./','./dbus-proxies','/usr/include/dbus-c++-1/','/usr/include/glib-2.0/','/usr/lib/i386-linux-gnu/glib-2.0/include/','/usr/lib/x86_64-linux-gnu/glib-2.0/include/'],
	'cflags_cc': ['-Wall', '-std=gnu++11', '-fexceptions'],
	'libraries': ['-ldbus-c++-1 -ldbus-1 -ldbus-c++-glib-1', '-L/usr/lib/i386-linux-gnu/']
    }
  ]
}
