// Doing binary Search
class BinarySearch{
	
	public static int search(int[] a, int x){

		int low = 0;
		int high = a.length - 1;

		while(low <= high){
			int mid = (low + high)/2;

			if(a[mid] == x){
				return mid;
			}

			if(a[mid] > x){
				high = mid - 1;
			}

			if(a[mid] < x){
				low = mid + 1;
			}
		}
		return 0;
	}

	public static void main(String[] arg){
		System.out.println(search(new int[] {1,2,3,4,5,6} , 5));
	}
}
