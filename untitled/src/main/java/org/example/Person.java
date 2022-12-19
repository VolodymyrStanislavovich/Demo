package org.example;

public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }
    public boolean equale(Person p){
        return this.name.equals(p.name);
    }

}
