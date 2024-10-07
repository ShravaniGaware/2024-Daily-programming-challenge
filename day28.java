class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    
    TreeNode() {}
    
    TreeNode(int val) { 
        this.val = val; 
    }
    
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class day28 {
    
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true; 
        return isMirror(root.left, root.right); 
    }
    
    
    private boolean isMirror(TreeNode left, TreeNode right) {
      
        if (left == null && right == null) return true;
        
       
        if (left == null || right == null) return false;
        
      
        return (left.val == right.val) &&
               isMirror(left.left, right.right) &&
               isMirror(left.right, right.left);
    }
    
    public static void main(String[] args) {
        
        TreeNode tree = new TreeNode(1);
        tree.left = new TreeNode(2);
        tree.right = new TreeNode(2);
        tree.left.left = new TreeNode(3);
        tree.left.right = new TreeNode(4);
        tree.right.left = new TreeNode(4);
        tree.right.right = new TreeNode(3);
        
        day28 symmetricTree = new day28();
        boolean result = symmetricTree.isSymmetric(tree);
        System.out.println(result);  
    }
}
