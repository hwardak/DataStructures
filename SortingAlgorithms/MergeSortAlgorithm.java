/**
 * Merge Sort
 * @author HWardak
 *
 */
public class MergeSortAlgorithm {
	
	private Integer[] array;
	private Integer[] array2;

	/**
	 * Instantiates the local Integer[].
	 * @param array
	 */
	public void loadArray(Integer[] array){
		this.array = array;
	}
	
	/**
	 * Receives lowest and highest index values, performs a Merge Sort 
	 * algorithm on the local unsorted Integer[], and returns the sorted 
	 * Integer[].
	 * 
	 * @param low
	 * @param high
	 * @return Integer[] array (sorted).
	 */
	public Integer[] mergeSort(int low, int high){
		
		int middle;
		int middle2;
			
		if((high - low) >=1) {

			middle = (low + high)/2;
			middle2 = middle + 1;

			mergeSort(low, middle);
			mergeSort(middle2, high);


			int obj2Index = low;
			array2 = new Integer[array.length-1];

			while(low <= middle && middle2 <= high)
			{	
				if(array[low] <= array[middle2]){
					array2[obj2Index] = array[low];
					obj2Index++;
					low++;
				}
				else
				{
					array2[obj2Index] = array[middle2];
					obj2Index++;
					middle2++;
				} 
			}
			
			if (low == middle2)
			{
				while(middle2 <= high){
				array2[obj2Index++] = array[middle2++];
				}
			}else{
				while(low <=middle){
					array2[obj2Index++] = array[low++];
					}
			}
		}
		return array;
	}
}
