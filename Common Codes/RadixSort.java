import java.util.Arrays;

class RadixSort{
	
	public static int getMaxx(int[] arr){
		int maxx = arr[0];
		for(int i = 1; i < arr.length; i++){
			if(arr[i] > maxx){
				maxx = arr[i];
			}
		}
		return maxx;
	}

	public static void sort(int[] arr, int exp){
		int[] output = new int[arr.length];
		int[] count = new int[10];
		Arrays.fill(count,0);

		for (int i = 0; i < arr.length;i++){
			count[(arr[i]/exp)%10]++;
		}

		for (int i = 1; i < 10; i++){
			count[i] += count[i-1];
		}

		for (int i = 0; i < arr.length;i++){
			output[count[(arr[i]/exp)%10]-1] = arr[i];
			count[ (arr[i]/exp)%10 ]--;
		}
		for (int i = 0; i < arr.length; i++)
            arr[i] = output[i];

	}

	 
	public static void main(String[] args){
		int[] arr = {1,0,4,3,8,6};
		int maxx = getMaxx(arr);

		for(int exp = 1; maxx/exp > 0; exp=exp*10){
			sort(arr, exp);
		}

		System.out.print(Arrays.toString(arr));
	}
}