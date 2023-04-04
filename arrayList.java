//Stephen LaFrankie
//10-27-17
/*Program provides an example of the funcionality of what an Array List does.
  ArrayList is imported and initialized as a "phone list" that accepts strings.
  The program pushes the information to the list, and then asks the user if they'd
  like to remove a name and/or number off the list or if they are satisfied. 
*/
  

import java.util.Scanner;
import java.util.ArrayList;
public class arrayList
{
	public static void main(String[] args)
	{
		Scanner key = new Scanner(System.in);

		ArrayList<String> phoneList = new ArrayList<String>(); //initialize array list
		phoneList.add("Name: Andrew Jung			Phone Number: 757-888-8888");
		phoneList.add("Name: Michael Summers			Phone Number: 757-999-9999");
		phoneList.add("Whiteny Wright				Phone Number: 757-111-1111");
		phoneList.add("Alexander Jones				Phone Number: 757-222-2222");
		phoneList.add("Robert Newmaster			Phone Number: 757-333-3333");
		phoneList.add("Chris Jester				Phone Number: 757-444-4444");
		phoneList.add("Heather Garn				Phone Number: 757-555-5555");
		phoneList.add("Jared Cook				Phone Number: 757-666-6666");
		phoneList.add("Gregry Umfleet)				Phone Number: 757-777-7777");
		phoneList.add("Nicolas					Phone Number: 804-221-2121");

		int size = phoneList.size(); //set variable 'size' as the size of the array list
		int x = 0; //variable manipulated in for loop to give each contact in list a numbering
		char choice = 'y';



			for(x = 0; x<size; x++) //for loop displays list of contacts in numbered ordered
			{
				System.out.printf("List Number: %d%n", x+1);
				System.out.println(phoneList.get(x));
				System.out.println();
			}

			System.out.print("Would you like to take a name off the list? --->"); //offers user ability to remove a contact from list
			System.out.println("y for yes ------- n for no: ");
				choice = key.next().charAt(0);
		while(choice == 'y')//if user answers yes, while loop will ask for number of contact to remove and will resize and reorganize the array
		{
			System.out.println("List Number to remove: ");
			int s = key.nextInt();

			phoneList.remove(s-1);
			size = phoneList.size();

			for(x = 0; x<size; x++)
			{
				System.out.printf("List Number: %d%n", x+1);
				System.out.println(phoneList.get(x));
				System.out.println();
			}

			System.out.print("Would you like to take a name off the list? --->");
			System.out.print("y for yes ------- n for no: ");
				choice = key.next().charAt(0);

		}




	}
}
