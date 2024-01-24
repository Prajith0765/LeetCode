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
    int count = 0;

    public int pseudoPalindromicPaths (TreeNode root) {
        Set<Integer> nodeList = new HashSet<>();
        checkpalindrome(root, nodeList);
        return count;
    }

    public void checkpalindrome(TreeNode root, Set<Integer> nodeList){
        if(root == null){
            return;
        }
        
        if(nodeList.contains(root.val)){
            nodeList.remove(root.val);
        }
        else{
            nodeList.add(root.val);
        }

        if(root.left == null && root.right == null){

            if(nodeList.size() == 0 || nodeList.size() == 1){
                count++;
            }
        }
        
        checkpalindrome(root.left, new HashSet(nodeList));
        checkpalindrome(root.right, new HashSet(nodeList));
    }
}