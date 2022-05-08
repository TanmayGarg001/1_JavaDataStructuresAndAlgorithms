package com.company.perfectBinaryTree;

import java.util.Scanner;

public class PerfectBinaryTree {
    //A perfect binary tree is a type of binary tree in which every internal node has exactly two child nodes and all the leaf nodes are at the same level.
    private static final Scanner scanner = new Scanner(System.in);
    Node root;

    public PerfectBinaryTree() {
        root = null;
    }

    public static int depth(Node node) {
        int count = 0;
        while (node != null) {
            count++;
            node = node.left;
        }

        return count;
    }

    public static boolean isPerfect(Node node, int depth, int level) {
        if (node == null) {
            return true;
        }
        if (node.left == null && node.right == null) {
            return depth == level + 1;
        }
        if (node.left == null || node.right == null) {
            return false;
        }
        return isPerfect(node.left, depth, level + 1) && isPerfect(node.right, depth, level + 1);
    }

    public static boolean isPerfect(Node root) {
        int d = depth(root);
        return isPerfect(root, d, 0);
    }

    public static void main(String[] args) {
        Node temp = buildTree();
        System.out.println(isPerfect(temp));
        System.out.println("==========\nInorder:");
        inOrderTraversal(temp);
        System.out.println("==========\nPreorder");
        preOrderTraversal(temp);
        System.out.println("==========\nPostorder");
        postOrderTraversal(temp);
    }

    public static Node buildTree() {
        System.out.println("Enter the data: ");
        int data = scanner.nextInt();
        if (data == -1) {
            return null;
        }
        Node node = new Node(data);
        System.out.println("For the left node of " + data + " : ");
        node.left = buildTree();
        System.out.println("For the right node of " + data + " : ");
        node.right = buildTree();
        return node;
    }

    public static void inOrderTraversal(Node root) {
        if (root == null) {
            return;
        }
        inOrderTraversal(root.left);
        System.out.println(root.data);
        inOrderTraversal(root.right);
    }

    public static void preOrderTraversal(Node root) {
        if (root == null) {
            return;
        }
        System.out.println(root.data);
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }

    public static void postOrderTraversal(Node root) {
        if (root == null) {
            return;
        }
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.println(root.data);
    }
}

class Node {
    Node left;
    Node right;
    int data;

    public Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}