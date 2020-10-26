package LinkedList;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer customer = new Customer("Tim", 54.96);
		Customer anothercustomer = customer;
		anothercustomer.setBalance(12.18);
		System.out.println("Balance for customer " +customer.getName()  + " is " + customer.getBalance());
		
		LinkedList<String> placesToVisit= new LinkedList<String>();
		addInOrder(placesToVisit,"Sydney");
		addInOrder(placesToVisit,"Melbourne");
		addInOrder(placesToVisit,"Brisbane");
		addInOrder(placesToVisit,"Perth");
		
		addInOrder(placesToVisit, "Alice Springs");
		printList (placesToVisit);
		
		placesToVisit.remove(4);
		printList (placesToVisit);
				
	}
	private static void printList(LinkedList<String> linkedList)
	{
		Iterator<String> i = linkedList.iterator();
		while(i.hasNext()) {
			System.out.println("Now visiting "+ i.next());
		}		
		System.out.println("======================");
			
	}
	
	private static boolean addInOrder (LinkedList<String> linkedList, String newCity) {
		ListIterator<String> stringListIterator = linkedList.listIterator();
		while(stringListIterator.hasNext()) {
			int comparison = stringListIterator.next().compareTo(newCity);
			if(comparison == 0) {
				//equal, do not add
				System.out.println(newCity + " is already included as a destination");
				return false;						
			} else if(comparison > 0) {
				//new City should appear before this one
				//Brisbane ->Adelaide
				stringListIterator.previous();
				stringListIterator.add(newCity);
				return true;
			}else if (comparison < 0) {			
				
			}
		}
		stringListIterator.add(newCity);
		return true;
	}
	

}
