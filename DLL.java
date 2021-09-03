package day13;


class Node
{
	int data;
	Node prev,next;
	//creates a node in parameterized constructor
	public Node(int ele)
	{
		data = ele;
		prev=null;
		next=null;
	}
}

public class DLL {
	Node head;
	int count;
	public DLL()
	{
		head=null;
		count=0;
	}
	
	Node createNode(int ele)
	{
		Node nd = new Node(ele);
		count++;
		return nd;
	}
	void insertbegin(int ele)
	{
		Node newnode = createNode(ele);
		if(head==null)
			head = newnode;
		else
		{
			newnode.next=head;
			head.prev=newnode;
			head=newnode;
		}
	}
	void insertend(int ele)
	{
		Node newnode = createNode(ele);
		if(head==null)
			head = newnode;
		else
		{
			Node temp=head;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=newnode;
			newnode.prev = temp;
		}
	}
	
	void insertpos(int pos,int ele)
	{
		if(pos==1)
			insertbegin(ele);
		else if(pos==count+1)
			insertend(ele);
		else
		{
			Node newnode = createNode(ele);
			Node pp,cp;
			pp=cp= head ;			
			for(int i=1;i<pos;i++)
			{
				pp=cp;
				cp=cp.next;
			}
			pp.next=newnode;
			newnode.prev=pp;
			newnode.next=cp;			
			cp.prev=newnode;
			count++;
		}
	}
	void display()
	{
		if(head==null)
			System.out.println("List is empty");
		else
		{
			System.out.println("List elements are = ");
			Node temp=head;
			while(temp!=null)
			{
				System.out.print(temp.data + " --> ");
				temp=temp.next;
			}
			System.out.println("");
		}
	}
}





