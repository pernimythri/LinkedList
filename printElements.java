public class printElements{
  void print(Node head)
  {
    Node current=head;
    while(current!=null)
    {
      System.out.print(current.data);
      if (current.next != null) {
        System.out.print(" -> ");
        }
      current=current.next;
    }
  }
}
