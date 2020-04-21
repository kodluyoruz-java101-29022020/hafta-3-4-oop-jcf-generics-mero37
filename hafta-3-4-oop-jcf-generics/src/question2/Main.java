package question2;

public class Main {
	 public static void main(String[] args) {

	        MyLinkedList<String> myLinkedList = new MyLinkedList<>();
	        
	        myLinkedList.addElement("Mert");
	        myLinkedList.addElement("Ahmet");
	        myLinkedList.writeListElements();
	        
	        System.out.println(myLinkedList.size());
	        
	        myLinkedList.removeElement("Ahmet");
	        myLinkedList.writeListElements();
	        System.out.println(myLinkedList.size());
	        
	        myLinkedList.addElement("Elif");
	        myLinkedList.addElement("Serhat");
	        myLinkedList.writeListElements();
	        
	        System.out.println(myLinkedList.size());
	        myLinkedList.removeElement("Elif");
	        myLinkedList.writeListElements();
	        System.out.println(myLinkedList.size());


	    }
	}
