class Main{
    public static void main(String[] args){

    }

        public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
            List<List<Integer>> result = new ArrayList<>();

            if(root == null){
                return result;
            }

            Queue<TreeNode> queue = new LinkedList<>();
            queue.offer(root);
            int level = 0;
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
                if(level%2==0){
                    result.add(Collections.reverse(currentLevelList));
                }
                else{
                    result.add(currentLevelList);
                }
                level++;
            }
            return result;
        }
}