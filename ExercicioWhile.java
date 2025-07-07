import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Álcool 2.Gasolina 3.Diesel 4.Fim");
        int x = 0;
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;
        while(x != 4){

            x = sc.nextInt();

            switch(x){
                case 1:
                    alcool += 1;
                    break;
                case 2:
                    gasolina += 1;
                    break;
                case 3:
                    diesel +=1;
                    break;
                case 4:
                    System.out.println("MUITO OBRIGADO");
                    System.out.println("Alcool: "+ alcool);
                    System.out.println("Gasolina: "+ gasolina);
                    System.out.println("Diesel: "+ diesel);
                    break;
                default:
                    System.out.println("digite um número válido...");
                    break;
            }
        }
    }
}
