package Downloads.baseballGamePractice.src.main.java.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Baseball {
    private List<Integer> numbers = new ArrayList<Integer>();


    public Baseball() {
        while(numbers.size()!=3) {
            Random random = new Random();
            int value = random.nextInt(9) + 1;

            if (!numbers.contains(value)) {
                numbers.add(value);
            }
        }

    }

    public List<Integer> getNumbers() {
        return numbers;
    }
}
