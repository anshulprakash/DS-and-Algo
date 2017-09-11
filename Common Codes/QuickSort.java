import java.util.Arrays;

class QuickSort{
	
	static void sort(int[] array, int left, int right){
		int index = partition(array, left, right);

		if(left < index - 1){
			sort(array, left, index - 1);
		if(right > index)
			sort(array, index, right);
		}

	}

	static int partition(int[] array, int left, int right){
		int pivot = array[ (left+right) / 2];
		
		while(left<=right){
			while(array[left] < pivot)
				left++;
			while(pivot < array[right])
				right--;

			if(left <= right){
				int temp = array[left];
				array[left] = array[right];
				array[right] = temp;
				left++;
				right--;
			}
		}
		return left;
	}

	public static void main(String[] args){
		int[] array = {1,0,4,3,-8,6};
		if(array == null || array.length == 0){
			System.out.println("Empty array");
		}else{
			sort(array, 0, array.length - 1);
			System.out.print(Arrays.toString(array));
		}
	}
}