public class TestBST {
    public static void main(String[] args) {
        //create a BST
        BST<Integer> tree = new BST<>();
        tree.insert(30);
        tree.insert(18);
        tree.insert(15);
        tree.insert(45);
        tree.insert(20);
        tree.insert(30);
        tree.insert(99);
        tree.insert(12);
        tree.insert(17);
        tree.insert(36);
        tree.insert(100);
        tree.insert(70);
        tree.insert(60);
        tree.insert(65);
        //traverse tree
        System.out.println("Inorder (sorted): ");
        tree.inorder();
        System.out.println("The number of nodes is: " + tree.getSize());
        System.out.println("Have 30 in tree?: "+tree.contain(30));//expect true
        System.out.println("Have 30 in tree?: "+tree.contain(15));//expect true
        System.out.println("Have 30 in tree?: "+tree.contain(99));//expect true
        System.out.println("Have 30 in tree?: "+tree.contain(45));//expect true
        System.out.println("Have 30 in tree?: "+tree.contain(33));//expect false
        System.out.println("Have 16 in tree?: "+tree.contain(27));//expect false
//        System.out.println("Pre order soft:");
//        tree.preOrder();
//        System.out.println("Post order soft");
//        tree.postOrder();
        tree.deleteNode(tree.root,30);
        tree.inorder();
    }
}
