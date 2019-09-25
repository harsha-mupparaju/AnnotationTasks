package com.stackroute.domain;

import org.springframework.stereotype.Component;

@Component
public class Movie {

    Actor actor;

    public Movie(Actor actor) {
        this.actor = actor;}


        public void displayMovieInfo(){
            System.out.println( " Actor Name =" +actor.getName() +" ,Actor Gender =" +actor.getGender()+
                    " ,Actor age ="+actor.getAge());

        }
    }

