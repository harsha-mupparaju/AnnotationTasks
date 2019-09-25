package com.stackroute.demo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


@Component
public class BeanLifeCycleDemo implements InitializingBean,DisposableBean {

    @Override
    public void destroy() throws Exception {
        System.out.println("Initialising bean interface is called");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("disposable bean interface is called");
    }




}
