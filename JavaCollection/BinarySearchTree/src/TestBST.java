public class TestBST {
    public static void main(String[] args) {
        //create a BST
        BST<Integer> tree = new BST<>();
        tree.insert(30);
        tree.insert(20);
        tree.insert(15);
        tree.insert(45);
        tree.insert(18);
        tree.insert(50);
        tree.insert(99);
        //traverse tree
        System.out.println("Inorder (sorted): ");
        tree.inorder();
        System.out.println("The number of nodes is: " + tree.getSize());
        System.out.println("Have 30 in tree?: "+tree.find(30));//expect true
        System.out.println("Have 30 in tree?: "+tree.find(15));//expect true
        System.out.println("Have 30 in tree?: "+tree.find(99));//expect true
        System.out.println("Have 30 in tree?: "+tree.find(45));//expect true
        System.out.println("Have 30 in tree?: "+tree.find(33));//expect false
        System.out.println("Have 16 in tree?: "+tree.find(27));//expect false
    }
}
