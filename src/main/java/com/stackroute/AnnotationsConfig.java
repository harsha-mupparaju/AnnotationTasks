package com.stackroute;

import com.stackroute.demo.BeanLifeCycleDemo;
import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import javax.xml.stream.FactoryConfigurationError;
@ComponentScan("com.stackroute")
@Configuration
public class AnnotationsConfig {

    @Bean
    public Movie movie(){
       return new Movie(actor());
    }
    @Bean
    public Movie movie1(){
        return  new Movie(actor1());
    }
    @Bean
    public Movie movie2(){
        return  new Movie(actor2());
    }


    @Bean
    public Actor actor(){
        return  new Actor("Aysuhmann Khuraana","Male",35);
    }

    @Bean
    public Actor actor1(){
        return  new Actor("Ranveer Singh","Male",32);
    }

    @Bean
    public Actor actor2(){
        return  new Actor("Deepika Padukone","female",31);
    }
}
