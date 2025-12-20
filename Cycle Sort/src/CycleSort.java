import java.util.*;
import java.lang.*;
import java.io.*;

class CycleSort
{
    public static void swap(int[]arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n =sc.nextInt();
        int [] arr= new int[n];
        System.out.println("Enter the elements of array from (1 to n) in random way  : ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int i=0;
        while(i<n){
            if(i==(arr[i]-1)) i++;
            else{
                swap(arr,i,arr[i]-1);
            }

        }
        for(i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

