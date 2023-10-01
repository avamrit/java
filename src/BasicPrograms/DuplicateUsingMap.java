package BasicPrograms;

import java.util.HashMap;
import java.util.Map;

public class DuplicateUsingMap {
    public static void main(String[] args) {
        int arr[] = {2,5,3,1,8,7,5,3,2};
        Map<Integer,Integer> hmap = new HashMap<>();
        for(int i =0 ;i<arr.length;i++){
            if(hmap.containsKey(arr[i])){
                hmap.put(arr[i],hmap.get(arr[i])+1);
            }else
                hmap.put(arr[i],1);
        }
        hmap.forEach((k,v)->{
            if(v>1){
                System.out.println(k);
            }
        });

    }
}
