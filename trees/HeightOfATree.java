class TreeNode{
    int val;
    TreeNode left, right;

    public TreeNode(int x){
        val = x;
        left = right = null;
    }
}

class BinaryTree{
    TreeNode root;

    public int maxDepth(TreeNode node){
        if(node == null){
            return 0;
        }

        int lDepth = maxDepth(node.left);
        int rDepth = maxDepth(node.right);

        return Math.max(lDepth, rDepth) + 1;
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new TreeNode(1);
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(3);
        tree.root.left.right = new TreeNode(4);

        System.out.println(tree.maxDepth(tree.root));
    }
}