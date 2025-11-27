import java.util.ArrayList;

public class BasicsOfArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(6);
        arr.add(0,10); //initialise
        arr.add(1,20);
        arr.add(2,30);
        arr.add(3,40);
        arr.add(4,50);
        arr.add(5,60);
        System.out.println(arr+"  "+arr.size());
        for ( int i=0;i<arr.size();i++){
            System.out.print(arr.get(i)+"  ");  // to get the value of arrayList
        }
        System.out.println();
        System.out.println("Changing the value of ArrayList using set method");
        arr.set(2,100);         //modify
        System.out.println(arr+"  "+arr.size());

        arr.add(90);        //push at back
        System.out.println();
        System.out.println(arr+"   "+arr.size());

        arr.remove(2);      //delete the value present at index 2
        System.out.println();
        System.out.println(arr+"  "+arr.size());



    }
}
