class Main{
	public static void main(String[] args){

	}

	public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();

        if(root == null){
        	return result;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
        	int levelSize = queue.size();
        	List<Integer> currentLevelList = new ArrayList<>();
        	for(int i = 0; i < levelSize; i++){
        		TreeNode currentNode = queue.poll();
        		currentLevelList.add(currentNode.val);
        		if(currentNode.left != null){
        			queue.offer(currentNode.left);
        		}
        		if(currentNode.right != null){
        			queue.offer(currentNode.right);
        		}
        	}
        	result.add(currentLevelList);
        }

        return result;
    }
}