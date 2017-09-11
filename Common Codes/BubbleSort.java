import java.util.Arrays;

class BubbleSort{
	
	public static void sort(int[] a){

		for(int out = a.length - 1; out > 0; out--){
			for(int in = 0; in < out ; in++){
				if(a[in] > a[in+1]){
					int temp = a[in];
					a[in] = a[in + 1];
					a[in + 1] = temp;
				}
			}
		}
	}

	public static void main(String[] args){
		int[] a = {1,0,4,3,5,6};
		sort(a);
		System.out.print(Arrays.toString(a));
	}
}