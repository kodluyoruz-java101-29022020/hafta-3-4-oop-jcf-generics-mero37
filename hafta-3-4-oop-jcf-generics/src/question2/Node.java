package question2;

public class Node<T> {
		
		T element;
		Node next;
		Node prev;
	    int index;

	    public Node(T element) {
	    	
	        this.element = element;
	        this.next = null;
	        this.prev = null;
	        
	    }


	    public Node(int index, T element) {
	    	
	        this.element = element;
	        this.next = null;
	        this.prev = null;
	        this.index = index;
	        
	    }

	    public Node() {
	    	
	        this.element = null;
	        this.next = null;
	        this.prev = null;
	        this.index = 0;
	        
	    }
	}

