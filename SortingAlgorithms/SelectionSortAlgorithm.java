/**
 * Selection Sort
 * @author HWardak
 *
 */
public class SelectionSortAlgorithm {
	
	/**
	 * Receives unsorted Integer[], performs Selection Sort algorithm, and 
	 * returns the newly sorted Integer[].
	 * 
	 * @param Integer[] array (unsorted).
	 * @return Integer[] array (sorted).
	 */
	public Integer[] SelectionSort(Integer[] array){
		
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
		return array;
		
	}

}
