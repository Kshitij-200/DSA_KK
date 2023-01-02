package com.company;
import java.util.*;
public class trees {

    static  class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static  class BinaryTree{
        static int idx = -1;
        public static  Node  buildTree(int[] nodes){
            idx++;
            if (nodes[idx] == -1){
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }
    }

    public static void Preorder(Node root){
        if (root == null){
            return ;
        }
        System.out.print(root.data + " ");
        Preorder(root.left);
        Preorder(root.right);
    }

    public static void Inorder(Node root){
        if (root == null){
            return;
        }
        Inorder(root.left);
        System.out.print(root.data + " ");
        Inorder(root.right);
    }

    public static void Postorder(Node root){
        if (root == null){
            return;
        }
        Postorder(root.left);
        Postorder(root.right);
        System.out.print(root.data + " ");
    }

    public static void levelOrder(Node root){
        if (root == null){
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while (!q.isEmpty()){
            Node currenNode = q.remove();
            if (currenNode == null) {
                System.out.println(" ");

                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            }
            else {
                System.out.println(currenNode.data + " ");
                if (currenNode.left != null){
                    q.add(currenNode.left);
                }
                if (currenNode.right != null){
                    q.add(currenNode.right);
                }
            }
        }
    }

    public static int countNumberOfNodes(Node root){
        if (root == null){
            return 0;
        }
        int left = countNumberOfNodes(root.left);
        int right = countNumberOfNodes(root.right);

        return left + right + 1;
    }

    public static int sumOfNodes(Node root){
        if (root == null){
            return 0;
        }
        int leftSum = sumOfNodes(root.left);
        int rightSum = sumOfNodes(root.right);
        return leftSum + rightSum + root.data;
    }

    public static int height(Node root){
        if (root == null){
            return 0;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        int myHeight = Math.max(leftHeight,rightHeight) + 1;
        return myHeight;
    }
      // APPORACH OF TIME COMPLEXITY O(N^2);
//    public static int Diameter(Node root){
//        if (root == null){
//            return 0;
//        }
//        int dia1 = Diameter(root.left);
//        int dia2 = Diameter(root.right);
//        int dia3 = height(root.right) + height(root.left) + 1;
//
//        return Math.max(dia3, Math.max(dia1,dia2));
//    }

    static class treeInfo{
        int ht;
        int dia;

        treeInfo(int ht, int dia){
            this.ht = ht;
            this.dia = dia;
        }
    }

    public static treeInfo Diameter(Node root){
        if (root == null){
            return new treeInfo(0,0);
        }
        treeInfo left = Diameter(root.left);
        treeInfo right = Diameter(root.right);

        int myheight = Math.max(left.ht,right.ht);
         int diam1 = left.dia;
         int diam2 = right.dia;
         int diam3 = left.ht + right.ht + 1;

         int myDia = Math.max(Math.max(diam1,diam2), diam3);

         treeInfo tree = new treeInfo(myheight,myDia);
         return tree;
    }

    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};

        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
//        System.out.println(root.data);
//        Preorder(root);
//        Postorder(root);
//        Inorder(root);
//        levelOrder(root);
        System.out.println(countNumberOfNodes(root));
        System.out.println(sumOfNodes(root));
        System.out.println(height(root));
//        System.out.println(Diameter(root));
//        System.out.println(Diameter(root).dia);
    }
}
