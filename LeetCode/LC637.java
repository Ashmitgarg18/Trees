class Main{
	public static void main(String[] args){

	}

	public List<Double> averageOfLevels(TreeNode root) {
        List<Double> result = new ArrayList<>();

        if(root == null){
            return result;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            int levelSize = queue.size();
            double averageOfLevel = 0;
            for(int i = 0; i < levelSize; i++){
                TreeNode currentNode = queue.poll();
                averageOfLevel = averageOfLevel + currentNode.val;
                if(currentNode.left != null){
                    queue.offer(currentNode.left);
                }
                if(currentNode.right != null){
                    queue.offer(currentNode.right);
                }
            }
            averageOfLevel = averageOfLevel / levelSize;
            result.add(averageOfLevel);
        }

        return result;
    }
}