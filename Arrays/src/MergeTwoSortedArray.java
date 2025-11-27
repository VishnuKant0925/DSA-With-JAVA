public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int[] a={11,33,42,71,82,99};
        int[] b={26,54,69,81};
        int m =a.length;
        int n =b.length;
        int [] c= new int[m+n];
        int i=0 , j=0 , k=0;
        //merging
        while(i<m && j<n){
            if(a[i] <=b [j]){
                c[k]=a[i];
                i++;
                k++;
            }else{
                c[k]=b[j];
                j++;
                k++;
            }
        }
        if(i==m){ //now take elements from b only
           while(j<n){
               c[k]=b[j];
               k++;
               j++;
           }
        }
        if(j==n){ //now take elements from a only
            while(i<m){
                c[k]=a[i];
                k++;
                i++;
            }
        }
        for(int ele : c){
            System.out.print(ele+" ");
        }
    }
}
