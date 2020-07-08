package com.gee.javasample.nStep;

/**
 * Create by Gee on 2020/7/6.
 * <p>
 * 共有n阶台阶，每次只能走1步或2步，求一共有多少种走法
 * 当n=1时  f(1) = 1
 * * 当n=2时  f(2) = 2
 * * 当n=3时  f(3) = f(3-1)+f(3-2)
 * * ···
 * <p>
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println(fun2(40));
    }

    /**
     * 第一种方法：递归
     *
     * @param n
     * @return
     */
    private static int fun(int n) {
        if (n == 1 || n == 2) {
            return n;
        }

        return fun(n - 1) + fun(n - 2);
    }


    /**
     * 第二种方法：循环迭代
     *
     * @param n
     * @return
     */
    private static int fun2(int n) {
        if (n == 1 || n == 2) {
            return n;
        }
        //定义one最后走的一次步数为1 前面可选的方法的个数，初始值为2
        //定义two最后走的一次步数为2 前面可选的方法的个数，初始值为1
        int one = 2;
        int two = 1;
        int sum = 0;
        for (int i = 3; i <= n; i++) {
            sum = one + two;
            two = one;
            one = sum;
        }
        return sum;
    }


}
