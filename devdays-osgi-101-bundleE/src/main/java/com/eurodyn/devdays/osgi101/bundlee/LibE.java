package com.eurodyn.devdays.osgi101.bundlee;

import com.eurodyn.devdays.osgi101.bundled.api.CalculatorService;
import org.ops4j.pax.cdi.api.OsgiService;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class LibE {

    @OsgiService
    @Inject
    private CalculatorService calculatorService;

    @PostConstruct
    public void init() {
        System.out.println("Result = " + calculatorService.add(120, 130));
    }
}
