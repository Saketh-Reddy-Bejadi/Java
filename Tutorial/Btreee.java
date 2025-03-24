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
    void inorder(Node n){
        if(n == null) return;
        inorder(n.left);
        System.out.print(n.data + " ");
        inorder(n.right);
    }

}
public class Btreee {
    public static void main(String[] args) {
        Btree tree = new Btree();
        tree.root = tree.createNode(1);
        tree.root.left = tree.createNode(2);
        tree.root.right = tree.createNode(3);
        tree.root.left.left = tree.createNode(4);
        tree.root.left.right = tree.createNode(5);
        tree.root.right.left = tree.createNode(6);
        tree.root.right.right = tree.createNode(7);
        tree.inorder(tree.root);
    }
}