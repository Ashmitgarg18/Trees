public List<Double> levelOrderSuccessor(TreeNode root, int key) {
        TreeNode result = new ArrayList<>();

        if(root == null){
            return result;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            TreeNode currentNode = queue.poll();
            if(currentNode.left != null){
                queue.offer(currentNode.left);
            }
            if(currentNode.right != null){
                queue.offer(currentNode.right);
            }
            result.add(averageOfLevel);
            if(currentNode.val == key){
                break;
            }
        }
        return queue.peek();
    }