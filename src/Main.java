import com.sun.jdi.CharType;

public class Main {
    public static void main(String[] args) {
        sommaInt(4,5);
        stampaChar('a');
        sommaInteger(5,7);
        stampaCharacter('A');
        int prova = 1;
        Integer prova2 = prova + 1;
        double prova3 = 2.0;
        Double prova4 = prova3 + 5.4;
        char prova5 = 'A';
        Character prova6 = (char) (prova5 + 'B');

        Integer reverse = 1;
        int reverse1 = reverse;
        Character reverse2 = 'A';
        char reverse3 = reverse2;
        Double reverse4 = 4.5;
        double reverse5 = reverse4;


    }
    public static void sommaInt(int a, int b){
        int somma = a + b;
        System.out.println(somma);
    }
    public static void stampaChar(char c){
        System.out.println(c);
    }
    public static void sommaInteger(Integer a, Integer b){
        Integer somma = a + b;
        System.out.println(somma);
    }
    public static void stampaCharacter(Character c){
        System.out.println(c);
    }

}