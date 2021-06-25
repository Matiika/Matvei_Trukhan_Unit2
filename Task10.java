import java.util.Scanner;

public class Task10 {

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
			for (int j = 0; j < array[i].length; j++) {
				 if (i == 0) {
					 array[i][j] = 1;
				 }
				 
				 if (j == 0) {
					 array[i][j] = 1;
				 }
				 
				 if (i == array.length-1) {
					 array[i][j] = 1;
				 }
				 
				 if (j == array.length-1) {
					 array[i][j] = 1;
				 }
				 
			}
		}
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				 System.out.print(array[i][j]+" | ");
			}
			System.out.println();
		}
	}

}
