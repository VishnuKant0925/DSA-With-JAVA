public class Merge_Two_Sorted_Array {
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
    public static void main(String[] args) {
        int[] a={10,30,50,60,80};
        int[] b={20,40,70,75};
        int[] c=new int[a.length+b.length];
        print(a);
        print(b);
        merge(a,b,c);
        print(c);

    }
}
