import java.util.Scanner;
public class two {
    static int swap(int n){
        int l = n%10;
        int dc = (int)Math.log10(n);
        int f = n/(int)Math.pow(10,dc);
        n = (n%(int)Math.pow(10,dc))/10;

        if(n==0)
        {
            return l*10 + f;
        }
        dc = (int)Math.log10(n)+1;
        int res = l*(int)Math.pow(10,dc)+n;
        int res1 = res * 10+f;
        return res1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(swap(a));
    }
    
}