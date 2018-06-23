//Given a large array of integers and a window of size 'w',
//find the current maximum in the window as the window slides through the entire array.

public static void slidingWindowMax(int[] arr, int window_size){

  if(arr.length < window_size) return;

  ArrayDeque<Integer> window = new ArrayDeque<>();
  for(int i = 0; i < window_size; i++){
    while(!window.isEmpty() && arr[i] >= arr[window.peekLast()]){
      window.removeLast();
    }
    window.addLast(i);
  }

  System.out.print(arr[window.peekFirst()] + ",");

  for(int i = window_size; i < arr.length; i++){

    while(!window.isEmpty() && arr[i] >= arr[window.peekLast()]){
      window.removeLast();
    }
    if(!window.isEmpty() && window.peekFirst() <= i - window_size){
      window.removeFirst();
    }
    window.addLast(i);
    System.out.print(arr[window.peekFirst()] + ",");
  }
}
