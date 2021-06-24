import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;

public class ForEachExercise {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		List<Integer> numbers = new ArrayList();
		
		for (int i = 0; i < 5; i++) {
			System.out.printf("Enter a number (%s): ", i + 1);
			numbers.add(Integer.parseInt(input.nextLine()));
		}
		
		int sum = 0, product = 1;
		
		for (int item : numbers) {
			sum += item;
			product *= item;
		}
		
		System.out.printf("\nNumbers add up to %s.\n", sum);
		System.out.printf("Product of numbers is %s.\n", product);
		System.out.printf("Largest number is %s.\n", Collections.max(numbers));
		System.out.printf("Smallest number is %s.\n", Collections.min(numbers));
		
	}

}
