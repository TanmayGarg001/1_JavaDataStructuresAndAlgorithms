package com.company.fullBinaryTree;

import java.util.Scanner;

public class FullBinaryTree {
    //A full Binary tree is a special type of binary tree in which every parent node/internal node has either two or no children.
    //It is also known as a proper binary tree.
    private static final Scanner scanner = new Scanner(System.in);
    Node root;

    public FullBinaryTree() {
        root = null;
    }

    public static void main(String[] args) {
        Node tree = buildFullBinaryTree();
        inOrderTraversal(tree);
        preOrderTraversal(tree);
        postOrderTraversal(tree);
        System.out.println(isFullBinaryTree(tree));
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
        preOrderTraversal(node.left);
        preOrderTraversal(node.right);
    }

    public static void postOrderTraversal(Node node) {
        if (node == null) {
            return;
        }
        postOrderTraversal(node.left);
        postOrderTraversal(node.right);
        System.out.println(node.data);
    }

    public static Node buildFullBinaryTree() {
        System.out.print("Enter the data: ");
        int data = scanner.nextInt();
        if (data == -1) {
            return null;
        }
        Node node = new Node(data);
        System.out.println("For the left node of " + data + " :");
        node.left = buildFullBinaryTree();
        System.out.println("For the right node of " + data + " :");
        node.right = buildFullBinaryTree();
        return node;
    }

    public static boolean isFullBinaryTree(Node node) {
        if (node == null) {
            return true;
        }
        if ((node.left == null) && (node.right == null)) {
            return true;
        }
        if ((node.left != null) && (node.right != null)) {
            return isFullBinaryTree(node.left) && isFullBinaryTree(node.right);
        }
        return false;
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


