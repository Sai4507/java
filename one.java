import java.util.Scanner;
public class one {
    static boolean isHappynum(int n){
        int lasttwo = n % 100;
        int p = (lasttwo/10)* (lasttwo%10);
        n=n/100;
        int sum =0;
        while (n!=0) {
            sum = sum + (n%10);
            n=n/10;
        }
        return sum == p;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ab = sc.nextInt();
        if(ab<10){
            System.out.println(-1);
            return;
        }
        boolean res = isHappynum(ab);
        System.out.println(res);

    }
}
