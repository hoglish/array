import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        char[] inputArray = {'а', '1', '6', 'в', '8', 'Г', '9', 'д'};

        List<Character> numberList = new ArrayList<>();
        List<Character> letterList = new ArrayList<>();

        for (char symbol : inputArray) {
            if (Character.isDigit(symbol)) {
                numberList.add(symbol);
            } else {
                letterList.add(symbol);
            }
        }

        System.out.println("Массив данных с буквами: " + letterList);
        System.out.println("Массив данных с числами: " + numberList);
    }
}