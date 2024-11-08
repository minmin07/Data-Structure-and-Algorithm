public class BinarySearchTree {
    Node root;
    Node current;
    Node parent;

    public BinarySearchTree() {

        root = current = parent = null;

    }
    public BinarySearchTree(int [] list){
        root = current = parent = null;
        for (int i = 0; i < list.length; i++) {
            this.insert(list[i]);
        }
    }

    public boolean insert(int value) {
        if (root == null) {

            root = new Node(value);
            return true;

        } else {
            current = root;
            while (current != null) {
                if (value < current.data) {
                    parent = current;
                    current = current.left;
                } else if (value > current.data) {
                    parent = current;
                    current = current.right;

                } else
                    return false;
            }
            if (value < parent.data) {
                parent.left = new Node(value);
            }else
                parent.right = new Node(value);
        }
        return true;

    }
    public void inOrder(){ //printing out inOrder
        traversenInOrder(root);
    }
    private void traversenInOrder(Node node){ //in order
        if (node != null) {
            traversenInOrder(node.left); //traverse left child
            System.out.print(" "+node.data);
            traversenInOrder(node.right);//traverse right child
        }
    }
    public void preOrder(){ //print preOrder
        traversenPreOrder(root);
    }
    private void traversenPreOrder(Node node){ //PreOrder
        if(node != null){
           
            System.out.print(" "+node.data);
            traversenPreOrder(node.left);
            traversenPreOrder(node.right);
        }
        
    }
    public void postOrder(){
        traversenPostOrder(root);
    }
    public void traversenPostOrder(Node node){
        if(node != null){
            traversenPostOrder(node.left);
            traversenPostOrder(node.right);
            System.out.print(" "+node.data);
        }
    }
    public int getHeight(){
        return height(root);
    }
    private int height(Node node){// to find height of the tree
        if(node == null)
            return -1;
        else{
            int leftHeight = height(node.left);
            int rightHeight = height(node.right);

            if(leftHeight > rightHeight){
                return (leftHeight + 1); //since root = null ---> -1
            }else
                return (rightHeight + 1);
        }
    }
    public void breadthFirstTraversal(){
        int h = height(root) + 1;
        for (int i = 0; i < h; i++) {
            printCurrentLevel(root, i);
        }
    }
    public void printCurrentLevel(Node root, int level){
        if (root == null)
            return;
        if(level == 0){
            System.out.print(root.data+" ");
        }else if(level >= 1){
            printCurrentLevel(root.left, level - 1);
            printCurrentLevel(root.right, level - 1);
        }
    }
    
}
