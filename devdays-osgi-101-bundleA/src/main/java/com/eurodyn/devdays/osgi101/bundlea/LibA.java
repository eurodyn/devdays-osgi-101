package com.eurodyn.devdays.osgi101.bundlea;


import javax.annotation.PostConstruct;
import javax.inject.Singleton;

@Singleton
public class LibA {

    @PostConstruct
    public void init() {
        System.out.println("Bundle A has started!");
    }
}
