/*
 * Copyright 2018-2020, 上海哈里奥科技有限公司
 * All Right Reserved.
 */

package com.mumu.nowcoder.test;

import com.mumu.common.entity.Node;

import java.util.Stack;

public class Wind1 {

    /**
     * 题目：输入两个递减排序的链表，合并这两个链表并使新链表中的结点仍然是按照递减排序的。
     */

    public static Node nodeSort0(Node head) {
        Stack<Node> stack = new Stack<>();
        Node cur = head;
        while (cur != null) {
            stack.push(cur);
            cur = cur.next;
        }
        Node nodeDesc = null;
        while (!stack.isEmpty()) {
            nodeDesc = stack.pop();
            nodeDesc = nodeDesc.next;
        }
        return nodeDesc;    // 返回降序后的链表
    }

    public static Node nodeSort(Node head) {
        Node cur = head;
        Node pre = null;
        while (cur != null) {
            Node nextNode = cur.next;
            cur.next = pre;
            pre = cur;
            cur = nextNode;
        }
        head = pre;

        return head;    // 返回降序后的链表
    }

    public static Node merge(Node node1, Node node2) {
        Node node11 = node1;
        Node node22 = node2;
        Node help0 = null;

        // 得到头节点
        if (node11.value > node22.value) {
            help0 = node11;
            node11 = node11.next;
        } else {
            help0 = node22;
            node22 = node22.next;
        }

        Node help = help0;
        while (node11 != null && node22 != null) {
            if (node11.value > node22.value) {
                help.next = node11;
                node11 = node11.next;
                help = help.next;
            } else {
                help.next = node22;
                node22 = node22.next;
                help = help.next;
            }
        }
        while (node11 != null && node22 == null) {
            help.next = node11;
            node11 = node11.next;
            help = help.next;
        }
        while (node11 == null && node22 != null) {
            help.next = node22;
            node22 = node22.next;
            help = help.next;
        }

        return help0;
    }

    public static void main(String[] args) {
        Node head1 = null;
        head1 = new Node(1);
        head1.next = new Node(3);
        head1.next.next = new Node(6);
        head1.next.next.next = new Node(9);
        Node node11 = nodeSort(head1);
        node11.print(); // 9 6 3 1

        Node head2 = null;
        head2 = new Node(2);
        head2.next = new Node(4);
        head2.next.next = new Node(5);
        head2.next.next.next = new Node(12);
        head2.next.next.next.next = new Node(19);
        Node node22 = nodeSort(head2);
        node22.print(); //19 12 5 4 2

        System.out.println("------------");
        Node rel = merge(node11, node22);
        rel.print(); //19 12 9 6 5 4 3 2 1

    }
}
