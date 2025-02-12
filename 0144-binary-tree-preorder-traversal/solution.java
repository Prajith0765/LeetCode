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
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new LinkedList<>();
        preOrderTraverse(root, list);
        return list;
    }
    public void preOrderTraverse(TreeNode root, List list){
        if(root == null){
            return;
        }
        list.add(root.val);
        preOrderTraverse(root.left, list);
        preOrderTraverse(root.right, list);
    }
}
