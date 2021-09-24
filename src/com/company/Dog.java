package com.company;

public abstract class Dog extends Animal implements Live{
    public String name;

    public Dog() {
    }

    public Dog(String name) {
        super();
        this.name = name;
    }
    public Dog(String name, int age) {
        this.name = name;
        System.out.println(age);
    }

    @Override
    public void breath() {
        super.breath();
        System.out.println("havhavha");
    }

    public void breath(String a){
        System.out.println("a");
    }

    public void run(){
        System.out.println("runnnn");
    }

    public String feedWhat(){
        return "feed "+eat();
    }

    @Override
    public void feel() {

    }

    abstract String eat();
}
