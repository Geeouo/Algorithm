package com.gee.javasample.Hannota;

/**
 * Create by Gee on 2020/7/6.
 */
public class Solution {
    public static void main(String[] args) {
        move(3,"A","B","C");
    }

    private static void move(int count,String origin,String temp,String dest) {
        if (count<=0) throw new RuntimeException("count 不能<=0");
        if (count ==1 ){
            System.out.println("from "+ origin +" to "+ dest);
        }else {
            move(count-1,origin,dest,temp);
            move(1,origin,temp,dest);
            move(count-1,temp,origin,dest);
        }

    }
}
