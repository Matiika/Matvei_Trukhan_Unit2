import java.util.Random;

public class Task03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		 Random rand = new Random();
		 int [] array = new int[10];
		 int pos = 0;
		 int neg = 0;
		 int zero = 0;
		 
		 
		 
		 for (int i = 0; i < array.length; i++) {
			 array[i] = (rand.nextInt(20) - 10);
			 if (array[i]>0) {
				 pos++;
			 } else if (array[i] < 0){
				 neg++;
			 } else {
				 zero++;
			 }
		 }
		 
		 
		 System.out.println("Массив:");
		 
		 for (int i = 0; i < array.length; i++) {
			 System.out.print(array[i]+" | ");
		 }
		 
		 System.out.println("\nПоложительных: "+pos+"| Негативных: "+neg+"| Нулевых: "+zero);
		 

	}

}
