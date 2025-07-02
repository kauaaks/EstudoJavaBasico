import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //String x;
        //x = sc.next();
        //System.out.println("sim!"+x);

        //int x;
        //x = sc.nextInt();
        //System.out.println("vc digitou: "+ x);

        //double x;
        //x = sc.nextDouble();
        //System.out.printf("vc digitou: %.2f", x);

        //char x;
        //charAt(0) pega apenas a primeira letra.
        //x = sc.next().charAt(0);
        //System.out.println("vc digitou: "+ x);

        //String x;
        //int y;
        //double z;
        //x = sc.next();
        //y = sc.nextInt();
        //z = sc.nextDouble();
        //System.out.println("dados digitados:");
        //System.out.println(x);
        //System.out.println(y);
        //System.out.println(z);

        //para ler até a quebra de linha:
        //next() le apenas uma palavra, nextLine() le a linha inteira.
        //String s1, s2, s3;
        //s1 = sc.nextLine();
        //s2 = sc.nextLine();
        //s3 = sc.nextLine();
        //System.out.println("dados digitados:");
        //System.out.println(s1);
        //System.out.println(s2);
        //System.out.println(s3);

        //ATENÇÃO: quando vc usa um comando de leitura diferente do nextLine() e da alguma quebra de linha (enter), a mesma fica pendente na entrada padrão.
        //Se vc então fizer um nextLine(), aquela quebra de linha pendente será absorvida pelo nextLine().
        //SOLUÇÃO: fazer um nextLine() extra a frente do comando de leitura diferente do nextLine()
        //para assim ele consumir a quebra de linha pendente.
        sc.close();
    }
}
