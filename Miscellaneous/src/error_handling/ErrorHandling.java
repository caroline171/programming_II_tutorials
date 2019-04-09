package error_handling;

public class ErrorHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array = new int[5];
		array[0] = 1;
		array[1] = 10;
		array[2] = 100;
		array[3] = 1000;
		array[4] = 10000;
//		try {
//			processArray(array);
//		} catch (NullPointerException e) {
//			// TODO: handle exception
//		} catch (ArrayIndexOutOfBoundsException e) {
//			
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
//		
		processArray(array);
		
		System.out.println("After Erroneous Call");
	}
	
	public static void processArray(int[] array) throws ArrayIndexOutOfBoundsException, NullPointerException {
		for (int i : array) {
			System.out.println("Array item is " + i);
		}
		
		try {
			System.out.println(array[10]);
				
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception here " + e.getMessage());
		} 	
		
	}

}
