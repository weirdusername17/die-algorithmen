public class BinaryTree {
	public static void main(String[] args){
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		//      1
        //   2    3
        System.out.println(search(root, 3));
        System.out.println(depth(root));
	}

	public static boolean search(Node node, int target){
		if (node == null){
			return false;
		}
		if (node.data == target){
			return true;
		}
		return search(node.left, target) || search(node.right, target);
	}

	public static int depth(Node node){
		if (node == null){
			return 0;
		}
		return 1 + max(depth(node.left), depth(node.right));
	}
	public static int max(int a, int b){
		return (a > b) ? a : b; 
	}
}