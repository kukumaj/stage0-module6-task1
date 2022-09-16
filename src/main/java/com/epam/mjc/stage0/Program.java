package com.epam.mjc.stage0;

public class Program {
    public static void main(String[] args) {
    Dog dog = new Dog("grey",4,true);
    Bird bird = new Bird("gold",2,false);

        System.out.println(dog.getDescription());
        System.out.println(bird.getDescription());

    }

}
