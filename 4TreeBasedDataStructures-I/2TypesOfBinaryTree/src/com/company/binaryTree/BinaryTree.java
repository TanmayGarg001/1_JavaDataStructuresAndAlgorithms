package com.company.binaryTree;

import java.util.Scanner;

public class BinaryTree {
    //A binary tree is a tree data structure in which each parent node can have at most two children.
    private static final Scanner scanner = new Scanner(System.in);
    Node root;

    public BinaryTree() {
        root = null;
    }

    public static void main(String[] args) {
        Node temp = buildBinaryTree();
        inOrderTraversal(temp);
        System.out.println("===============");
        preOrderTraversal(temp);
        System.out.println("===============");
        postOrderTraversal(temp);
        System.out.println("===============");
    }

    public static Node buildBinaryTree() {
        System.out.print("Enter the data: ");
        int data = scanner.nextInt();
        if (data == -1) {
            return null;
        }
        Node node = new Node(data);
        System.out.println("For the left node of " + data + " : ");
        node.left = buildBinaryTree();
        System.out.println("For the right node of " + data + " : ");
        node.right = buildBinaryTree();

        return node;
    }

    public static void inOrderTraversal(Node node) {
        if (node == null) {
            return;
        }
        inOrderTraversal(node.left);
        System.out.println(node.data);
        inOrderTraversal(node.right);
    }

    public static void preOrderTraversal(Node node) {
        if (node == null) {
            return;
        }
        System.out.println(node.data);
        inOrderTraversal(node.left);
        inOrderTraversal(node.right);
    }

    public static void postOrderTraversal(Node node) {
        if (node == null) {
            return;
        }
        inOrderTraversal(node.left);
        inOrderTraversal(node.right);
        System.out.println(node.data);
    }
}

class Node {
    Node left;
    Node right;
    int data;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}