
public class BinaryTree {
	BinaryTreeNode root = null;
	
	public void insertInTree (int newData) {
		if (root == null) 
			root = new BinaryTreeNode(newData);
		else root.insert(newData);
		}

////////////////

	//Default Constructors call the initial constructors passing the current root node.
	  public void displayInOrder () {
		  displayInOrder (root);
	  }
	  public void displayPreOrder(){
		  displayPreOrder(root);
	  }
	  public void displayPostOrder(){
		  displayPostOrder(root);
	  }
	  
////////////////////////////////////////////////////////////////////////////////	  
	  public int getHeight(){
		  return this.getHeight(root);
	  }
////////////////////////////////////////////////////////////////////////////////	  
	  public int getHeight(BinaryTreeNode node) {
	    	if (node == null){
	    		return 0;
	    	}else
	    		
	    	return Math.max(getHeight(node.getLeft())+1, getHeight(node.getRight())+1);
	    }
////////////////////////////////////////////////////////////////////////////////	  
	  
	  
	  public void displayInOrder (BinaryTreeNode subRoot){
			if (subRoot == null)   return;
			displayInOrder (subRoot.getLeft());
			System.out.print(" " + subRoot.getData() + " ");
			displayInOrder (subRoot.getRight());

	  }

	  private void displayPostOrder(BinaryTreeNode subRoot) {
		if(subRoot==null) return;
		displayPostOrder(subRoot.getLeft());
		displayPostOrder(subRoot.getRight());
		System.out.print(" "+subRoot.getData()+" ");
	}


	private void displayPreOrder(BinaryTreeNode subRoot) {
		if(subRoot==null) return;
		System.out.print(" " + subRoot.getData() + " ");
		displayPreOrder(subRoot.getLeft());
		displayPreOrder(subRoot.getRight());
	}

}
