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

    int ans = 0;
    int sum = 0;
    int count = 0;

    public void helper(TreeNode root) {

        if (root == null)
            return;

        count = 0;
        sum = findSum(root);

        int avg = sum / count;

        if (root.val == avg) {
            ans++;
        }

        helper(root.left);
        helper(root.right);
    }

    public int findSum(TreeNode root) {

        if (root == null)
            return 0;

        count++;

        int lsum = findSum(root.left);
        int rsum = findSum(root.right);

        return lsum + rsum + root.val;
    }

    public int averageOfSubtree(TreeNode root) {
        helper(root);
        return ans;
    }
}