package com.AndersLorén.IdeaProjects.sandbox;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PersonTest {
    @Test
    public void shouldReturnHelloWorld(){

        Person marcus = new Person();
        assertEquals("Hello World",marcus.helloWorld() );
    }
    @Test
    public void shouldReturnHelloMarcus() {

        Person person = new Person();
        assertEquals("Hello Marcus", person.hello("Marcus"));
    }
}