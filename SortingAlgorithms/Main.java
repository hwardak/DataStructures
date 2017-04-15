import java.util.Random;
import java.util.Scanner;


/**
 * Main menu an interface to implement and demo sorting algorithms.
 * 
 * @author HWardak
 *
 */
public class Main {

	private static int size = 1000;
	private static Integer numbersArray[];
	private static Scanner scanner;

	static InsertionSortAlgorithm insertionSortAlgorithm 
	= new InsertionSortAlgorithm();

	static MergeSortAlgorithm mergeSortAlgorithm
	= new MergeSortAlgorithm();
	
	static SelectionSortAlgorithm selectionSortAlgorithm
	= new SelectionSortAlgorithm();

	public static void main(String[] args) {

		initializeArray(size);
		instantiateArrayValues();
		processMenuOptionSelection(printMenuOption());


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
			break;
		case 2: 
			numbersArray 
			= insertionSortAlgorithm.InsertionSort(numbersArray);
			break;
		case 3:  
			numbersArray = selectionSortAlgorithm.SelectionSort(numbersArray);
			break;
		case 4:  
			mergeSortAlgorithm.loadArray(numbersArray);
			numbersArray = mergeSortAlgorithm.mergeSort(0, numbersArray.length);

			break;
		case 5:
			printArray();

		}

		if(menuOptionSelection != 9){
			processMenuOptionSelection(printMenuOption());
		}

	}

	/*

	 */

	/**
	 * Will format (for readability), and print the array. 
	 * Useful in confirming sorting algorithms results.
	 */
	private static void printArray() {
		String arrayString = "";
		for(int i=0; i < numbersArray.length; i++){
			arrayString += numbersArray[i] + " ";
			if(i != 0 && i%20==0){ arrayString += "\n";}
		}
		System.out.println(arrayString);

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
				+ "2) Insertion Sort. \n"
				+ "3) Selection Sort. \n"
				+ "4) Merge Sort. \n"
				+ "5) Print array");



		scanner = new Scanner(System.in);
		int userSelection = scanner.nextInt();

		return userSelection;

	}


	/**
	 * Initializes an Integer[] of size 1000.
	 * 
	 * @param arraySize
	 */
	private static void initializeArray(int arraySize){
		numbersArray = new Integer[arraySize];
		System.out.println("Array created size " + arraySize +"...");
	}


	/**
	 * Instantiates values into local Integer[]. Values are limited to between
	 * 0 and 30.
	 */
	private static void instantiateArrayValues(){
		Random random = new Random();
		for (int i=0; i< numbersArray.length; i++){
			numbersArray[i] = random.nextInt(30 + 1);
		}
		System.out.println("Array loaded...");
	}

}
