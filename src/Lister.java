public class Lister {
  private Node first, last;
  private int size;
  
  public Lister() {
    first = new Node( null );
    last = new Node( null );
    
    first.next = last;
    last.prev = first;
    
    size = 0;
  }
  
  public int size() {
    return size;
  }
  
  public boolean empty() {
    return size == 0;
  }
  
  public String toString() {
	  StringBuffer sb = new StringBuffer();
	  
	  sb.append( "[List:" );
	  
	  for ( Node n = first.next; n!=last; n = n.next )
	    sb.append( " " + n.getData() );
	  
	  sb.append( "]" );
	  
	  return sb.toString();
	}
  
  public void insertFirst( Object data ) {
	  Node n = new Node( data, first, first.next );
	  first.next.prev = n;
	  first.next = n;
	  
	  size++;
	}
  
  public void insertLast( Object data ) {
	  Node n = new Node( data, last.prev, last );
	  last.prev.next = n;
	  last.prev = n;
	  
	  size++;
	}
  
  public Object removeFirst() {
	  if ( !empty() ) {
	    Node help = first.next;
	    help.next.prev = first;
	    first.next = help.next;
	    size--;
	    return help.getData();
	  } else
	    return null;
	}
  
  public Object removeLast() {
	  if ( !empty() ) {
	    Node help = last.prev;
	    help.prev.next = last;
	    last.prev = help.prev;
	    size--;
	    return help.getData();
	  } else
	    return null;
	}
  
  // access-metoder
}