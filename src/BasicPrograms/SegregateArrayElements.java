package BasicPrograms;

import java.util.Arrays;

public class SegregateArrayElements {
    public static void main(String[] args) {
        int arr[] = {0,1,0,2,3,5,0,8};
        int j=0;
        for(int i=0;i< arr.length;i++){
            if(arr[i]!=0){
                arr[j++]=arr[i];
            }
        }
        while(j< arr.length){
            arr[j++]=0;
        }
        System.out.println(Arrays.toString(arr));
    }
}
