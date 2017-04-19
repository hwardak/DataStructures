
public class BinaryTreeNode {
	
	//Each tree node has a 3 references 
	private int data;				// One reference to the data.
	//Self-referential references
	private BinaryTreeNode left;	// One reference to the left branch node. 
	private BinaryTreeNode right;	// One reference to the right branch node.
	
	
	//Default constructor will instantiate all of this node's reference to the null.
	public BinaryTreeNode() {
		left = null;   right = null; data = 0;
	}
	//The initial constructor will set up a leaf that has no subnodes, but has data.
	public BinaryTreeNode(int data) {
		left = null;   right = null; this.data = data;
		
	}
	public int getData() {
		return data;
	}
	public BinaryTreeNode getLeft() {
		return left;
	}
	public BinaryTreeNode getRight() {
		return right;
	}
	
	
	//
	public void insert (int newData) {
		if (newData  <  data) {
			if (left == null)
				left = new BinaryTreeNode(newData);
			else left.insert(newData);
		} else if (newData >  data) {
			if (right == null)
				right = new BinaryTreeNode(newData);
			else right.insert(newData);
		} else 
			System.out.println();
//	         System.out.println("Duplicate. Not adding " + newData);
	}
}
