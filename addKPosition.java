class addKPosition{
  Node addK(Node head,int position,int val)
  {
    Node newnode=new Node(val);
    int count=0;
    Node current=head;
    Node previous=null;
    while(current!=null)
    {
      count+=1;
      if(count==position)
      {
        previous.next=newnode;
        newnode.next=current;
        break;
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
