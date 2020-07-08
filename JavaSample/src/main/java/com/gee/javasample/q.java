package com.gee.javasample;

/**
 * Create by Gee on 2020/7/6.
 */

/**
 * This program tests the condition that there are identical var , method in superclass and childclass.
 * @author Administrator
 *
 */
public class q {

    public static void main(String[] args) {
        Parent1 p = new Child1();
        System.out.println(p.name);
        p.printName();
        p.tellName();
//        Child1 c = new Child1();
//        System.out.println(c.name);
//        c.printName();
//        c.tellName();
    }

}

class Parent1{
    String name = "parent";
    public Parent1(){
        printName();
        tellName();
    }
    public void printName(){
        System.out.println("Parent printName:"+name);
    }
    public void tellName(){
        System.out.println("Parent tellName:"+name);
    }
    public String getName(){
        return name;
    }
}

class Child1 extends Parent1{
    String name = "child";
    public Child1(){
        super();
        printName();
        tellName();
    }
    public void printName(){
        System.out.println("Child printName:"+name);
    }
    public void tellName(){
        System.out.println("Child tellName:"+name);
    }
    public String getName(){
        return name;
    }
}
