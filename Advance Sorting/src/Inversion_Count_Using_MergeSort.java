public class Inversion_Count_Using_MergeSort {
    static int count;
    public static void print(int [] arr){
        int n = arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void merge(int [] a , int[] b, int[] c){
        int i=0 ,j=0,k=0;
        while(i<a.length && j<b.length){
            if(a[i]<b[j])  c[k++]=a[i++];
            else c[k++]=b[j++];
        }
        while(i<a.length) c[k++]=a[i++];
        while(j<b.length) c[k++]=b[j++];
    }
    public static void inversion(int[] a, int[] b){
        int i=0;int j=0;
        while(i<a.length && j<b.length){
            if(a[i]>b[j]){
                count+=a.length-i;
                j++;
            }else i++;
        }
    }
    public static void mergesort(int[] arr){
        int n=arr.length;
        if(n==1) return;  // base case
        //create two array of n/2 size each
        int[] a= new int[n/2];
        int[] b= new int[n-n/2];
        //copy elements
        for(int i=0;i<n/2;i++){
            a[i]=arr[i];
        }
        for(int i=0;i<n-n/2;i++){
            b[i]=arr[i+n/2];
        }
        //magic(recursion)
        mergesort(a);
        mergesort(b);
        //count inversions
        inversion(a,b);
        //merge these 'a' and 'b'
        merge(a,b,arr);
        a=null; b=null;  //to delete 'a' and 'b' after merging to improve space complexity (-0(N)-)
    }
    public static void main(String[] args) {
        int [] arr={8,2,5,3,1,4};
        print(arr);
        mergesort(arr);
        print(arr);
        System.out.println("Inversions :"+count);
    }
}
