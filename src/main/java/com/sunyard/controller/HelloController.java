package com.sunyard.controller;

public class HelloController {

    private String name;

    private int age;

    private String a; //test

    private int b;

    private int c; //1.4

    private int d; //1.5 用于测试

    public HelloController(){
        System.out.println("HelloController.HelloController");
    }

    // 1.5
    private void test(){
        System.out.println("d = " + d);
    }

}
