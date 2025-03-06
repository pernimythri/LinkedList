class deleteLast{
  Node Last(Node head)
  {
    Node previous = null;
    Node current=head;
    while(current.next!=null)
    {
      previous=current;
      current=current.next;
    }
    previous.next=null;
    return head;
  }
}
