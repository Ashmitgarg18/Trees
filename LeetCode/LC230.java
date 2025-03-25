class Solution {
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> list = new ArrayList<>();
        populateInOrder(root, list);
        return list.get(k - 1);
    }

    private void populateInOrder(TreeNode node, List<Integer> list){
        if(node == null){
            return;
        }

        populateInOrder(node.left, list);
        list.add(node.val);
        populateInOrder(node.right, list);
    }
}


class Solution {
    int count = 0;

    public int kthSmallest(TreeNode root, int k) {
        return helper(root, k).val;
    }
    
    public TreeNode helper(TreeNode root, int k) {
        if(root == null){
            return null;
        }

        TreeNode left = helper(root.left, k);
        if(left != null){
            return left;
        }

        count++;

        if(count == k){
            return root;
        }

        return helper(root.right, k);
    }
}