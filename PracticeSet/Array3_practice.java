public class Array3_practice {
//move all zeros to end of the array
    public static void printZero(int arr[],int n){

        int count=0;

        for(int i=0;i<n;i++){
            if(arr[i]!=0)
              arr[count++]=arr[i];
        }

        while(count<n)
           arr[count++]=0;
    }
    public static void main(String[] args) {
        
        int[] arr={1,6,8,4,0,0,0,7,0,9,2,0};
        int n=arr.length; 
        printZero(arr, n);

        System.out.println("Array after pushing zeros at the end:");

        for(int i=0;i<n;i++)
           System.out.print(arr[i]+" ");
    }
}
