public class Array1_practice {
//find the largest three elements of an array
    public static void printMax(int arr[],int n){
         
        int i,first,second,third;

        if(n<3){
            System.out.println("Array does not include enough elements");
            return;
        }

        third=first=second=Integer.MIN_VALUE;
        
        for(i=0;i<n;i++){
            if(arr[i]>first){
                third=second;
                second=first;
                first=arr[i];
            }else if(arr[i]>second)
            {
                third=second;
                second=arr[i];
            }else if(arr[i]>third)
            {
                third=arr[i];
            }
        }

        System.out.println("the largest three element are="+" "+first+" "+second+" "+third);
    }

    public static void main(String[] args) {
        int[] arr={32,56,11,73,44};
        int n=arr.length;
        printMax(arr, n);
    }
}
