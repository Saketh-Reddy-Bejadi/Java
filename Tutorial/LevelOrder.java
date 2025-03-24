package Tutorial;

import java.util.ArrayDeque;

class Btree{
    Node root;
    class Node{
        int data;
        Node left, right;
        Node(int v){this.data = v;}
    }
    Node createNode(int v){
        return new Node(v);
    }
    void insert(int v){
        if(root==null){root=new Node(v); return ;}
        Node cur=root,par=root;
        while(cur!=null){
            par=cur;
            if(v<cur.data) cur=cur.left;
            else if(v>cur.data) cur=cur.right;
            else if(v==cur.data) return;
        }
        if(v<par.data) par.left=new Node(v);
        else par.right=new Node(v);
    }
    void order(Node n,int i){
        if(n==null) return;
        if(i==1) System.out.print(n.data+" ");
        else if(i>1){
            order(n.left,i-1);
            order(n.right,i-1);
        }
    }
    void levelOrder(Node n){
        // if(n==null) return;
        // int h = height(n);
        // for(int i=1;i<=h;i++){
        //     printLevel(n,i);
        // }


        // int h=height(n);
        // for(int i=1;i<h;i++){ order(n,i); }


        //using queue
        ArrayDeque<Node> q = new ArrayDeque<>();
        q.add(n);
        while(!q.isEmpty()){
            Node temp = q.poll();
            System.out.print(temp.data+" ");
            if(temp.left!=null) q.add(temp.left);
            if(temp.right!=null) q.add(temp.right);
        }
    }
    void printLevel(Node n,int l){
        if(n==null) return;
        if(l==1) System.out.print(n.data+" ");
        else if(l>1){
            printLevel(n.left,l-1);
            printLevel(n.right,l-1);
        }
    }
    int height(Node n){
        if(n==null) return 0;
        return Math.max(height(n.left), height(n.right))+1;
    }
}

public class LevelOrder {
    public static void main(String[] args) {
        Btree tree = new Btree();
        tree.root = tree.createNode(1);
        tree.root.left = tree.createNode(2);
        tree.root.right = tree.createNode(3);
        tree.root.left.left = tree.createNode(4);
        tree.root.left.right = tree.createNode(5);
        tree.root.right.left = tree.createNode(6);
        tree.root.right.right = tree.createNode(7);
        tree.levelOrder(tree.root);
    }
}
