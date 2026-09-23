public class BSTApp {

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

        tree.sampleTree1();
        tree.printTree(tree.getRoot(), 0);

        System.out.println("\nMinimum Node is " + tree.findMinimum(tree.getRoot()).data);
        System.out.println("Maximum Node is " + tree.findMaximum(tree.getRoot()).data);
        int delNode = 60;

        tree.searchDeleteNode(delNode);
        System.out.println("Is [" + delNode + "] in BST => "
                + tree.findSpecificData(delNode));
        System.out.println("Parent = " + tree.getParent().data);
        System.out.println("Delete Node is = " + tree.getDeleteNode().data);
		tree.printTree(tree.getRoot(), 0);
		tree.Delete(delNode);
    }

}

    
