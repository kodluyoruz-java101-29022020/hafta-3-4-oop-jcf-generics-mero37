package question2;

public class MyLinkedList<T> {

	 private Node<T> head;
	    private Node<T> tail;
	    private int size;

	    public MyLinkedList() {
	        this.size = 0;
	    }

	    //Listedeki eleman sayısını bulur.
	    public int size() {
	        int listSize = 0;
	        Node tempNode = head;
	        while (tempNode != null) {
	            listSize++;
	            tempNode = tempNode.next;
	        }
	        return listSize;
	    }

	    public boolean isEmpty() {
	        return size == 0;
	    }

	    
	    //Listeye yeni eleman ekler.
	  
	    public void addElement(T element) {
	        if (head == null)
	            head = tail = new Node<>(element);
	        
	        else if (head.element == element) {
	        	
	        	Node tempNode = new Node(element);
	            tempNode.next = head;
	            head.prev = tempNode;
	            head = tempNode;
	            
	        } 
	        
	        else if (tail.element == element) {
	        	
	        	Node newNode = new Node(element);
	            tail.next = newNode;
	            newNode.prev = tail;
	            tail = newNode;
	            
	        }
	        else {
	        	Node newNode = new Node(element);
	        	Node temp = head;
	        	
	            while (temp.next != null && temp.element != element) {
	            	
	                temp = temp.next;
	                
	            }
	            
	            newNode.next = temp.next;
	            newNode.prev = temp;
	            temp.next = newNode;
	        }
	        
	    }

	    
	    //Listedeki elemanları ekrana yazdırır.
	
	    public void writeListElements() {
	    	Node temp = head;
	        StringBuilder builder = new StringBuilder();
	        while (temp != null) {
	            builder.append("Eleman : ");
	            builder.append(temp.element);
	            builder.append(" | ");
	            System.out.print(builder.toString());
	            temp = temp.next;
	        }
	        System.out.println();
	    }

	    
	    //Listedeki elemanları siler.
	   
	    public void removeElement(T element) {
	        
	        if (head == null)
	            head = tail = new Node<>(element);
	        if (head.element == element) {
	            head = head.next;
	            if (head != null)
	                head.prev = null;
	        }
	    
	        else if (tail.element == element) {
	            tail = tail.prev;
	            if (tail != null)
	                tail.next = null;
	        } else {
	            Node tempNode = head;
	            while (tempNode.next != null && tempNode.next.element != element) {
	                tempNode = tempNode.next;
	            }
	            if (tempNode != null) {
	                tempNode.next = tempNode.next.next;
	                tempNode.prev = tempNode;
	            }
	        }
	    }


	    
	    //Listede arama işlemi yapar.
	 
	    public boolean searchElement(T element) {
	        Node tempNode = head;
	        while (tempNode != null) {
	            if (tempNode.element == element) {
	                return true;
	            }
	            tempNode = tempNode.next;
	        }
	        return false;
	    }

	}
