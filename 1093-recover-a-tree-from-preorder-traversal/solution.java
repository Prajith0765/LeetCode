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
    private String s;
    private int index, level;
    public TreeNode recoverFromPreorder(String traversal) {
        this.s = traversal;
        this.index = 0;
        this.level = 0;
        TreeNode node = new TreeNode(-1);
        this.helper(node, 0);
        return node.left;
    }

    private void helper(TreeNode root, int lvl){
        while(this.index < this.s.length() && lvl == level){
            int num = 0;
            while(this.index < this.s.length() && Character.isDigit(this.s.charAt(this.index)))
            {
                num = num * 10 + (this.s.charAt(this.index++) - '0');
            }
            TreeNode node = new TreeNode(num);
            if(root.left == null){
                root.left = node;
            }
            else{
                root.right = node;
            }
            this.level = 0;
            while(this.index < this.s.length() && this.s.charAt(this.index) == '-'){
                this.level++;
                this.index++;
            }
            this.helper(node, lvl + 1);
        }
    }
}
