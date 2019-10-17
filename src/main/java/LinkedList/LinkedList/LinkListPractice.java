package LinkedList.LinkedList;

public class LinkListPractice 
{
	Node head;
	
	public void insert(int data) 
	{
		Node node = new Node(); //objectを作る 
		node.data=data; 
	
		if (head == null) {
			head = node;
		}
		else
		{
			Node nextNode = head;
			while(nextNode.next!=null) {
				nextNode=nextNode.next;
			}
			nextNode.next = node;
			
		}
	 	
	}
	public void show() {
		Node node=head;
		while(node.next!=null) {
			System.out.println(node.data);
			node = node.next;
			}
		System.out.println(node.data);
	}


	public void insertAtFirst(int data) {
		
		Node node = new Node();
		node.data=data;
		node.next=head;
		head = node;
		
		
		
		
		
	}




}
