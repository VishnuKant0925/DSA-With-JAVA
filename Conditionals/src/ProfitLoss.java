import java.util.Scanner;

public class ProfitLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Selling Price");
        double sel = sc.nextDouble();
        System.out.println("Enter the cost price");
        double cost = sc.nextDouble();

        double profit = sel-cost;

        if(profit>0){
            System.out.println("Profit : "+profit);
        } else if (profit==0) {
            System.out.println("No Loss No Profit ");
        } else{
            System.out.println("Loss : "+(-profit));
        }

    }
}
