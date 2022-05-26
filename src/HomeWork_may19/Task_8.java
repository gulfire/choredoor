package HomeWork_may19;

public class Task_8 {

	public static void main(String[] args) {
		/*
		 * Task_8
		 * write a program that asks the user enter a three letter word. Check if the middle
character of the given word is 'a'. In the case it is print: "Cool word", but in the case
the middle letter is not 'a' print: "Okay word".
     - If the user does not enter a 3 letter word tell them:
             If the word is less than 3 letters: "Word is too short"
             If the word is too long: "Word is too long"
`
		 */
		String st = "The";
		if(st.length()==3) {
			if(st.charAt(1)=='a');
			System.out.println("Cool word");
		}else {
			System.out.println("Okay word");
			
		}
		
		
		
		if (st.length()>3) {
			System.out.println("Word is too long");
		
		}else if (st.length()<3) {
			System.out.println("Word is too short");
		}
	}

}
