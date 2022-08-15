import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> finalList = new ArrayList<>();
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);

        for (int elem:intList) {
            if ((elem > 0) && (elem % 2 == 0)) {
                finalList.add(elem);
            }
        }

        finalList.sort(Comparator.naturalOrder());

        for (int c:finalList){
            System.out.println(c);
        }
    }
}
