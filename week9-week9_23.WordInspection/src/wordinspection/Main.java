/*
Temas: Leer archivos. Character Set
*/
package wordinspection;

import java.io.File;

public class Main {

    public static void main(String[] args) throws Exception {
        // test your code here

        File file = new File("src/shortList.txt");
        WordInspection inspect = new WordInspection(file);
        System.out.println(inspect.wordsWhichContainAllVowels());
        // all words are in file src/wordList.txt

    }
}
