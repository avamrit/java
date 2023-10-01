package BasicPrograms;

public class MaxSubArraySum {
    public static void main(String[] args) {
        int arr[] = {1,2,-5,4,3,8,5};
        int maxSum = arr[0];
        int sum = arr[0];
        for(int i = 1;i<arr.length;i++){
            if(sum<0){
                sum=arr[i];
            }else{
                sum = sum +arr[i];
            }
        }
    }
}
