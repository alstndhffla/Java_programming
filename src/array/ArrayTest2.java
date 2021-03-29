package array;

public class ArrayTest2 {
	public static void main(String[] args) {
		double[] date = new double[5];
		int size = 0;
		
		date[0] = 10.0; size++;
		date[1] = 20.0; size++;
		date[2] = 20.0; size++;
		date[3] = 20.0; size++;
		date[4] = 20.0; size++;
		 
		for(int i = 0; i < size; i++) {
			System.out.println(date[i]);
		}
		
	
}
}
