class addLast{
  Node Last(Node head,int val)
  {
    Node newnode=new Node(val);
    Node current=head;
    while(current.next!=null)
    {
      current=current.next;
    }
    current.next=newnode;
    newnode.next=null;
    return head;
  }
  
}
