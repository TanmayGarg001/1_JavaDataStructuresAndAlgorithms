package com.company.completeBinaryTree;

import java.util.Scanner;

public class CompleteBinaryTree {
    //A complete binary tree is a binary tree in which all the levels are completely filled except possibly the lowest one, which is filled from the left.
    //A complete binary tree is just like a full binary tree, but with two major differences
    //All the leaf elements must lean towards the left.
    //The last leaf element might not have a right sibling i.e. a complete binary tree doesn't have to be a full binary tree.
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Node temp = buildTree();
        inOrderTraversal(temp);
        System.out.println(isComplete(temp,0,countNumberOfNodes(temp)));
    }

    public static boolean isComplete(Node node, int index, int numberOfNodes) {
        if (node == null) {
            return true;
        }
        if (index >= numberOfNodes) {
            return false;
        }
        return isComplete(node.left, 2 * index + 1, numberOfNodes) && isComplete(node.right, 2 * index + 2, numberOfNodes);
    }

    public static void inOrderTraversal(Node root) {
        if (root == null) {
            return;
        }
        inOrderTraversal(root.left);
        System.out.println(root.data);
        inOrderTraversal(root.right);
    }

    public static Node buildTree() {
        System.out.print("Enter the data : ");
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

    public static int countNumberOfNodes(Node root) {
        if (root == null) {
            return 0;
        }
        return (1 + countNumberOfNodes(root.left) + countNumberOfNodes(root.right));
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
