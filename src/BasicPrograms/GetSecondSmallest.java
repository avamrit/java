package BasicPrograms;

public class GetSecondSmallest {
    public static void main(String[] args) {
        int arr[]={-1,7,1,34,18,78};
        System.out.println(getsecondSmallest(arr));

    }
    public static int getsecondSmallest(int arr[]){
        int smallest =Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for(int i=0;i< arr.length;i++){
            if(arr[i]<smallest){
                smallest=arr[i];
            }
            if(arr[i]>smallest && arr[i]<secondSmallest){
                secondSmallest=arr[i];
            }
        }
        return secondSmallest;
    }
}
