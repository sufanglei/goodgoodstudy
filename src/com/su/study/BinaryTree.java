package com.su.study;

/**
 * Created by Administrator on 2015/9/22.
 */
public class BinaryTree {
    public static void preorder(Nodes node){
        if(node != null) {
            System.out.println("This is Node" + node.getId());
            preorder(node.getLeftsubtree());
            preorder(node.getRightsubtree());
        }
    }
    public static void main(String args[]) {
        Nodes n4 = new Nodes(4);
        Nodes n5 = new Nodes(5);
        Nodes n6 = new Nodes(6);
        Nodes n7 = new Nodes(7);
        Nodes n2 = new Nodes(2,n4,n5);
        Nodes n3 = new Nodes(3,n6,n7);
        Nodes n1 = new Nodes(1,n2,n3);
        preorder(n1);

    }
}

class Nodes {
    private int id;
    private Nodes leftsubtree;
    private Nodes rightsubtree;

    public Nodes(int id){
        this.id = id;
    }
    public Nodes(int id, Nodes left, Nodes right){
        this.id = id;
        this.leftsubtree = left;
        this.rightsubtree = right;
    }
    public void setId(int id) {
        this.id =  id;
    }
    public int getId() {
        return id;
    }
    public void setLeftsubtree(Nodes leftsubtree) {
        this.leftsubtree = leftsubtree;
    }
    public void setRightsubtree(Nodes rightsubtree) {
        this.rightsubtree = rightsubtree;
    }
    public Nodes getLeftsubtree() {
        return leftsubtree;
    }
    public Nodes getRightsubtree() {
        return rightsubtree;
    }
}