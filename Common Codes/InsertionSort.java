import java.util.Arrays;

class InsertionSort{
	
	public static void sort(int[] a){
		int in, out;
		for(out = 1; out < a.length - 1; out++){
			int temp = a[out];
			in = out;
			while(in > 0 && a[in-1] > temp){
				a[in] = a[in-1];
				in--;
			}
			a[in] = temp;
		}
		
	}

	public static void main(String[] args){
		int[] a = {1,0,4,3,-8,6};
		sort(a);
		System.out.print(Arrays.toString(a));
	}
}