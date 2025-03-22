class Main{
    public static void main(String[] args){

    }

    public Node connect(Node root) {
        Node leftMostNode = root;
        while(leftMostNode.next != null){
            Node current = leftMostNode;
            current.left.next = current.right;
            if(current.next != null){
                current.right.next = current.next.left; 
            }
            current = current.next;
        }
        if(leftMostNode.left != null){
            leftMostNode = leftMostNode.left;
        }

        return root;
    }
}