import java.util.Scanner;

public class StringTesting {
    public static void main(String[] args) {
        String txt1, txt2;
        
        Scanner entrada = new Scanner(System.in);

        txt1 = entrada.nextLine();
        txt2 = entrada.nextLine();

        Stringss s = new Stringss(txt1, txt2);

        System.out.println("Length of string 1: " + s.stringLength(txt1));
        System.out.println("Length of string 2: " + s.stringLength(txt2));

        s.stringCompare(txt1, txt2);

        System.out.printf("\nThere are %d vowels in string 1.\n", s.stringVowel(txt1));
        System.out.printf("There are %d vowels in string 2.\n\n", s.stringVowel(txt2));

        System.out.println("Concat of the two strings: " + s.concatStrings(txt1, txt2));

        entrada.close();
    }
}
