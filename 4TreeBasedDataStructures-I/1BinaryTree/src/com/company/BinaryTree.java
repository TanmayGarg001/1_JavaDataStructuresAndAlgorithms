package com.company;

import java.util.Scanner;

public class BinaryTree {
    private final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Node temp = buildBinaryTree();
        System.out.println("================");
        System.out.println("inOrderTraversal : \n");
        inOrderTraversal(temp);
        System.out.println("================");
        System.out.println("preOrderTraversal : \n");
        preOrderTraversal(temp);
        System.out.println("================");
        System.out.println("postOrderTraversal : \n");
        postOrderTraversal(temp);
    }

    public static Node buildBinaryTree() {
        System.out.print("Enter the data: ");
        int data = scanner.nextInt();
        if (data == -1) {
            return null;
        }
        Node node = new Node(data);
        System.out.println("For the left node of " + data + ": ");
        node.left = buildBinaryTree();

        System.out.println("For the right node of " + data + ": ");
        node.right = buildBinaryTree();
        return node;
    }

    public static void inOrderTraversal(Node root) {
        if (root == null) {
            return;
        } else {
            inOrderTraversal(root.left);
            System.out.println(root.data);
            inOrderTraversal(root.right);
        }
    }

    public static void preOrderTraversal(Node root) {
        if (root == null) {
            return;
        } else {
            System.out.println(root.data);
            preOrderTraversal(root.left);
            preOrderTraversal(root.right);
        }
    }

    public static void postOrderTraversal(Node root) {
        if (root == null) {
            return;
        } else {
            postOrderTraversal(root.left);
            postOrderTraversal(root.right);
            System.out.println(root.data);
        }
    }
}

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

