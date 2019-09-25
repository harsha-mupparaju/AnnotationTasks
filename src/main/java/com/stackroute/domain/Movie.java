package com.stackroute.domain;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class Movie implements BeanNameAware,BeanFactoryAware,ApplicationContextAware {

    Actor actor;

@Autowired
    public Movie(Actor actor) {
        this.actor = actor;}

    public Actor getActor() {
        return actor;
    }

    public void displayMovieInfo(){
            System.out.println( " Actor Name =" +actor.getName() +" ,Actor Gender =" +actor.getGender()+
                    " ,Actor age ="+actor.getAge());

        }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("BeanFactory aware");
    }
    @Override
    public void setBeanName(String s) {
        System.out.println("Bean name is calling");

    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Application context aware");
    }
}

