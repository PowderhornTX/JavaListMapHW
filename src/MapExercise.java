import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class MapExercise {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		Map<String, String> carList = new HashMap<>();
		
		carList.put("Civic", "Honda");
		carList.put("Rio", "Kia");
		
		System.out.println("Enter a model of car:");
		String model = input.nextLine();
		
		System.out.printf("Ah, so you're looking for a %s? They're right over here.\n", carList.get(model));
		
	}

}
