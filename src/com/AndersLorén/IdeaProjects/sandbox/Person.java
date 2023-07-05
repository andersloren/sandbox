package com.AndersLorén.IdeaProjects.sandbox;

import com.AndersLorén.IdeaProjects.sandbox.Name;

public class Person {
    private Name personName;

    public Person(Name personName) {
        this.personName = personName;
    }
    public Person () {
        /*
        empty on purpose - default constructor
         */
    }
    public String helloWorld() {
        return "Hello World";
    }
    public String hello(String name){
        return "Hello " + name;
    }
}