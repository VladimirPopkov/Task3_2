package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(new SequentialRandom().getCount());
        System.out.println(new SequentialRandom().getCount());
        System.out.println(new SequentialRandom().getCount());
        SequentialRandom.resetRandom();
        System.out.println(new SequentialRandom().getCount());
        System.out.println(new SequentialRandom().getCount());
    }
}
