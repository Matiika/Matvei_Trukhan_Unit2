import java.util.Random;
import java.util.Scanner;

public class Task09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Какой размер матрицы > ");
		int str = sc.nextInt();
		
		int[][] array = new int[str][str];
		
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				 array[i][j] = 0;
			}
		}
		
		for (int i = 0; i < array.length; i++) {
				 array[array.length-1-i][i] = array.length-i;
		}	
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				 System.out.print(array[i][j]+" | ");
			}
			System.out.println();
		}
		
	}

}
