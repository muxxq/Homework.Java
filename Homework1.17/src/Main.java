import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Collections;

public class Main{
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        Random rand = new Random();
        for(int i = 0; i < 9; i++)
        {
            int number = rand.nextInt(100);
            numbers.add(number);
        }

        System.out.println("Before sort: ");
        for(Integer number : numbers)
            System.out.println(number);

        Collections.sort(numbers);

        System.out.println("After sort:");
        for(Integer number : numbers)
            System.out.println(number);
    }
}