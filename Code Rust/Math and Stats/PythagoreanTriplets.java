
//Given an integer array find all Pythagorean triplets.
public List<int[]> findTriplets(int[] arr){
  int n = arr.length;

  List<int[]> ret = new ArrayList<>();

  if(n < 3) return ret;
  Arrays.sort(arr);

  for(int i = 0; i < n ; i++){
    if(arr[i] == 0) continue;

    int c = arr[i] * arr[i];

    int j = 0, k = n - 1;
    while(j < k){
      if(j == i || arr[j] == 0){
        j++;
        continue;
      }
      if(k == i || arr[k] == 0){
        k--;
        continue;
      }

      int a = arr[j] * arr[j];
      int b = arr[k] * arr[k];

      if(a + b == c){
        ret.add(new int[]{a, b, c});
      }else if(a + b > c){
        k--;
      }else{
        j++;
      }
    }
  }

  return ret;
}
