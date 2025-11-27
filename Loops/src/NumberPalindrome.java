public class NumberPalindrome {

        public static int isPalindrome(int x) {
            int n = x;
            int r = 0;
            int num =0;
            while(n!=0){
                r=n%10;
                n=n/10;
                num=num*10+r;
                System.out.println(num);
            }
            return num;

        }

    public static void main(String[] args) {
        System.out.println( isPalindrome(-121));
    }
}
