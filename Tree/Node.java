public class Node {
    int data;
    Node left;
    Node right;

    public Node(int value) {
        data = value;
        left = null;
        right = null;
    }
    public void setData(int newVal){
        data = newVal;
    }
    public int getData(){
        return data;
    }
    public void setLeft(Node newL){
        left = newL;
    }
    public Node getLeft(){
        return left;
    }
    public void setRight(Node newR){
        left = newR;
    }
    public Node getRight(){
        return right;
    }
}
