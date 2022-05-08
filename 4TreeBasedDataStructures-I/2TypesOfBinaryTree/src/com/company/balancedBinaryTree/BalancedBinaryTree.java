package com.company.balancedBinaryTree;

import java.util.Scanner;

public class BalancedBinaryTree {
    private static final Scanner scanner = new Scanner(System.in);
    Node root;

    public static void main(String[] args) {
        BalancedBinaryTree balancedBinaryTree = new BalancedBinaryTree();
        Node temp = balancedBinaryTree.buildTree();
        balancedBinaryTree.inOrderTraversal(temp);
    }

    public void inOrderTraversal(Node root) {
        if (root == null) {
            return;
        }
        inOrderTraversal(root.left);
        System.out.println(root.data);
        inOrderTraversal(root.right);
    }

    public Node buildTree() {
        System.out.println("Enter the data: ");
        int data = scanner.nextInt();

        if (data == -1) {
            return null;
        }
        Node node = new Node(data);
        System.out.println("For the left node of " + data + " ,");
        node.left = buildTree();
        System.out.println("For the right node of " + data + " ,");
        node.right = buildTree();

        return node;
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
