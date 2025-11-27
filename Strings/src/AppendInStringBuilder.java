public class AppendInStringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("abc");
        System.out.println(sb);
        sb.append("def");
        System.out.println(sb);
        sb.append('z');
        System.out.println(sb);
        char[] ch = {'A','B','W'};
        sb.append(ch);
        System.out.println(sb);
    }
}
