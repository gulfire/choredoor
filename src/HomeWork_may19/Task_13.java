package HomeWork_may19;

public class Task_13 {
	public static void main(String[] args) {
		
		/*Task13
`
Create a class called EmailTask2.
       Assume that email address is constructed by person's first name and followed by an underscore and last name.

       Write a program that will print out information about user based on email. Print first name, last name, and domain.

       First and Last name should be printed with proper format - uppercase first letter and remaining lowercase.

               Ex:
                   input:
                       techcircle_school@aws.com

                Output:
                    First name: Techcircle
                    Last name: School
                    Domain: aws
`
		 * 
		 */
	  String mail = "gulfire_coskun@gmail.com";
		String result1 = mail.toUpperCase().substring(0, 1) + mail.toLowerCase().substring(1, 7);
		String result2 = mail.toUpperCase().substring(8, 9)+mail.toLowerCase().substring(9, 14);
		String result3 = mail.substring(15, 20);
		System.out.println("First name :" + result1);
		System.out.println("Last Name :" + result2);
		System.out.println("Domain:" + result3);
			  
			  
	}}