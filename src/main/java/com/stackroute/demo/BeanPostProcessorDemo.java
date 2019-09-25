package com.stackroute.demo;


import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class BeanPostProcessorDemo implements BeanPostProcessor {
    {
        System.out.println("entering bean post processor");
    }
}
