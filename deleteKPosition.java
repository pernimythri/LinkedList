class deleteKPosition{
  Node deleteK(Node head,int position)
  {
    int count=0;
    Node previous=null;
    if(head==null || head.next==null)
    return null;
    
    Node current=head;
    while(current!=null)
    {
      count+=1;
      if(count==position)
      {
        previous.next=current.next;
      }
      else
      {
        previous=current;
        current=current.next;
      }
    }
    return head;
  }
}
