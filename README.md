#DevDays
##OSGi + Apache Karaf  
###101: An introduction

`devdays-osgi-101-parent`  
The parent Maven project building all examples.

`devdays-osgi-101-bundleA`  
A simple bundle with no services nor dependencies, exposing 
`com/eurodyn/devdays/osgi101/bundlea/LibA` class.

`devdays-osgi-101-bundleB`  
A bundle depending on ServiceC provided by BundleC  

`devdays-osgi-101-bundleC`  
A bundle providing ServiceC

`devdays-osgi-101-bundleD-specs`  
The specification/interface of a Calculator service.

`devdays-osgi-101-bundleD-impl1`  
An implementation of the Calculator service replying in decimals.

`devdays-osgi-101-bundleD-impl2`  
An implementation of the Calculator service replying in Roman numerals.

`devdays-osgi-101-bundleE`  
A bundle using the Calculator service.
