import java.util.Random;

public class Task04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Random rand = new Random();
		 int [] array = new int[6];
		 
		 
		 
		 
		 for (int i = 0; i < array.length; i++) {
			 array[i] = (rand.nextInt(20) - 10);
		 }
		 
		 
		 System.out.println("Массив:");
		 
		 for (int i = 0; i < array.length; i++) {
			 System.out.print(array[i]+" | ");
		 }
		 
		 int temp = 0;
		 
		 boolean needIteration = true;
		 while (needIteration) {
		 	needIteration = false;
		 	for (int i = 1; i < array.length; i++) {
		 		if (array[i] < array[i - 1]) {
		 			temp = array[i];
		 		    array[i] = array[i-1];
		 		    array[i-1] = temp;
		 			needIteration = true;
		 		}
		 	}
		 }
		 
		 System.out.println("\nОтсортированный массив:");
		 
		 for (int i = 0; i < array.length; i++) {
			 System.out.print(array[i]+" | ");
		 }


	}

}
