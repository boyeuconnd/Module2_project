public class BST<E extends Comparable<E>> extends AbstractTree<E>{
    protected TreeNode<E> root;
    protected int size = 0;

    public BST() {
    }
    public BST(E[] objects) {
        for (int i = 0; i < objects.length; i++)
            insert(objects[i]);
    }


    @Override
    public boolean insert(E e) {
        if (root == null) //Case 1: empty tree
            root = createNewNode(e); /*create a new root*/
        else { //Case2: non-empty tree
            /*locate the parent node*/
            TreeNode<E> parent = null;
            TreeNode<E> current = root;
            while (current != null) {
                if (e.compareTo(current.element) < 0) {
                    parent = current;
                    current = current.left;
                } else if (e.compareTo(current.element) > 0) {
                    parent = current;
                    current = current.right;
                } else
                    return false; /*Duplicate node not inserted*/
            }
            if (e.compareTo(parent.element) < 0)
                parent.left = createNewNode(e);
            else
                parent.right = createNewNode(e);
        }
        size++;
        return true; /*element inserted successfully*/

    }
    protected TreeNode<E> createNewNode(E e) {
        return new TreeNode<>(e);
    }
    public boolean find(E element){
        TreeNode<E> current = root;
        while (current!=null){
            if(element.compareTo(current.element) <0){
                current = current.left;
            }else if(element.compareTo(current.element)>0){
                current = current.right;
            }else {return true;};
        }
        return false;
    }

    /**
     * Get the number of nodes in the tree
     */
    @Override
    public int getSize() {
        return size;
    }



    @Override
    public void inorder() {
        inorder(root);
    }


    protected void inorder(TreeNode<E> root) {
        if (root == null) return;
        inorder(root.left);
        System.out.println(root.element + " ");
        inorder(root.right);
    }
    protected void portOrder() {
        if (root == null) return;
        inorder(root.left);
        inorder(root.right);
        System.out.println(root.element + " ");
    }
    protected void preOrder() {
        if (root == null) return;
        System.out.println(root.element + " ");
        inorder(root.left);
        inorder(root.right);

    }

}
