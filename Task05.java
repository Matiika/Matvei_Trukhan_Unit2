import java.util.Random;

public class Task05 {

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
		 
		 
		 for (int i = 1; i < array.length; i++) {
		        int temp = array[i];
		        int j = i - 1;
		        while(j >= 0 && temp < array[j]) {
		            array[j+1] = array[j];
		            j--;
		        }
		        array[j+1] = temp;
		    }
		 
		 System.out.println("\nОтсортированный массив:");
		 
		 for (int i = 0; i < array.length; i++) {
			 System.out.print(array[i]+" | ");
		 }
	}

}
