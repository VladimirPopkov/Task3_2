package com.company;

import java.util.Random;

public class SequentialRandom {

    private static Random random = new Random();
    private static int count;

    static {
        count = random.nextInt(50)+1;
    }
    SequentialRandom(){
        count++;
    }
    static void resetRandom(){
        count = random.nextInt(50)+1;
    }
    int getCount(){return count;}

}
