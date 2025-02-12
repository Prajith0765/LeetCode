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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new LinkedList<>();
        postOrderTraverse(root, list);
        return list;
    }

    public void postOrderTraverse(TreeNode root, List list){
        if(root == null){
            return;
        }
        postOrderTraverse(root.left, list);
        postOrderTraverse(root.right, list);
        list.add(root.val);
    }
}
