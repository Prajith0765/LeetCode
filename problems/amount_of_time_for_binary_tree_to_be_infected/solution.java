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
    int max;
    public int amountOfTime(TreeNode root, int start) {
        max = 0;
        solution(root, start);
        return max;
    }
    
    class Pair{
        boolean f;
        int x;
        Pair(boolean f, int x){
            this.f = f;
            this.x = x;
        }
    }
    public Pair solution(TreeNode root, int start){
        if(root == null) 
        return new Pair(false,0);

        Pair left = solution(root.left, start);
        Pair right = solution(root.right, start);
        if(root.val == start){
            max = Math.max(max, Math.max(left.x, right.x));
            return new Pair(true,1);
        }
        if(left.f){
            max = Math.max(max, left.x + right.x);
            left.x += 1;
            return left;
        }
        else if(right.f){
            max = Math.max(max, left.x + right.x);
            right.x += 1;
            return right;
        }
        return new Pair(false, Math.max(left.x, right.x)+1);
    }
}