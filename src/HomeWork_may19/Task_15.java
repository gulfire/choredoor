package HomeWork_may19;

public class Task_15 {

	public static void main(String[] args) {
		/*
		 * # Task15
`
Write a program to extract digits from a String:
     input: ab123c4d56efg
     output:123456
`
		 */
		
		//String input = "ab123c4d56efg";
	//	String input1 = input.substring(2, 5);
	//	String input2=input.substring(6, 7);
	//	String input3=input.substring(8, 10);
		
		//System.out.println(input1+input2+input3);
		String input="jbjd87587gjv89v9r";
		
		String extract = input.replaceAll("[^0-9]", "");
		System.out.println(extract);
		                                                          

}}
