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
        return true; /**element inserted successfully**/

    }

    protected  TreeNode<E> deleteNode(TreeNode<E> current,E value){
        if(current ==null) return current;  /**Empty tree**/
        int compareResult = value.compareTo(current.element);
        if(compareResult>0){current.right = deleteNode(current.right,value);} /**Gọi đệ quy method với right node**/
        else if(compareResult<0){current.left = deleteNode(current.left,value);} /**Gọi đệ quy method với left node**/
        else { //compareResult = 0: tìm thấy value cần xóa trong tree
            if(current.left == null&& current.right==null)return null; /**Biến cần xòa là leaf node**/
            else if(current.left==null)return current.right;  /** biến cần xóa có 1 right subtree **/
            else if(current.right==null)return current.left;  /** biến cần xóa có 1 left subtree **/
            else {
                E min = findMin(current.right);
                current.element=min; /**Gán giá trị current bằng giá trị nhỏ nhất của right subtree **/
                current.right = deleteNode(current.right,min); /**Gọi đệ quy method với right node,**/
            }
        }
        return current;   //?????????
    }

    private E findMin(TreeNode<E> node) {
        while (node.left!=null){
            node = node.left;
        }
        return node.element;

    }

    protected TreeNode<E> createNewNode(E e) {
        return new TreeNode<>(e);
    }
    public boolean contain(E element){
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
        System.out.print(root.element + " ");
        inorder(root.right);
    }
    @Override
    public void postOrder() {
        if (root == null) return;
        inorder(root.left);
        inorder(root.right);
        System.out.println(root.element + " ");
    }
    @Override
    public void preOrder() {
        if (root == null) return;
        System.out.println(root.element + " ");
        inorder(root.left);
        inorder(root.right);

    }


}
