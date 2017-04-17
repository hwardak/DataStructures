import java.util.Random;
import java.util.Scanner;

/**
 * BinarySearchMain is the user interface to implement and demo the Binary Search Algorithm.
 * An Interger[] of size 100 is initialized, values (0 -50) are randomly instantiated, the 
 * array is sorted, and made available for a Binary Search. 
 * The user can select the Binary Search option, enter an integer between, and the program 
 * will return the index(es) if the integer is within the array. 
 * @author HWardak
 *
 */
public class BinarySearchMain {
	private static BinarySearchAlgorithm binarySearch = new BinarySearchAlgorithm();
	private static boolean isArraySorted;
	private static Scanner scanner;
	private static final int SIZE = 100;
	protected static Integer[] array;

	
	public static void main(String[] args){
		initializeArray(SIZE);
		instantiateArrayValues();
		sortArray();
		processMenuOptionSelection(printMenuOption());

	}
		

	
	/**
	 * Initializes an Integer[] of size SIZE.
	 * 
	 * @param arraySize
	 */
	private static void initializeArray(int arraySize){
		array = new Integer[arraySize];
		System.out.println("Array created size " + arraySize +"...");
	}


	/**
	 * Instantiates values into local Integer[]. Values are limited to between
	 * 0 and 50.
	 */
	private static void instantiateArrayValues(){
		Random random = new Random();
		for (int i=0; i< array.length; i++){
			array[i] = random.nextInt(50 + 1);
			
		}
		System.out.println("Array loaded (unsorted)...");
	}
	
	/**
	 * Switch case to handle menu option selections.
	 * 
	 * @param menuOptionSelection
	 */
	private static void processMenuOptionSelection(int menuOptionSelection) {
		switch (menuOptionSelection) {
		case 1:  
			instantiateArrayValues();
			sortArray();
			break;
		case 2:
			System.out.println("Enter number between 0 and 50...");
			binarySearch.binarySearch(getUserInput());
		case 5:
			printArray();

		}

		if(menuOptionSelection != 9){
			processMenuOptionSelection(printMenuOption());
		}

	}
	
	/**
	 * Presents the user with a menu, awaits their selection, and returns the 
	 * selection.
	 * 
	 * @return userSelection
	 */
	private static int printMenuOption() {
		System.out.println("Menu \n"
				+ "1) Re-instantiate array value. \n"
				+ "2) Binary search. \n"
				+ "5) Print array. \n"
				+ "9) Exit");


		return getUserInput();
		

	}
	
	/**
	* Simple method to read in and return the user's input. 
	* For use with the menu, and entering the desired integer to search for.
	*/
	private static int getUserInput(){
		scanner = new Scanner(System.in);
		int userSelection = scanner.nextInt();

		return userSelection;
	}
	
	/**
	 * Will format (for readability), and print the array. 
	 * Useful in confirming sorting algorithms results.
	 */
	private static void printArray() {
		String arrayString = "";
		for(int i=0; i < array.length; i++){
			arrayString += array[i] + " ";
			if(i != 0 && i%10==0){ arrayString += "\n";}
		}
		System.out.println(arrayString);

	}
	
	/**
	 * Takes unsorted Integer[], performs Selection Sort algorithm, and 
	 * returns the newly sorted Integer[].
	 * 
	 * @param Integer[] array (unsorted).
	 * @return Integer[] array (sorted).
	 */
	public static Integer[] sortArray(){
		
		for(int fullArrayIndex = 0; fullArrayIndex < array.length - 1; fullArrayIndex++ ){
			// First index of unsorted portion of array.
			int smallest = fullArrayIndex; 

			for(int unsortedIndex = fullArrayIndex + 1; unsortedIndex < array.length; unsortedIndex++ ){
				if((array[unsortedIndex] < array[smallest]) )
					smallest = unsortedIndex;
			}

			int temp = array[fullArrayIndex]; 	 
			array[fullArrayIndex] = array[smallest];
			array[smallest] = temp;

		}
		isArraySorted = true;
		System.out.println("Array sorted....");
		return array;
		
	}

	
}
