
public class CamelCase {

	
	public static void main(String [] args) {
		
		String s = "saveChangesInTheEZditor";
		
		String[] split = s.split("[a+z]");
		
		System.out.println(" length of words "+split.length+"    "+split.toString() ); 
		
	}
}

