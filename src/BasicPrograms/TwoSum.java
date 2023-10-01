package BasicPrograms;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {

    }
    public static  int[] toSum(int nums[],int target){
        Map<Integer,Integer> numMap = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            numMap.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++){
            int numTofind = target-nums[i];
            if(numMap.containsKey(numTofind)&& numMap.get(numTofind)!=i){
                return new int[]{i,numMap.get(numTofind)};
            }
        }
        return null;
    }
}
