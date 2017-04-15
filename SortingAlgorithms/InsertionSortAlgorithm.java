/**
 * Insertion Sort
 * @author HWardak
 *
 */
public class InsertionSortAlgorithm {
	
	/**
	 * Using an unsorted Integer[], the algorithm will sort the values into 
	 * ascending order using the Insertion Sort algorithm.
	 * 
	 * @param array Integer[] (unsorted)
	 * @return array Integer[] (sorted)
	 */
	public Integer[] InsertionSort(Integer[] array){
		for(int next = 1; next < array.length; next++){
			int insert = array[next];
			int moveItem = next;

			while(moveItem > 0 && array[moveItem - 1] > insert){
				array[moveItem] = array[moveItem -1 ];
				moveItem--;
			}
			array[moveItem] = insert;
		}
		return array;
	}

}
