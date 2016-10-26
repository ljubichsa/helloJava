package com.example.helloworld;

/**
 * Created by SA on 21.10.2016.
 */
public class HelloWorld {
    String tmp = "Hello, World!";

    @Override
    public String toString() {
        return tmp;
    }

    public static void main(String[] args) {
        HelloWorld hw = new HelloWorld();
        System.out.println(hw.toString());
    }
}
