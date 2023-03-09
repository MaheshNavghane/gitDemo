package DSA.RecursionByStriver;

import java.util.Arrays;

public class ReverseArray {
  
  public static void main(String[] args) {

    int arr[] = new int[]{1,2,4,5,7,8,9};
    
    System.out.println(Arrays.toString(revArray(new int[]{1,2,4,5,7,8,9})));

    System.out.println(Arrays.toString(revArrayRec(arr,0,arr.length-1)));

    System.out.println(Arrays.toString(revArrayRecAlt(arr, 0)));
  }

  // By using loop
  public static int[] revArray(int[] arr){

    for(int i = 0; i<arr.length/2; i++){

      int temp = arr[arr.length-i-1];
      arr[arr.length-i-1] = arr[i];
      arr[i] = temp;
    }

    return arr;
  }

  // By using recursion
  public static int[] revArrayRec(int[] arr, int l, int r){

    if(l>r)
    return arr;

    int temp = arr[l];
    arr[l]=arr[r];
    arr[r] = temp;

    return revArrayRec(arr, l+1, r-1);
  }

  public static int[] revArrayRecAlt(int[] arr, int i){

    if(i<arr.length/2)
    return arr;

    int temp = arr[i];
    arr[i] = arr[arr.length - i - 1];
    arr[arr.length- i- 1]=temp;
    
    return revArrayRecAlt(arr, i+1);
  }
}

