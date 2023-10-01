package BasicPrograms;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElementsArray {
    public static void main(String[] args) {
     int arr[]= {1,6,4,7,8,4,7,9,3,8};
     Set<Integer> uniqueNumber = new HashSet<>();
     boolean isDuplicate = false;
     for(int i=0;i<arr.length;i++){
         if(uniqueNumber.contains(arr[i])){
             isDuplicate=true;
             System.out.println("Duplicate number is "+arr[i]);
         }else{
             uniqueNumber.add(arr[i]);
         }
     }
    }
}
