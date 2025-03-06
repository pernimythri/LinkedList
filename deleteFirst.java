class deleteFirst{
  Node First(Node head)
  {
    if(head==null || head.next==null)
    return null;
    return head.next;
  }
  
}
