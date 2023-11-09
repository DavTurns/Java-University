import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        List<String> testeString = new ArrayList<>();
        testeString.add("a b c d a ab maria maria");
        BagOfWords bag = new BagOfWords(testeString);
        System.out.println(bag.wordMap);

    }
}