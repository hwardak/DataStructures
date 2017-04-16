
public class BinarySearchAlgorithm {
	
	public void binarySearch(int x){
		int key = x;
		int low = 0;
		int high= BinarySearchMain.array.length-1;
		int middle = (high + low)/2 + 1;
		int index = -1;

		do{
			if(key == BinarySearchMain.array[middle]){
				index = middle;
				
				System.out.print("\"" + key + "\" found at index(es) [" + index + "]");
				
				while(BinarySearchMain.array[--index] == key){
					System.out.print(" [" + index + "]");
				}
				index = middle;
				
				while(BinarySearchMain.array[++index] == key){
					System.out.print(" [" + index + "]");
				}
				System.out.println();
				index = middle;

			}
			else if(key < BinarySearchMain.array[middle]){
				high = middle -1;
				System.out.println("in the lower half");
			}
			else  {
				low = middle + 1; 
				System.out.println("in the upper half");
			}

			middle = (high + low)/2 + 1;	

		}while((low < high) && index == -1);
		if(index == -1) System.out.println(key + " not found in array :(");

	}

}
