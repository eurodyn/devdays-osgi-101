package com.eurodyn.devdays.osgi101.bundleb;

import com.eurodyn.devdays.osgi101.bundlec.LibCSpecs;
import org.ops4j.pax.cdi.api.OsgiService;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class LibB {
    @OsgiService
    @Inject
    private LibCSpecs libCSpecs;

    @PostConstruct
    public void init() {
        System.out.println(libCSpecs.hello("from bundle B!"));
    }
}
