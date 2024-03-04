public class Array5_practice {
//print the distinct elements of an array
    static void printDistinct(int arr[],int n){
        for(int i=0;i<n;i++){

            int j;
            for( j=0;j<n;j++){
                if(arr[i]==arr[j])
                break;
            }

            if(i==j)
            System.out.println(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        
        int[] arr={56,34,27,60,34,50,56};
        int n=arr.length;

        printDistinct(arr, n);
    }
}
