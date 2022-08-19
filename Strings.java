public class Stringss {
    String txt1;
    String txt2;
    int cont;

    Stringss(String txt1, String txt2){
        this.txt1 = txt1;
        this.txt2 = txt2;
    }

    /**
     * @param txt
     * Metodo para calcular tamanho da string sem contar espaços em branco.
     * @return
     */
    int stringLength(String txt){
        return txt.trim().length();
    }

    /**
     * @param txt1
     * @param txt2
     * Compara strings para ver se é igual, maior ou menor.
     */
    void stringCompare(String txt1, String txt2){
        if (txt1.equalsIgnoreCase(txt2)){
            System.out.println("Strings are equals.");
        } else {
            System.out.println("Strings aren't equals.");
        }
    }

    /**
     * @param txt
     * Conta a quantidade de vogal em uma string.
     * @return
     */
    int stringVowel(String txt){
        cont = 0;
        for (int i = 0; i < txt.length(); i++){
            char ch = txt.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || 
            ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
                cont++;
        }
    return cont;
    }

    String concatStrings(String txt1, String txt2){
        return txt1.concat(txt2);
    } // NOT WORKING AS I EXPECTED ***

}
