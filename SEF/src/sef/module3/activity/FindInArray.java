/**
 *
 */
package sef.module3.activity;

/**
 * @author
 *
 */
public class FindInArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Create an integer array

				int[] nums;	        // declare an array of integers

				nums = new int[3];	// create an array of integers
		int size;
		int temp;
		int[] nums = {15, 300, 400, 20};
		size = nums.length;
		for(int i = 0; i<size; i++ ){
			for(int j = i+1; j<size; j++){
				if(nums[i]>nums[j]){
					temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
				}
			}
		}
		System.out.println("Smallest element of the array is:: "+nums[0]);

		int result = nums[0];

		// Find smallest in an array
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] < result) {
				result = nums[i];
			}
		}
		System.out.println("Smallest in array is "+result);

		result = nums[0];

		// Find largest in an array
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] > result) {
				result = nums[i];
			}
		}
		System.out.println("Largest in array is "+result);

	}

}
