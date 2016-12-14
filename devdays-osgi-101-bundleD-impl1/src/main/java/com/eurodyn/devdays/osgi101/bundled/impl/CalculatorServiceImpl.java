package com.eurodyn.devdays.osgi101.bundled.impl;

import com.eurodyn.devdays.osgi101.bundled.api.CalculatorService;
import org.ops4j.pax.cdi.api.OsgiServiceProvider;

import javax.inject.Singleton;

@Singleton
@OsgiServiceProvider(classes = {CalculatorService.class})
public class CalculatorServiceImpl implements CalculatorService {
    public String  add(int n1, int n2) {
        return String.valueOf(n1 + n2);
    }
}
