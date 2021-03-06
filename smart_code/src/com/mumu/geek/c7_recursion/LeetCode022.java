package com.mumu.geek.c7_recursion;

import java.util.ArrayList;
import java.util.List;

public class LeetCode022 {

    /**
     * 括号生成
     * <p>
     * 数字 n 代表生成括号的对数，请你设计一个函数，用于能够生成所有可能的并且 有效的 括号组合。
     * <p>
     * 示例：
     * 输入：n = 3
     * 输出：[
     * "((()))",
     * "(()())",
     * "(())()",
     * "()(())",
     * "()()()"
     * ]
     */

    private static ArrayList<String> result;
    public static List<String> generateParenthesis(int n) {
        result = new ArrayList<>();
        _generate(0, 0, n, "");
        return result;
    }

    /**
     * 思路(深度优先遍历): 想象成有2n个格子，从左到右填括号，每个格子可以填左括号与右括号，当2n个格子填满后递归一次就结束。
     * 填格子的条件根据题意总结下来: 左括号: 随时加，只要不超标；右括号: 左个数 > 右个数
     * @param left
     * @param right
     * @param n
     * @param s
     */
    public static void _generate(int left, int right, int n, String s) {
        if (left == n && right == n) {
            result.add(s);
            return;
        }

        // 左括号: 随时加，只要不超标
        if (left < n) {
            _generate(left + 1, right, n, s + "(");
        }
        if (right < left) { // 右括号: 左个数 > 右个数
            _generate(left, right + 1, n, s + ")");
        }
    }


    public static void main(String[] args) {
        List<String> list = generateParenthesis(3);
        System.out.println(list.toString());
        System.out.println("size:" + list.size());
    }



}
