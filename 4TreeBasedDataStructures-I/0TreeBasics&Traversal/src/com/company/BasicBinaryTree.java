package com.company;

import java.util.Scanner;

public class BasicBinaryTree {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Node temp = buildBinaryTree();
        System.out.println("========");

        System.out.println("Inorder = ");
        System.out.println("========");
        inOrderTraversal(temp);
        System.out.println("========");

        System.out.println("Preorder = ");
        System.out.println("========");
        preOrderTraversal(temp);
        System.out.println("========");

        System.out.println("Postorder = ");
        System.out.println("========");
        postOrderTraversal(temp);
        System.out.println("========");

    }

    public static Node buildBinaryTree() {
        System.out.print("Enter the data: ");
        int data = scanner.nextInt();
        if (data == -1) {
            return null;
        }
        Node root = new Node(data);
        System.out.println("For the left node of " + data + ",");
        root.left = buildBinaryTree();
        System.out.println("For the right node of " + data + ",");
        root.right = buildBinaryTree();
        return root;
    }

    public static void inOrderTraversal(Node node) {
        if (node == null) {
            return;
        } else {
            inOrderTraversal(node.left);
            System.out.println(node.data);
            inOrderTraversal(node.right);
        }
    }

    public static void postOrderTraversal(Node node) {
        if (node == null) {
            return;
        } else {
            postOrderTraversal(node.left);
            postOrderTraversal(node.right);
            System.out.println(node.data);

        }
    }

    public static void preOrderTraversal(Node node) {
        if (node == null) {
            return;
        } else {
            System.out.println(node.data);
            preOrderTraversal(node.left);
            preOrderTraversal(node.right);
        }
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