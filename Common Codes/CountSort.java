import java.util.Arrays;

class CountSort{
	
	public static void sort(int[] a){
		int n = a.length;
		int[] output = new int[n];

		int[] count = new int[256];
		for (int i = 0; i < 256 ;i++ ) {
			count[i] = 0;
		}
		for(int i = 0 ; i < n ; i++){
			count[a[i]]++;
		}
		System.out.println(Arrays.toString(count));
		for (int i = 1; i < 256 ;i++ ) {
			count[i] += count[i-1];
		}
		System.out.println(Arrays.toString(count));
		for(int i = 0; i < n; i++){
			int position = count[a[i]] - 1;
			count[a[i]]--;
			output[position] = a[i];
		}

		for(int i = 0; i < n; i++){
			a[i] = output[i];
		}
	}

	public static void main(String[] args){
		int[] a = {1,0,4,3,8,6};
		sort(a);
		System.out.print(Arrays.toString(a));
	}
}