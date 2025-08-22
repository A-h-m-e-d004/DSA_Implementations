package DSA.TreeImplementation;

public class BinarySearchTree {
	public NodeTree mainRoot;

	public NodeTree insert(NodeTree root, int data){
		if (root == null){
			return new NodeTree(data);
		}
		if (data < root.data){
			root.left = insert(root.left, data);
		} else if (data > root.data) {
			root.right = insert(root.right, data);
		}
		return root;
	}

	public boolean search(NodeTree root, int data){
		if (root == null) return false;
		if (data == root.data) return true;
		if (data < root.data){
			return search(root.left, data);
		}
		else {
			return search(root.right, data);
		}
	}

	public void inorder(NodeTree root){
		if (root != null){
			inorder(root.left);
			System.out.print(root.data + " ");
			inorder(root.right);
		}
	}

	public NodeTree minNode(NodeTree root){
		while (root.left != null) root = root.left;
		return root;
	}

	public NodeTree delete(NodeTree root, int data){
		if (root == null) return null;
		if (data < root.data){
			root.left = delete(root.left, data);
		} else if (data > root.data) {
			root.right = delete(root.right, data);
		}
		else{
			if (root.right == null && root.left == null){
				return null;
			} else if (root.left == null) {
				root = root.right;
			} else if (root.right == null) {
				root = root.left;
			} else {
				NodeTree min = minNode(root.right);
				root.data = min.data;
				root.right = delete(root.right, min.data);
			}

		}
		return root;
	}
}
