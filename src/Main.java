
import java.util.Scanner;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        int n,a,r,s=0;
        System.out.print("Enter a Number : ");
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        a=n;
        while(n!=0)
        {
            r=n%10;
            s=10*s+r;
            n=n/10;
        }
        if (a==s)
            System.out.println(a+ " is a Paligrome Number");

        else
            System.out.println(a+ " is not  Paligrome Number");

    }
}