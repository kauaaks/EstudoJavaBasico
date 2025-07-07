import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for(int i = 1; N >= i; i++){
            double a = Math.pow(i, 2.0);
            double b = Math.pow(i, 3.0);
            System.out.printf(i+" ");
            System.out.printf("%.0f ", a);
            System.out.printf("%.0f \n", b);
        }
    }
}
