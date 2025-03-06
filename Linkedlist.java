import java.util.*;

class Linkedlist{
public Node convert(int[] arr)
{
Node head=new Node(arr[0]);
Node current=head;
for(int i=1;i<arr.length;i++)
{
Node temp=new Node(arr[i]);
current.next=temp;
current=temp;
}
return head;
}
}
