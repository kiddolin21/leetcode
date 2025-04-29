public class LRUCache {
	static class Node {
        int key;
        int value;
        Node prev;
        Node next;

        Node(int k, int v) {
            this.key = k;
            this.value = v;
            Node prev = null;
            Node next = null;
        }
    }
	
	static class DoublyLL {
		int count;
		int capacity;
		Node head;
		Node tail;
		
		DoublyLL(int capacity) {
			this.count = 0;
			this.capacity = capacity;
			this.head = new Node(0,0);
			this.tail = new Node(0,0);
			this.head.next = this.tail;
			this.tail.prev = this.head;
			
		}
	}
	
	 Map<Integer,Node> map;
	    DoublyLL dll;
	    
	    public LRUCache(int capacity) {
	        dll = new DoublyLL(capacity);
	        this.map = new HashMap<Integer,Node>();
	    }
	    
	    public int get(int key) {
	        if(map.containsKey(key)) {
	        	Node n = map.get(key);
	        	if(n.prev != dll.head) {
	        		detach(n);
	        		attach(n);
	        	}
	        	return n.value;
	        }
	        else return -1;
	    }
	    
	    public void set(int key, int value) {
	    	Node n;
	        if(!map.containsKey(key)) {
	        	n = new Node(key,value);
	            if(dll.capacity != dll.count)
	            	dll.count++;
	            else {
	            	map.remove(dll.tail.prev.key);
	            	detach(dll.tail.prev);
	            }
	            attach(n);
	            map.put(key,n);
	        } else {
	        	n = map.get(key);
	        	n.value = value;
	        	detach(n);
	        	attach(n);
	        }
	    }
	    private void attach(Node node) {
	    	node.prev = dll.head;
	    	node.next = dll.head.next;
	    	dll.head.next.prev = node;
	    	dll.head.next = node;
	    }
	    
	    private void detach(Node node) {
	    	node.prev.next = node.next;
	    	node.next.prev = node.prev;
	    }
}
