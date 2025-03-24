package Tutorial;

class Btree {
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
    int height(Node n){
        if(n==null) return 0;
        return Integer.max(height(n.left),height(n.right));
    }

}

public class TreeHeight {
    
}
