import java.util.Random;

public class Task06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] array = new int[5][5];
		
		Random rand = new Random();
		int count = 0;
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				 array[i][j] = (rand.nextInt(10));
				 if (array[i][j]==7) {
					 count++;
				 }
			}
		}
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				 System.out.print(array[i][j]+" | ");
			}
			System.out.println();
		}
		
		System.out.println("Количество 7: "+count);

	}

}
