import java.util.*;
class intCollect{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		Vector<Integer> v=new Vector<Integer>();
		v.addElement(1);
		v.addElement(3);
		v.addElement(5);
		v.addElement(7);
		v.addElement(9);
		int ch, element1, element2, index, lindex, delElement;
	do{	System.out.println("<---Menu--->");
		System.out.println("1. Insert an element at a specified position");
		System.out.println("2. Insert an element at the end");
		System.out.println("3. Delete an element ");
		System.out.println("4. Display the contents");
		System.out.println("Enter your choice ");
		ch=sc.nextInt();
		switch(ch)
		{
			case 1:
					System.out.println("Enter the element to be inserted");
					element1=sc.nextInt();
					System.out.println("Enter the position at which it must be inserted");
					index=sc.nextInt();
					v.insertElementAt(element1,index);
					System.out.println("The element is successfully inserted!!");
					break;
			case 2:
					System.out.println("Enter the element to be inserted at the end");
					element2=sc.nextInt();
					lindex=v.size();
					v.insertElementAt(element2,lindex);
					System.out.println("The element is successfully inserted!!");
					break;
			case 3:
					System.out.println("Enter the element to be removed");
					delElement=sc.nextInt();
					if(v.removeElement(delElement))
					{
						System.out.println("The element is successfully deleted");
					}
					else
					{
						System.out.println("The element is not found");
					}
					break;
			case 4:
					Enumeration<Integer> vEnum = v.elements();
					System.out.println("\nElements in vector:");
					while(vEnum.hasMoreElements())
						System.out.print(vEnum.nextElement() + " ");
 					System.out.println();
					break;
			default:
					System.out.println("Invalid Choice");
					break;
			}
		} while(ch!=0);



	}
}