import java.util.Locale; // Locale é uma class do jdk

public class Main {
    public static void main(String[] args) {
        // println quebra linha automatico, printf -> f de format, oferece recursos de formatacao mais avancados, como insercao de variaveis.
        //System.out.println("Olá Mundo!");
        //System.out.println("Olá Java!");
        //Double teste = 10.35784;
        //System.out.println(teste);
        // %n ou \n -> quebra linha, %.2f -> duas casas depois da virgula
        //System.out.printf("%.2f%n",teste);
        //System.out.printf("%.2f\n",teste);
        // configurando a localizacao do programa para os Estados Unidos
        //Locale.setDefault(Locale.US);
        //System.out.printf("%.2f\n",teste);
        //System.out.println("resultado:" + teste + " metros.\n");
        // valor de teste entra onde esta o %.2f
        //System.out.printf("resultado: %.2f metros \n",teste);
        //String nome = "kauã";
        //int idade = 17;
        //double renda = 50.02442;
        // %f = ponto flutuante, %d = inteiro, %s = texto, %n = quebra de linha.
        //System.out.printf("%s tem %d anos e sua renda é %.2f reais por semana.\n", nome, idade, renda);
        //ATIVIDADE DE FIXACAO
        String product1 = "Computer";
        String product2 = "Office desk";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;

        System.out.println("Products:");
        System.out.printf(product1 + ", Which price is $ %.2f\n", price1);
        System.out.printf(product2 + ", which price is $ %.2f\n\n", price2);

        System.out.printf("Record: "+ age +"years old, code "+ code +" and gender: "+ gender);

        System.out.printf("\n\nMeasue with eight decimal places: %.8f\n", measure);
        System.out.printf("Rouded (three decimal places): %.3f\n", measure);
        Locale.setDefault(Locale.US);
        System.out.printf("US decimal point: %.3f", measure);
    }
}
