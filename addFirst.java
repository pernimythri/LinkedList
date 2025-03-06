class addFirst{
  Node First(Node head,int val)
  {
    Node current=new Node(val);
    current.next=head;
    head=current;
    return head;
    
  }
  
}
