class Solution {
    public void flatten(TreeNode root) {
        if (root == null) return;

        Queue<TreeNode> queue = new LinkedList<>();
        preorder(root, queue);

        TreeNode prev = queue.poll();
        while (!queue.isEmpty()) {
            TreeNode curr = queue.poll();
            prev.left = null;
            prev.right = curr;
            prev = curr;
        }
    }

    private void preorder(TreeNode node, Queue<TreeNode> queue) {
        if (node == null) return;

        queue.offer(node);
        preorder(node.left, queue);
        preorder(node.right, queue);   
    }
}


class Solution {
    public void flatten(TreeNode root){
        TreeNode current = root;
        while(current != null){
            if(current.left != null){
                TreeNode temp = current.left;
                while(temp.right != null){
                    temp = temp.right;
                }

                temp.right = current.right;
                current.right = current.left;
                current.left = null;
            }
            current = current.right;
        }

    }
}    