import java.util.*;
import java.util.Scanner;

public class ToroBot
{
	public static void main(String[] args) 
	{
	 System.out.println("Welcome CSUDH Student. My name is ToroBot. How can I help you today?: " );
	 Scanner input = new Scanner(System.in);
	 String question = input.nextLine();
	 String strLowerCase = question.toLowerCase();
	 while(true)
	 {
	 if (strLowerCase.toString().contains("financial aid"))
	 {
		
		System.out.println("\n Here is the link: https://www.csudh.edu/financial-aid/ ");
		break;
	 }
	 
	 else if (strLowerCase.toString().contains("tuition"))
	 {
	 System.out.println("\n Fees for credential students may vary per semester.Please visit our website at the following URL:https://www.csudh.edu/financial-aid/cost/ for a complete breakdown of the costs ");
	 break;
	 }
	 
	 else if (strLowerCase.toString().contains("calender"))
	 {
	 System.out.println("\n Here is the most recent calender:  https://www.csudh.edu/Assets/csudh-sites/academic-affairs/academic-calendar/docs/2021-2022%20academic%20calendar%20approved.pdf ");
	 break;
	 }
	 else 
	 {
	 System.out.println("\n I do not understand your question. Please provide me with more details. ");
	 break;
	 }
	 
	 }
	 
	}
}