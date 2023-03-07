package DSA;

import java.util.Arrays;

public class BubbleSort {
  
  public static void main(String[] args) {
    int[] arr = {34,56,3,2,1,7,4,39,67,45};

    System.out.println(Arrays.toString(bubbleSort(arr)));
  }

  public static int[] bubbleSort(int[] arr){

    int size = arr.length;

    for(int i = 0; i<size; i++){
      int max = arr[0];
      int idx = 0;
      for(int j = size-1-i; j>=0; j--){
        
        if(max < arr[j]){
          max = arr[j];
          idx = j;
        }

      }

      int temp =arr[size-1-i];
      arr[idx] = temp;
      arr[size-1-i] = max;

    }

    return arr;
  }
}
