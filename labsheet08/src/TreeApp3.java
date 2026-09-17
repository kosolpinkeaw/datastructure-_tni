public class TreeApp3 {
 
	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		tree.createTree4();
		tree.printTree(tree.getRoot(), 0);
		
		System.out.println();
		tree.searchDeleteNode(14);
		System.out.println(tree.getDeleteNode().data);
		System.out.println(tree.getParent().data);
		
		System.out.println("----------------------------------------------");
		
		int target = 14;
		tree.delete(target);
		tree.printTree(tree.getRoot(),0);
		
		System.out.println("----------------------------------------------");
 

		BinaryTree tree1 = new BinaryTree();
		tree1.createTree5();
 
		System.out.println("\nDelete leaf node: 25");
		System.out.println("Before:");
		tree1.printTree(tree1.getRoot(), 0);
 
		tree1.delete(25);
 
		System.out.println("After:");
		tree1.printTree(tree1.getRoot(), 0);
 

		BinaryTree tree2 = new BinaryTree();
		tree2.createTree5();
 
		System.out.println("\nDelete node with one child: 70");
		System.out.println("Before:");
		tree2.printTree(tree2.getRoot(), 0);
 
		tree2.delete(70);
 
		System.out.println("After:");
		tree2.printTree(tree2.getRoot(), 0);
 

		BinaryTree tree3 = new BinaryTree();
		tree3.createTree5();
 
		System.out.println("\nDelete node with two children: 30");
		System.out.println("Before:");
		tree3.printTree(tree3.getRoot(), 0);
 
		tree3.delete(30);
 
		System.out.println("After:");
		tree3.printTree(tree3.getRoot(), 0);
 
 
	}
 
}