class TreeNode{
    int value;
    TreeNode left, right;

    public TreeNode(int x){
        value = x;
        left=right=null;
    }
}

class TwoTreesAreIdentical{
    public Boolean isIdentical(TreeNode root1, TreeNode root2){
        if(root1 == null && root2==null){
            return true;
        }

        if(root1 == null || root2 == null){
            return false;
        }

        return (root1.value == root2.value &&
                isIdentical(root1.left, root2.left) &&
                isIdentical(root1.right, root2.right));

    }

    public static void main(String[] args) {
        TwoTreesAreIdentical tree = new TwoTreesAreIdentical();

      TreeNode root1 = new TreeNode(1);
      root1.left = new TreeNode(2);
      root1.right = new TreeNode(3);

      TreeNode root2 = new TreeNode(1);
      root2.left = new TreeNode(2);
      root2.right = new TreeNode(3);

      System.out.println(tree.isIdentical(root1,root2));
    }
}