import java.util.Scanner;

public class BinaryTreeExample {

	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		Scanner in = new Scanner(System.in);

		int userOption;
		do{
		System.out.println(
				"1. Add Manual number"
						+ "\n2. Add Random numebers"
						+ "\n3. Add default numbers [8 7 16 3 5 10 24 4]"
						+ "\n4. Get height of tree."
						+ "\n5. Print order lists");
		userOption =in.nextInt();

		if(userOption==1){
			System.out.println("Add number");
				tree.insertInTree(in.nextInt());
		}

		if(userOption==2){
			System.out.print("Enter number of numbers: ");
			int count = in.nextInt();

			for(int i = 0; i < count; i++){
				int num = (int) (Math.random()*50-1);
				tree.insertInTree(num);
				System.out.print(" "+ num);
			}
		}

		if(userOption==3){		
			System.out.println("");
			tree.insertInTree(8);
			tree.insertInTree(7);
			tree.insertInTree(16);
			tree.insertInTree(3);
			tree.insertInTree(5);
			tree.insertInTree(10);
			tree.insertInTree(24);
			tree.insertInTree(4);
		}
		
		
		if(userOption==4){
			System.out.println(tree.getHeight());
		}
	
		if(userOption==5){
		System.out.print("\nIn Order :\t");
		tree.displayInOrder();
		System.out.println("");

		System.out.print("In pre-order :\t");
		tree.displayPreOrder();
		System.out.println("");

		System.out.print("In post-order :\t");
		tree.displayPostOrder();
		System.out.println("\n");
		}
	
}while(userOption!=9);
}
}