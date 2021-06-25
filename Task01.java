import java.util.Random;

public class Task01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Random rand = new Random();
		 int [] array = new int[10];
		 int count = 0;
		  
		 for (int i = 0; i < array.length; i++) {
			 array[i] = (rand.nextInt(10) + 1);
			 if (array[i]%2 == 0) {
				 count++;
			 }
		 }
		 
		 int [] array2 = new int[count];
		 int j=0;
		 
		 for (int i = 0; i < array.length; i++) {
			 if (array[i]%2 == 0) {
				array2[j] = array[i];
				j++;
				
			 }
		 }
		 
		 System.out.println("Массив:");
		 
		 for (int i = 0; i < array.length; i++) {
			 System.out.print(array[i]+" | ");
		 }
		 
		 System.out.println("\nЧетные числа из массива:");
		 
		 for (int i = 0; i < array2.length; i++) {
			 System.out.print(array2[i]+" | ");
		 }
		 
	}

}
