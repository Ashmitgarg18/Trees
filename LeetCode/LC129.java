class Solution {
    public int sumNumbers(TreeNode root) {
        return helper(root, 0);
    }

    int helper(TreeNode node, int sum){
        if(node == null){
            return 0;
        }

        sum = sum * 10 + node.val;

        return helper(node.left, sum) + helper(node.right, sum);
    }
}