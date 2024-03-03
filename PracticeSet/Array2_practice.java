import java.util.Arrays;
import java.util.Collections;
//finding the second largest element of an array
public class Array2_practice {

    public static void print2Largest(Integer arr[],int n){

        Arrays.sort(arr,Collections.reverseOrder());

        for(int i=1;i<arr.length;i++){

            if(arr[i]!=arr[0]){
                System.out.println("the second largest element is"+" "+arr[i]);

                return;
            }
        }

        System.out.println("there is no second largest element");
    }
    public static void main(String[] args) {
        
        Integer arr[]={12,35,1,10,34,1};
        int n=arr.length;
        print2Largest(arr, n);
    }
}
