import java.util.Scanner;
public class closuresum {
    static int Hashsum(int n){
        if(n<100){
            return n;
        }
        int sum =0;
        while (n>=100) {
            int l = n%10;
            int f = n/(int)Math.pow(10,(int)Math.log10(n));
            sum += f*10 + l ;
            n=n%(int)Math.pow(10,(int)Math.log10(n));
            n=n/10;
        }
        return sum + n ;
    }
    public static void main(String[] args) {
        Scanner snr = new Scanner(System.in);
        int h = snr.nextInt();
        System.out.println(Hashsum(h));
    }

}
