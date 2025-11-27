import java.util.ArrayList;

public class ArrayList2D {
    public static void main(String[] args) {

        ArrayList<Integer> a = new ArrayList<>();
        a.add(10); a.add(20); a.add(30);

        ArrayList<Integer> b = new ArrayList<>();
        b.add(40); b.add(50);

        ArrayList<Integer> c = new ArrayList<>();

        ArrayList<Integer> d = new ArrayList<>();
        d.add(90);

        ArrayList<ArrayList<Integer>> l = new ArrayList<>();
        l.add(a);
        l.add(b);
        l.add(c);
        l.add(d);

        //printing of 2D array list
        for(int i =0 ; i< l.size();i++){
            ArrayList<Integer> x = l.get(i);
            for(int j=0 ; j<x.size();j++){
                System.out.print(x.get(j)+" ");
            }
            System.out.println();
        }
    }
}
