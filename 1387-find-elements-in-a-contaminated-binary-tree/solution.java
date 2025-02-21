/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class FindElements {
    private TreeNode root; 

    public FindElements(TreeNode root) {
        this.root = root;
        recoverTree(root, 0); 
    }

    private void recoverTree(TreeNode node, int value) {
        if (node == null) return;
        node.val = value;
        if (node.left != null) recoverTree(node.left, 2 * value + 1);
        if (node.right != null) recoverTree(node.right, 2 * value + 2);
    }

    public boolean find(int target) {
        return findInTree(root, target);
    }

    private boolean findInTree(TreeNode node, int target) {
        if (node == null) return false;
        if (node.val == target) return true;
        return findInTree(node.left, target) || findInTree(node.right, target);
    }
}
/**
 * Your FindElements object will be instantiated and called as such:
 * FindElements obj = new FindElements(root);
 * boolean param_1 = obj.find(target);
 */
