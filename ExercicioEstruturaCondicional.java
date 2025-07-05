import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double renda, porcentagem8,porcentagem18, porcentagem28, valorFinal;
        System.out.println("digite sua renda: ");
        renda = sc.nextDouble();

        if(renda <= 2000.00){
            System.out.println("Isento");
        }
        else if (renda >= 2000.01 && renda <= 3000.00){
            porcentagem8 = ( 8.0 / 100.0 ) * (renda - 2000.0);
            System.out.printf("R$ %.2f", porcentagem8);
        }
        else if (renda >= 3000.01 && renda < 4500.00){
            porcentagem8 = ( 8.0 / 100.0 ) * 1000.0;
            porcentagem18 = (18.0/100) * (renda-3000.0);
            valorFinal = porcentagem8 + porcentagem18;
            System.out.printf("R$ %.2f", valorFinal);
        }
        else {
            porcentagem8 = ( 8.0 / 100.0 ) * 1000.0;
            porcentagem18 = (18.0/100) * 1500.0;
            porcentagem28 = ( 28.0 / 100.0) * (renda - 4500.0);
            valorFinal = porcentagem8 + porcentagem18 + porcentagem28;
            System.out.printf("R$ %.2f", valorFinal);
        }

        sc.close();
    }
}
