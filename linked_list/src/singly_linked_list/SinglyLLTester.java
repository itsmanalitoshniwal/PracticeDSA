package singly_linked_list;
import java.util.*;

public class SinglyLLTester {

	public static void main(String[] args) {
		SinglyLL list = new SinglyLL();
		int choice;
		Scanner sc = new Scanner(System.in);
		do {
		System.out.println("0. EXIT");
		System.out.println("1. display linked list");
		System.out.println("2. addfirst");
		System.out.println("3. addlast");
		System.out.println("4. addatposition");
		System.out.println("5. deletefirst");
		System.out.println("6. deletelast");
		System.out.println("7. delete at position");
		System.out.println("8. delete all");
		System.out.println("9. find minimum element");
		System.out.println("10. find maximum element");
		System.out.println("11. find middle element");
		System.out.println("12. sort linked list");
		System.out.print("Enter your choice = ");

		
		choice = sc.nextInt();
		int value;
		int pos;

		switch (choice) {
		case 0:
			System.out.println("Exit...");
			System.exit(0);
			
		case 1:
			System.out.println("display linked list");
			list.display();
			break;
			
		case 2:
			System.out.println("addfirst");
			System.out.println("Enter value");
			value = sc.nextInt();
			list.addFirst(value);
			break;
			
		case 3:
			System.out.println("add at position");
			System.out.println("Enter value and position");
			value = sc.nextInt();
			pos = sc.nextInt();
			list.addAtPos(value, pos);
			break;
			
		case 4:
			System.out.println("addlast");
			System.out.println("Enter value");
			value = sc.nextInt();
			list.addLast(value);
			break;
			
		case 5:
			System.out.println("deletefirst");
			list.delFirst();
			break;
		case 6:
			System.out.println("deletelast");
			list.deleteLast();
			break;
		case 7:
			System.out.println("delete at position");
			System.out.println("enter position");
			pos = sc.nextInt();
			list.delAtPos(pos);
			break;
		case 8:
			System.out.println("delete all");
			list.deleteAll();
			break;
		case 9:
			System.out.println("minimum element: "+ list.min());
			
			break;
		case 10:
			System.out.println("maximum element: "+list.max());
			
			break;
		case 11:
			System.out.println("middle element: "+ list.mid());
			break;
		case 12:
			System.out.println("sort linked list");
			list.sort();
			break;
		default :
			System.out.println("Wrong choice entered");
			break;
		}
	}while(choice!=0);
	}

}
