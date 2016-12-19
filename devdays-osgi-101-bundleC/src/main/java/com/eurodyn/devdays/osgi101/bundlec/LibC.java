package com.eurodyn.devdays.osgi101.bundlec;

import org.ops4j.pax.cdi.api.OsgiServiceProvider;

import javax.inject.Singleton;

@Singleton
@OsgiServiceProvider(classes = {LibCSpecs.class})
public class LibC implements LibCSpecs {

    public String hello(String name) {
        return "Hello " + name;
    }
}
