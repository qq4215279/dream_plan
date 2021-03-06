/*
 * Copyright 2020-2021, 木木996.
 * All Right Reserved.
 */

package com.mumu.geek.c16_bitwise;

/**
 * LeetCode191
 * 位1的个数
 * @author liuzhen
 * @version 1.0.0 2021/8/26 21:25
 */
public class LeetCode191 {

    /**
     * 编写一个函数，输入是一个无符号整数（以二进制串的形式），返回其二进制表达式中数字位数为 '1' 的个数（也被称为汉明重量）。
     *
     * 提示：
     * 请注意，在某些语言（如 Java）中，没有无符号整数类型。在这种情况下，输入和输出都将被指定为有符号整数类型，并且不应影响您的实现，
     * 因为无论整数是有符号的还是无符号的，其内部的二进制表示形式都是相同的。
     * 在 Java 中，编译器使用二进制补码记法来表示有符号整数。因此，在上面的 示例 3 中，输入表示有符号整数 -3。
     *
     * 示例 1：
     * 输入：00000000000000000000000000001011
     * 输出：3
     * 解释：输入的二进制串 00000000000000000000000000001011 中，共有三位为 '1'。
     *
     * 示例 2：
     * 输入：00000000000000000000000010000000
     * 输出：1
     * 解释：输入的二进制串 00000000000000000000000010000000 中，共有一位为 '1'。
     *
     * 示例 3：
     * 输入：11111111111111111111111111111101
     * 输出：31
     * 解释：输入的二进制串 11111111111111111111111111111101 中，共有 31 位为 '1'。
     *  
     * 提示：
     * 输入必须是长度为 32 的 二进制串 。
     *
     * 进阶：
     * 如果多次调用这个函数，你将如何优化你的算法？
     *
     * 思路：
     * 1. for loop: 0 -> (32次)
     * 2. %2, /2
     * 3. &1, x= x>> 1; (32次)
     * 4. while(x > 0) { count++; x = x & (x - 1); }
     */

    // you need to treat n as an unsigned value
    public static int hammingWeight(int n) {
        int bits = 0;
        int mask = 1;
        for (int i = 0; i < 32; i++) {
            if ((n & mask) != 0) {
                bits++;
            }
            mask <<= 1;
        }

        return bits;
    }

    /**
     * 时间复杂度：O(1)   空间复杂度：O(1)
     * @author liuzhen
     * @date 2021/8/26 21:41
     * @param n
     * @return int
     */
    public static int hammingWeight2(int n) {
        int bits = 0;
        while (n != 0) {
            bits++;
            n &= (n - 1);
        }

        return bits;
    }

    public static void main(String[] args) {
        System.out.println(hammingWeight(00000000000000000000000000001011));
        System.out.println(hammingWeight2(00000000000000000000000000001011));
    }

}
