package HomeWork_may19;

public class Task_14 {

	public static void main(String[] args) {
		/*## Task14
`Write a program that asks user to enter first and last names, and then prints the full name in regular format (first character in upper case)

                    input:
                        firstName = "tecHCIrcle"
                        lastName = "SCHOOL";

                    output:
                        Techcircle School
		 * 
		 */
		
		String name1 = "TecHCIrcle";
		String name2 = "SCHOOL";
		String result1 = name1.toUpperCase().substring(0, 1)+ name1.toLowerCase().substring(1);
		String result2 = name2.toUpperCase().substring(0, 1)+ name2.toLowerCase().substring(1);
		System.out.println(result1 + " " + " " + result2 );
		
		
	
}
}