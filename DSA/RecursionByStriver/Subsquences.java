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

        subsquencesRec(0, arr, new ArrayList<>());
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
