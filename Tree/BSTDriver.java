
public class BSTDriver {
    public static void main(String[] args) {

        int []arr = {64, 50, 45, 56, 70, 68, 86};

        BinarySearchTree mytree = new BinarySearchTree(arr);
        System.out.print("InOrder: "); mytree.inOrder();
        System.out.println();
        System.out.print("PreOrder: ");mytree.preOrder();
        System.out.println();
        System.out.print("PostOrder: ");mytree.postOrder();
        System.out.println();
        System.out.println("height : "+mytree.getHeight());
        System.out.println("Breadth of first Traverse: ");
        mytree.breadthFirstTraversal();
        System.out.println();

    }
}
