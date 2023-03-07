package DSA;

import java.util.Arrays;

public class SelectionSort {
  public static void main(String[] args) {
    
    int arr[] = {3,6,2,4,1,78,32,21,74,36};
    int newArr[] = {468,45,2,849,6,66,484,636,474,7946,464,643,844,989,568,356,
    87};

    System.out.println(Arrays.toString(selectionSort(arr)));
    System.out.println(Arrays.toString(selectionSort(newArr)));

  }

  public static int[] selectionSort(int[]arr){

   int size = arr.length;

   for(int i =0; i<size; i++){

    int min = i;
    for(int j = i+1; j<size; j++){

      if(arr[min]> arr[j]){
        min = j;
      }


    }

    int temp = arr[i];
    arr[i] = arr[min];
    arr[min] = temp;
    
   }

   return arr;
}

}