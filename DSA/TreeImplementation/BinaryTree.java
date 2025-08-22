package DSA.TreeImplementation;

public class BinaryTree {
	public NodeTree root;

	public void inorder(NodeTree node){
		if (node != null){
			inorder(node.left);
			System.out.print(node.data + " ");
			inorder(node.right);
		}
	}

	public void preorder(NodeTree node){
		if (node != null){
			System.out.print(node.data + " ");
			preorder(node.left);
			preorder(node.right);
		}
	}

	public void postorder(NodeTree node){
		if (node != null){
			postorder(node.left);
			postorder(node.right);
			System.out.print(node.data + " ");
		}
	}
}
