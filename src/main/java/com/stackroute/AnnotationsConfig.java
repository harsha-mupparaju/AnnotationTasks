package com.stackroute;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.xml.stream.FactoryConfigurationError;

@Configuration
public class AnnotationsConfig {

    @Bean
    public Movie movie(){
        return  new Movie(actor());
    }

    @Bean
    public Actor actor(){
        return  new Actor("Aysuhmann Khuraana","Male",35);
    }
}
