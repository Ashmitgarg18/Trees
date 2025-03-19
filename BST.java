class BST{
	public classs Node{

		private int value;
		private int height;
		private Node left;
		private Node right;


		public Node(int value){
			this.value = value;
		}

		public int getValue(){
			return value;
		}
	}

	private Node root;

	public BST(){

	}

	public int height(Node node){
		if(node == null){
			return -1;
		}

		return node.height;
	}

	public boolean isEmpty(){
		return root == null;
	}


	public void display(){
		display(root, "Root Node: ");
	}

	private void display(Node node, String details){
		if(node == null){
			return;
		}
		System.out.println(details + node.value);
		display(node.left, "Left child of " + node.value + " : ");
		display(node.right, "Right child of " + node.value + " : ");
	}

	public void insert(int value){
		root = insert(value, root);
	}

	private Node insert(int value, Node node){
		if(node == null){
			node = new Node(value);
			return node;
		}

		if(value < node.value){
			node.left = insert(value, node.left);
		}

		if(value > node.value){
			node.right = insert(value, node.right);
		}

		node.height = Math.max(height(node.left), height(node.right)) + 1;
		return node;
	}



}