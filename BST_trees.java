package com.company;
import java.util.*;
public class BST_trees {
        static class Node{
            int data;
            Node left;
            Node right;

            Node(int data){
                this.data = data;
            }
        }

        public static Node Insert(Node root, int val){
            if (root == null){
                root = new Node(val);
                return root;
            }
            if (root.data > val){
                root.left = Insert(root.left, val);
            }
            else{
                root.right = Insert(root.right,val);
            }
            return root;
        }

        public static boolean search(Node root, int key){
            if (root == null){
                return false;
            }
            else if(root.data > key) {
                return search(root.left, key);
            }
            else if (root.data == key){
                return  true;
            }
            else {
                return search(root.right,key);
            }

        }

        public static void Inorder(Node root){
            if (root == null){
                return;
            }
            Inorder(root.left);
            System.out.print(root.data + " ");
            Inorder(root.right);
        }

        public static Node Delete(Node root, int val){
            if (root.data > val){
                root.left = Delete(root.left,val);
            }
            else if(root.data < val){
                root.right = Delete(root.right,val);
            }
            else {
                // case 1
                if (root.right == null && root.left == null){
                    return null;
                }
                // case 2
                if(root.right == null){
                    return root.left;
                }
                else if (root.left == null){
                    return root.right;
                }
                // case 3
                Node IS = inorderSuccessor(root.right);
                root.data = IS.data;
                root.right = Delete(root.right,IS.data);
            }
            return root;
        }

        public static Node inorderSuccessor(Node root){
            while (root.right != null){
                root = root.left;
            }
            return root;
        }

        public static void printInRange(Node root, int x, int y){
            if (root == null){
                return;
            }
            if (root.data >= x && root.data <= y){
                printInRange(root.left,x,y);
                System.out.print(root.data + " ");
                printInRange(root.right,x,y);
            }
            else if (root.data >= y){
                printInRange(root.left,x,y);
            }
            else {
                printInRange(root.right,x,y);
            }
        }
        public static void printPath(ArrayList<Integer> path){
            for (int i = 0; i< path.size(); i++){
                System.out.print(path.get(i) + "->");
            }
            System.out.println();
        }

        public static void printRoot2Leaf(Node root, ArrayList<Integer>path){
            if (root == null){
                return;
            }
            path.add(root.data);
            if (root.left == null && root.right == null){
                printPath(path);
            }
            else {
                printRoot2Leaf(root.left,path);
                printRoot2Leaf(root.right,path);
            }
            path.remove(path.size() - 1);
        }



    public static void main(String[] args) {
        int values[] = {5,1,3,4,2,7};
        Node root = null;

        for (int i = 0; i<values.length; i++){
            root = Insert(root,values[i]);
        }

        Inorder(root);
        System.out.println();

//        if (search(root,8)){
//            System.out.println("found");
//        }
//        else {
//            System.out.println("not found");
//        }

//        Delete(root,4);
//        Inorder(root);
//        printInRange(root,1,4 );
        printRoot2Leaf(root,new ArrayList<>());



    }
}
