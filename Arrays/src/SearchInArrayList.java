import java.util.ArrayList;
import java.util.Scanner;

public class SearchInArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the initial Size of ArrayList : ");
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>(n);
        for(int i =0; i<n;i++){
            list.add(i,sc.nextInt());
        }
        System.out.println("Enter the value to be searched in ArrayList : ");
        int x = sc.nextInt();
        System.out.println(find(list,x));
    }
    public static int find(ArrayList<Integer> list , int x){
        for(int i =0; i<list.size() ;i++){
            if(list.get(i)==x){
                return i;
            }
        }
        return -1;
    }
}
