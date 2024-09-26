import java.util.Scanner;

public class day18 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer N: ");
        int N = scanner.nextInt(); 
        
        int divisorCount = countDivisors(N);

        System.out.println("Total number of divisors of " + N + " is: " + divisorCount);
        
        scanner.close();
    }

    
    public static int countDivisors(int N) {
        int count = 0;     
       
        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                count++; 
            }
        }
        
        return count; 
    }
}
