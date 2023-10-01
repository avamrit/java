package BasicPrograms;

import java.util.HashMap;
import java.util.Map;

public class ElementAppearOnce {
    public static void main(String[] args) {
        int arr[] = {1,1,2,2,3,3,4,5,5,6,6};
        int res =0 ;
        Map<Integer,Integer> hmap = new HashMap<>();
        for(int i = 0 ;i<arr.length;i++){
            hmap.put(arr[i],hmap.getOrDefault(arr[i],0)+1);
        }
        for(Map.Entry<Integer,Integer>entry:hmap.entrySet()){
            if(entry.getValue()==1){
                res = entry.getKey();
                break;
            }
        }
    }
}
