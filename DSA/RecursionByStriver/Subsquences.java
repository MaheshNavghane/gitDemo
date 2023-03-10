package DSA.RecursionByStriver;

import java.util.ArrayList;
import java.util.List;

public class Subsquences {
    /*
        subsequences ->
        a contigeous/ non-contigeous sequences, which follows the order.
        3 
        1 
        2 
        3 1 
        1 2 
        3 2
        3 1 2
     */

     public static void main(String[] args) {
        
        int[] arr = {3,1,2};

        subsequences(arr);

        System.out.println();
        subsquencesRec(0, arr, new ArrayList<>());

     }

     public static void subsequences(int[] arr){   //time complexity n 2 to the power n 

      int n = arr.length;

      for(int num = 0; num<(1<<n); num++){

         List<Integer> list = new ArrayList<>();
         for(int idx= 0; idx<n; idx++){

            if((num&(1<<idx)) != 0){
               list.add(arr[idx]);
            }
         }

         if(list.size()>0)
         System.out.println(list);
      }

      
     }

     public static void subsquencesRec(int idx, int[] arr,List<Integer> list){

        if(idx == arr.length)
        {
            print(list);
            return;
        }
        
        list.add(arr[idx]);
        subsquencesRec(idx+1, arr, list);
        list.remove(list.size()-1);
        subsquencesRec(idx+1, arr, list);
     }

     public static void print(List<Integer> list){
        
        for(int i = 0; i<list.size(); i++){
            System.out.print(list.get(i)+" ");
        }

        System.out.println();
     }
}
