public class Main {
    public static void main(String[] args) {
        double b, B, h, area;
        //boa pratica: colocar o .0 no final para indicar que é tipo double. Caso fosse float, colocar f no final do numero, exemplo: b=6f;
        b=6.0;
        B=8.0;
        h=5.0;
        area=(b+B)/2.0*h;
        System.out.println(area);

        int a, y;
        double resultado;
        a=5;
        y=2;
        //resultado=a/b resulta em 2.0, pois o compilador entende q uma divisão de dois inteiros é outro inteiro.
        // ao colocar (double) avisamos que não queremos truncar as casas decimais, fazendo assim um "casting".
        resultado=(double)a/y;
        System.out.println(resultado);
        //outro exemplo de casting:
        double A;
        int X;
        A=5.0;
        X=(int)A;
        System.out.println(X);
    }
}
