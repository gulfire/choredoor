package HomeWork_may19;

public class Task_7 {

	public static void main(String[] args) {
		/*  
		 * # Task7
`
 Write a method that asks user to enter a string.
        if the string is empty, print: string is empty
        if the string has more than 3 characters, print the last three characters
        if the string has less than or equal 3 characters, print the string itself
		 */
		String str = "Apple";
				if (str.isEmpty()) {
		System.out.println("string is empty");
				}else if (str.length() >3) {
				System.out.println(str.substring(2));
				}else {
					System.out.println(str);
				}
		
		

				
}
}