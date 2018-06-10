//Given an array of integers and a value, determine if there are any three
//integers in the array that sum equal to the given value.

// Solution with time complexity as (n^2)(log n)
public class Solution1{
  public static boolean findSumOfThree(int[] arr, int value){
    Arrays.sort(arr);
    for(int i = 0; i < arr.length - 2; i++){
      for(int j = i+1; j < arr.length - 1; j++){
        int target = value - arr[i] - arr[j];
        int k = Arrays.BinarySearch(arr, target);
        if(k > 0 && k != i && k != j){
          return true;
        }
      }
    }
    return false;
  }
}

// Solution with complexity n^2
public class Solution2{
  public static boolean findSumOfThree(int[] arr, int value){
    Arrays.sort(arr);
    for(int i = 0; i < arr.length - 2; i++){
      int target = value - arr[i];
      if(findSumOfTwo(arr, target, i + 1)){
        return true;
      }
    }
    return false;
  }

  public static boolean findSumOfTwo(int[] arr, int target, int start){
    for(int i = start, j = arr.length - 1; i < j;){
      int sum = arr[i] + arr[j];

      if(sum == target){
        return true;
      }else if(sum > target){
        j--;
      }else{
        i++;
      }
    }
    return false;
  }
}
