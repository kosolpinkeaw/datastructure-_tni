
public class TreeApp {

	public static void main(String[] args) {
	System.out.println("-----------------------------");
	System.out.println("Binary tree from createTreel()");
	System.out.println("-----------------------------");
	        BinaryTree tree = new BinaryTree();

	        tree.createTree3();

	        tree.printTree(tree.getRoot(), 0);
	    }
	}
