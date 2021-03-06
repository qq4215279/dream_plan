/*
 * Copyright 2020-2021, 木木996.
 * All Right Reserved.
 */

package com.mumu.geek.c6_tree;

import com.mumu.common.entity.MultiTreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * N叉树的前序，层次，后续遍历
 * @author liuzhen
 * @date 2021/8/6 18:13
 */
public class MultiTreeNodeOrder { // LeetCode T589:N叉树的前序遍历;  层次遍历：       T590: N叉树的后序遍历

    /**
     * N叉树的前序遍历
     * <p>
     * 给定一个 N 叉树，返回其节点值的前序遍历。
     * <p>
     * 例如，给定一个 3叉树 :
     * <p>
     * 返回其前序遍历: [1,3,5,6,2,4]。
     */


    /**
     * 前序递归遍历N叉树
     * @author liuzhen
     * @date 2021/8/13 16:18
     * @param root
     * @return java.util.List<java.lang.Integer>
     */
    public static void preOrder(MultiTreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }

        if (root != null) {
            list.add(root.value);
            for (MultiTreeNode node : root.children) {
                preOrder(node, list);
            }
        }
        return;
    }

    /**
     * 后序递归遍历N叉树
     * @author liuzhen
     * @date 2021/8/13 16:18
     * @param root
     * @return java.util.List<java.lang.Integer>
     */
    public static List<Integer> postOrder(MultiTreeNode root, List<Integer> list) {
        if (root == null) {
            return list;
        }

        if (root != null) {
            for (MultiTreeNode node : root.children) {
                postOrder(node, list);
            }
            list.add(root.value);
        }
        return list;
    }

    /**
     * 层次递归遍历N叉树
     * @author liuzhen
     * @date 2021/8/13 16:17
     * @param root
     * @return java.util.List<java.lang.Integer>
     */
    public static void levelOrder(MultiTreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }

        Queue<MultiTreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            MultiTreeNode pollNode = queue.poll();
            list.add(pollNode.value);

            List<MultiTreeNode> children = pollNode.children;
            for (MultiTreeNode childNode : children) {
                queue.offer(childNode);
            }
        }

        return;
    }

    /**
     * test print()
     *                1
     *        100    178     10
     *     99    30
     *
     * @param args
     */
    public static void main(String[] args) {
        // 子节点
        List<MultiTreeNode> c1ChildNodes = new ArrayList<>();
        c1ChildNodes.add(new MultiTreeNode(99));
        c1ChildNodes.add(new MultiTreeNode(30));
        MultiTreeNode c1 = new MultiTreeNode(100, c1ChildNodes);
        // 父节点
        List<MultiTreeNode> headChildNodes = new ArrayList<>();
        headChildNodes.add(c1);
        headChildNodes.add(new MultiTreeNode(178));
        headChildNodes.add(new MultiTreeNode(10));
        MultiTreeNode head = new MultiTreeNode(1, headChildNodes);

        List<Integer> levelOrderList = new ArrayList<>();
        levelOrder(head, levelOrderList);
        System.out.println(levelOrderList);
    }

}
