import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class evennumbers {
    static int[] getEvenNumbers(int[] numbers) {
        List<Integer> evens = new ArrayList<>();

        for (int n : numbers) {
            if (n % 2 == 0) {
                evens.add(n);
            }
        }

        int[] result = new int[evens.size()];
        for (int i = 0; i < evens.size(); i++) {
            result[i] = evens.get(i);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(getEvenNumbers(numbers)));
    }
}