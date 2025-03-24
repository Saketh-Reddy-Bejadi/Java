package Tutorial;

class Btree {
    Node root;
    class Node{
        int data;
        Node left, right;
        Node(int v){this.data = v;}
    }
    Node createNode(int v){
        Node n= new Node(v);
        n.data=v;
        return n;
    }
    Node InsertNode(Node n,int v){
        
        //using recursion
        if(n==null) return new Node(v);
        if(v<n.data) n.left=InsertNode(n.left,v);
        else if(v>n.data) n.right=InsertNode(n.right,v);
        return n;

        //without using recursion
        // if(n==null) {
        //     root=new Node(v);
        //     return root;
        // }
        // Node cur=n,par=n;
        // while(cur!=null){
        //     par=cur;
        //     if(v<cur.data) cur=cur.left;
        //     else if (v>cur.data)cur=cur.right;
        //     else if (v==cur.data) return root;
        // }
        // if(v<par.data) par.left=new Node(v);
        // else par.right=new Node(v);
    }
    void preorder(Node r){
        if(r==null) return;
        System.out.print(r.data+" ");
        preorder(r.left);
        preorder(r.right);
    }
    void inorder(Node r){
        if(r==null) return;
        inorder(r.left);
        System.out.print(r.data+" ");
        inorder(r.right);
    }
    void postorder(Node r){
        if(r==null) return;
        postorder(r.left);
        postorder(r.right);
        System.out.print(r.data+" ");
    }
}
public class InsertOrder {
    public static void main(String[] args) {
        Btree tree = new Btree();
        tree.root = tree.InsertNode(tree.root, 50);
        tree.InsertNode(tree.root, 30);
        tree.InsertNode(tree.root, 20);
        tree.InsertNode(tree.root, 40);
        tree.InsertNode(tree.root, 70);
        tree.InsertNode(tree.root, 60);
        tree.InsertNode(tree.root, 80);

        System.out.println("Preorder traversal:");
        tree.preorder(tree.root);
        System.out.println();

        System.out.println("Inorder traversal:");
        tree.inorder(tree.root);
        System.out.println();

        System.out.println("Postorder traversal:");
        tree.postorder(tree.root);
        System.out.println();
    }
}