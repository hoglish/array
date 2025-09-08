import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        char[] inputArray = {'а', 'т', 'А', 'в', 'В', 'Г', 'Л', 'д'};
        List<Character> upperCaseList = new ArrayList<>();
        List<Character> lowerCaseList = new ArrayList<>();
        for (char symbol : inputArray) {
            if (Character.isLowerCase(symbol)) {
                lowerCaseList.add(symbol);
            } 
            else if (Character.isUpperCase(symbol)) {
                upperCaseList.add(symbol);
            }
        }
        System.out.println("Массив данных с заглавными буквами: " + upperCaseList);
        System.out.println("Массив данных со строчными буквами: " + lowerCaseList);
    }
}