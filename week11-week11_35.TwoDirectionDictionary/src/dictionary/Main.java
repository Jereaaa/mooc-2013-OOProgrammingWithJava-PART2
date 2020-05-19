/*
Temas: Leer y escribir archivos
*/
package dictionary;

public class Main {

    public static void main(String[] args) {
        MindfulDictionary dict = new MindfulDictionary("src/words333.txt");
        dict.load();

        System.out.println(dict.translate("apina"));
        System.out.println(dict.translate("ohjelmointi"));
        System.out.println(dict.translate("alla oleva"));
    }
}
