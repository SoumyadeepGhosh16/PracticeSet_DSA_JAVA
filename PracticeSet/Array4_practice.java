public class Array4_practice {
//printing array such that even positioned value is always greater than odd    
    public static void printEvenOdd(int arr[],int n){

        for(int i=0;i<n;i+=2){
            if(i>0 && arr[i-1]>arr[i]){
                int temp=arr[i-1];
                arr[i-1]=arr[i];
                arr[i]=temp;
            }
            if(i<n-1 && arr[i+1]>arr[i]){
                int temp=arr[i+1];
                arr[i+1]=arr[i];
                arr[i]=temp;
            }
        }
    }
    public static void main(String[] args) {
        
        int[] arr={9,7,5,6,8,4,2};
        int n=arr.length;

        printEvenOdd(arr, n);

        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
