package com.stackroute;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;


public class Main {


    public static void main(String[] args) {
/*        XmlBeanFactory factory=new XmlBeanFactory(new ClassPathResource(AnnotationsConfig));
        Movie movieInfo1=factory.getBean(Movie.class);
        movieInfo1.displayMovieInfo();
        */

       AbstractApplicationContext context=new AnnotationConfigApplicationContext(AnnotationsConfig.class);
        Movie movieInfo=context.getBean("movie",Movie.class);
        movieInfo.displayMovieInfo();


        Movie movieInfo1=context.getBean("movie1",Movie.class);
        movieInfo1.displayMovieInfo();

        Movie movieInfo2=context.getBean("movie2",Movie.class);
        movieInfo2.displayMovieInfo();

        System.out.println(movieInfo==movieInfo1);

        context.registerShutdownHook();
    }
}
