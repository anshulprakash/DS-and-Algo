import java.util.Arrays;

class SelectionSort{
	
	public static void sort(int[] a){
		int out, in, min;
		for(out = 0; out < a.length-1; out++){
			min = out;
			for(in = out + 1; in < a.length; in++){
				if(a[in] < a[min]){
					min = in;
				}
			}
			int temp = a[out];
			a[out] = a[min];
			a[min] = temp;
		}
		
	}

	public static void main(String[] args){
		int[] a = {1,0,4,3,-8,6};
		sort(a);
		System.out.print(Arrays.toString(a));
	}
}