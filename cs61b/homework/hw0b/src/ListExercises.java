import java.util.ArrayList;
import java.util.List;

public class ListExercises {

    /** Returns the total sum in a list of integers */
    public static int sum(List<Integer> L) {
        // TODO: Fill in this function.
        int sum = 0;
        for (int i = 0; i < L.size(); i++){
            sum += L.get(i);
        }
        return sum;
    }

    /** Returns a list containing the even numbers of the given list */
    public static List<Integer> evens(List<Integer> L) {
        // TODO: Fill in this function.
        List<Integer> list = new ArrayList<>();
        int sum = 0;
        for (int num : L){
            if (num % 2 == 0){
                list.add(num);
            }
        }

        return list;
    }

    /** Returns a list containing the common item of the two given lists */
    public static List<Integer> common(List<Integer> L1, List<Integer> L2) {
        // TODO: Fill in this function.
        List<Integer> list = new ArrayList<>();
        for (int num1 : L1){
            for (int num2 : L2){
                if (num1 == num2){
                    list.add(num1);
                }
            }
        }
        return list;
    }


    /** Returns the number of occurrences of the given character in a list of strings. */
    public static int countOccurrencesOfC(List<String> words, char c) {
        // TODO: Fill in this function.
        int count = 0;
        for (String s : words){
            for (int i = 0; i < s.length(); i++){
                if (s.charAt(i) == c){
                    count++;
                }
            }
        }
        return count;
    }
}
