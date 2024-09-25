import java.util.Scanner;

public class day16 {

    public static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

   
    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.print("Enter N: ");
        int N = sc.nextInt();
        System.out.print("Enter M: ");
        int M = sc.nextInt();

      
        int result = lcm(N, M);
        System.out.println("LCM of " + N + " and " + M + " is: " + result);
    }
}
