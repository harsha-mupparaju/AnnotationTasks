package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Movie {

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
    }

