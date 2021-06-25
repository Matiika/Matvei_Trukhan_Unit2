import java.util.Random;

public class Task07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] array = new int[5][5];
		
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
		
		System.out.println("\nЁлементы на главной диагонали: ");
		
		for (int i = 0; i < array.length; i++) {
				 System.out.print(array[i][i]+" | ");
		}	
		
		System.out.println("\nЁлементы на побочной диагонали: ");
		
		for (int i = 0; i < array.length; i++) {
				 System.out.print(array[array.length-1-i][i]+" | ");
		}	
		
	}

}
