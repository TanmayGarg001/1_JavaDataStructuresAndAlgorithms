package com.company;

public class BasicTree {

    Node root;

    public BasicTree() {
        root = null;
    }

    public static void main(String[] args) {
        BasicTree basicTree = new BasicTree();
        basicTree.root = new Node(8);
        basicTree.root.left = new Node(213);
        basicTree.root.right = new Node(903);
        basicTree.root.left.left = new Node(413);
        basicTree.root.left.right = new Node(33);

        basicTree.inOrderTraversal(basicTree.root);
    }

    public void inOrderTraversal(Node node) {
        if (node != null) {
            inOrderTraversal(node.left);
            System.out.println(node.data);
            inOrderTraversal(node.right);
        }
    }

    public void preOrderTraversal(Node node) {
        if (node != null) {
            System.out.println(node.data);
            inOrderTraversal(node.left);
            inOrderTraversal(node.right);
        }
    }

    public void postOrderTraversal(Node node) {
        if (node != null) {
            inOrderTraversal(node.left);
            inOrderTraversal(node.right);
            System.out.println(node.data);
        }
    }

    public static class Node {
        Node left;
        Node right;
        int data;

        public Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

}
