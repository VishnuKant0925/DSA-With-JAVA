public class Descending_Arrangement {
    public static void main(String[] args) {
        int[] arr = {100,500,300,250,750,2500,501};
        String[] names = {"Sanjay","Manish","Ravi","Veena","Aditi","Reena","Prakash"};
        int n = arr.length;
        for(int i =0 ;i<n-1;i++){
            boolean flag =true;
            for(int j=0;j<n-1-i;j++){
                if(arr[j]<arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    String tempName = names[j];
                    names[j]=names[j+1];
                    names[j+1]=tempName;
                    flag=false;
                }

            }
            if(flag) break;
        }

        for(int i=0;i<n;i++){
            System.out.println(names[i]+" "+arr[i]);
        }
    }
}
