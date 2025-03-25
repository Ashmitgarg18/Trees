class Solution {
    public boolean isValidBST(TreeNode root) {
        return helper(root, null, null);
    }

    public boolean helper(TreeNode node, Integer low, Integer high){
        if(node == null){
            return true;
        }

        if(low != null && node.val <= low){
            return false;
        }

        if(high != null &&node.val >= high){
            return false;
        }


        return helper(node.left, low, node.val) && helper(node.right, node.val, high);

    }
}