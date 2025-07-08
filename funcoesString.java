public class Main {
    public static void main(String[] args) {
        String original = "abcde FGHIJ ABC abc DEFG ";
        String s01 = original.toLowerCase();
        String s02 = original.toUpperCase();
        // .trim elimina espaços nos cantos da linha.
        String s03 = original.trim();
        // substring(2) imprime somente depois dos dois primeiros caracteres.
        String s04 = original.substring(2);
        // substring(2, 9) recorta oq esta entre os caracteres 2 e 9.
        String s05 = original.substring(2, 9);
        //replace substitui caracteres ou palavras.
        String s06 = original.replace('a', 'x');
        String s07 = original.replace("abc", "xy");
        // indexOf procura a primeira ocorrencia do "bc".
        // lastIndexOf procura a ultima ocorrencia do "bc".
        int i = original.indexOf("bc");
        int j = original.lastIndexOf("bc");
        System.out.println("Original: -" + original + "-");
        System.out.println("toLowerCase: -" + s01 + "-");
        System.out.println("toUpperCase: -" + s02 + "-");
        System.out.println("trim: -" + s03 + "-");
        System.out.println("substring(2): -" + s04 + "-");
        System.out.println("substring(2, 9): -" + s05 + "-");
        System.out.println("replace('a', 'x'): -" + s06 + "-");
        System.out.println("replace('abc', 'xy'): -" + s07 + "-");
        System.out.println("Index of 'bc': " + i);
        System.out.println("Last index of 'bc': " + j);

        String s = "potato apple lemon orange";
        // .split(" ") recorta em varias partes separadas pelo espaço, e esta guardando elas em um vetor.
        String[] vect = s.split( " ");
        System.out.println(vect[0]);
        System.out.println(vect[1]);
        System.out.println(vect[2]);
        System.out.println(vect[3]);
    }
}
