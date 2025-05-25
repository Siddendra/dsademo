package binaryseachtree;

public class BinarySearchMain {
    public static void main(String args[]) {
        BinarySearchTree myBST = new BinarySearchTree();
        myBST.insert(2);
        myBST.insert(1);
        myBST.insert(3);
        myBST.insert(47);
        myBST.insert(21);
        myBST.insert(76);
        myBST.insert(18);
        myBST.insert(27);
        myBST.insert(52);
        myBST.insert(82);

        System.out.println("BST contain 27:"+ myBST.contains(27));
        System.out.println("BST contain 100:"+ myBST.contains(100));
    }
}
