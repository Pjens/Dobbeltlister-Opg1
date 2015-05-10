public class Node {
  private Object data;
  protected Node prev, next;
  
  public Node( Object data ) {
    this( data, null, null );
  }
  
  public Node( Object data, Node prev, Node next ) {
    this.data = data;
    this.prev = prev;
    this.next = next;
  }
  
  public Object getData() {
    return data;
  }
}