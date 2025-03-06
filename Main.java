import java.util.*;

class Main{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int[] arr=new int[n];
for(int i=0;i<n;i++)
{
  arr[i]=sc.nextInt();
}
Node head=new Linkedlist().convert(arr);
printElements obj=new printElements();
obj.print(head);


// add first
System.out.print("\n"+"Enter element to add at first: ");
int val=sc.nextInt();
head=new addFirst().First(head,val);
obj.print(head);


// add last
System.out.print("\n"+"Enter element to add at last : ");
val=sc.nextInt();
head=new addLast().Last(head,val);
obj.print(head);


// add at Kth position
System.out.print("\n"+"Enter position and value : ");
int position=sc.nextInt();
val=sc.nextInt();
head=new addKPosition().addK(head,position,val);
obj.print(head);


// Delete First
System.out.print("\n"+"Deleting First : ");
head=new deleteFirst().First(head);
obj.print(head);


// Delete Last
System.out.print("\n"+"Deleting Last : ");
head = new deleteLast().Last(head);
obj.print(head);


// Delete Kth position
System.out.print("\n"+"Enter position : ");
position=sc.nextInt();
head = new deleteKPosition().deleteK(head,position);
obj.print(head);


}
}
