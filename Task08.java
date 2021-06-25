import java.util.Random;
import java.util.Scanner;

public class Task08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] array = new int[5][6];
		
		Random rand = new Random();
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				 array[i][j] = (rand.nextInt(10));
			}
		}
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				 System.out.print(array[i][j]+" | ");
			}
			System.out.println();
		}

		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Какую строку вывести > ");
		int str = sc.nextInt();
		
		for (int i = 0; i < array[str-1].length; i++) {
				 System.out.print(array[str-1][i]+" | ");
		}
		
		System.out.print("\nКакой столбец вывести > ");
		int col = sc.nextInt();
		
		for (int i = 0; i < array.length; i++) {
				 System.out.print(array[i][col-1]+" | ");
		}
		
	}

}
