import java.util.Scanner;
public class rev {
    static int reverse(int n){
        int r = 0;
        while (n!=0) {
            r = r * 10 + (n%10);
            n=n/10;
        }
        return r;
    }
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int a = scr.nextInt();
        System.out.println(reverse(a));
    }
}
