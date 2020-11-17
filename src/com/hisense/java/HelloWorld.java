package com.hisense.java;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Date;

public class HelloWorld {


    private static final int INITIALSIZE = 10;

    public static void main(String[] args) {
        System.out.println("hello,world!!!");
        ArrayList list22 = new ArrayList();
        int a =11;


        list22.add(1, 11);
        Date date = new Date();


    }

    public static void method1() {


        try {
            FileInputStream fis = new FileInputStream("hello.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }


}
