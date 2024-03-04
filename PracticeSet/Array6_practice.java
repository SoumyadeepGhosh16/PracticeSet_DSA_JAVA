import java.util.Arrays;
import java.io.*;
//sort an array containing 1 to n values
public class Array6_practice {
    public static void main(String[] args) {
        
        int[] arr={3,2,5,6,1,4};

        sort(arr);

        System.out.println(Arrays.toString(arr));
    }

    static void sort(int arr[]){

        int i=0;
        while(i<arr.length){

            int correct=arr[i]-1;

            if(arr[correct]!=arr[i]){

                swap(arr,i,correct);
            }
            else{
                i++;
            }
        }
    }
    static void swap(int[] arr, int first, int second)
    {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
