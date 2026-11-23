public class BinaryTree {
	public static void main(String[] args){
		Node root = new Node(5);
		root.left = new Node(2);
		root.right = new Node(8);
		//      5
        //   2    8
        System.out.println(bstSearch(root, 3));
        System.out.println(depth(root));
        root = insert(root, 10); // depth + 1 
        System.out.println(depth(root));
	}
	
	public static Node insert(Node node, int data) {
        if (node == null) {
            return new Node(data);
        }
        if (data < node.data) {
            node.left = insert(node.left, data);
        } else if (data > node.data) {
            node.right = insert(node.right, data);
        }
        return node;
    }

    public static boolean bstSearch(Node node, int target) {
        if (node == null) {
            return false;
        }
        if (node.data == target) {
            return true;
        }
        return (target < node.data) ? bstSearch(node.left, target) : bstSearch(node.right, target);
    }

	public static int depth(Node node){
		if (node == null){
			return 0;
		}
		return 1 + Math.max(depth(node.left), depth(node.right));
	}
}