package com.stackroute;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import javax.xml.stream.FactoryConfigurationError;

@Configuration
public class AnnotationsConfig {

    @Bean(name = {"movie","movie1"})
    @Scope("prototype")
    public Movie movie(){
        return  new Movie(actor());
    }
    @Bean(name={"movie1","movie2"})
    @Scope("prototype")
    public Movie movie1(){
        return  new Movie(actor1());
    }
    @Bean
    @Scope("prototype")
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
