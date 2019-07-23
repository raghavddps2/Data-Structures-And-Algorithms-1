package Lecture12;
class LinkedList1{

	Node head;
	class Node{

		int data;
		Node next;

		Node(int data){
			this.data = data;
			this.next = null;
		}
		int getData(){
			return this.data;
		}
	}

	public LinkedList1 insertElement(LinkedList1 list,int data){
		Node new_node = new Node(data);
		
		if(list.head == null){
			list.head = new_node;
		}
		else{
			Node last = list.head;
			while(last.next != null){
				last = last.next;
			}
			last.next = new_node;
		}
		return list;
	}

	public void printElements(LinkedList1 list){
		
		Node currNode = list.head;
		if(list.head == null){
			System.out.println("List is empty");
		}
		else{
			while(currNode != null){
				System.out.print(currNode.data+" ");
				currNode = currNode.next;
			}
		}
		System.out.println();
	}

	public LinkedList1 reverseElements(LinkedList1 list){

		LinkedList1 new_list = new LinkedList1();
		Node currHead = list.head;
		int count = 0;
		while(currHead != null){
			count++;
			currHead = currHead.next;
		}
		//System.out.println(count+"");

		while(count != 0){
			int rel = 0;
			Node currHead1 = list.head;
			while(rel != (count-1)){
				//System.out.println(currHead1.getData()+" ");
				currHead1 = currHead1.next;
				rel++;
			}
			
			Node new_node = new Node(currHead1.getData());
			if(new_list.head == null){
				new_list.head = new_node;
			}
			else{
				Node traverse = new_list.head;
				while(traverse.next != null){
					traverse = traverse.next;
				}
				traverse.next = new_node;
			}
			count--;
		}
		return new_list;
	}

	public void reverseLLrec(LinkedList1 list){

		if(list == null){
			return;
		}
		reverseLLrec(list.next);
		System.out.print(list.getData());
	}

}
