import java.util.Random;

public class Task02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Random rand = new Random();
		 int [] array = new int[10];
		 
		 
		 for (int i = 0; i < array.length-1; i++) {
			 array[i] = ((int)(Math.random() * 31) - 15);
		 }
		 
		 int max = array[0];
		 int min = array[0];
		 
		 for (int i = 1; i < array.length-1; i++) {
			 if (max < array[i]) {
				 max = array[i];
			 }
			 
			 if (min > array[i]) {
				 min = array[i];
			 }
		 }
		 
		 
		 for (int i = 0; i < array.length-1; i++) {
			 System.out.print(array[i]+" | ");
		 }
		 
		 System.out.println("\nMax = "+max+"; Min = "+min+"| Разница: "+(max-min));

	}

}
