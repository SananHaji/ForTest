package com.company;

public class Teddy extends Dog implements Comparable<Teddy>{
    @Override
    String eat() {
        return "meat";
    }

    public Teddy(String name) {
        super(name);
    }

    @Override
    public int compareTo(Teddy o) {
        return name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return name;
    }
}
