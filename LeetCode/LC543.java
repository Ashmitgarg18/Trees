class Solution {
    int maxNoOfNodesAlongAPath = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return maxNoOfNodesAlongAPath - 1;
    }

    int height(TreeNode node) {
        if (node == null) {
            return 0;
        }

        int leftHeight = height(node.left);
        int rightHeight = height(node.right);

        int noOfNodes = leftHeight + rightHeight + 1;
        maxNoOfNodesAlongAPath = Math.max(maxNoOfNodesAlongAPath, noOfNodes);

        return Math.max(leftHeight, rightHeight) + 1;
    }
}