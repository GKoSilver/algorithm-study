package 额外;

public class 循环删除 extends Node{

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int n=10;
		Linkedlst lst = new Linkedlst();
		Node head = new Node(1,null);
		lst.addHead(head);
		for(int i=1;i<n;i++) {
			lst.addTail(new Node(i));
		}
//		System.out.println("打印链表：");
//		lst.printList();
//		System.out.println();
//		System.out.println("删除首端节点：");
//		lst.delHead();
//		lst.printList();
//		System.out.println();
//		System.out.println("删除首端节点：");
//		lst.delHead();
//		lst.printList();
//		System.out.println();
//		lst.delIndex(2);
//		lst.printList();
		for(int i=0;i<n;i++) {
			System.out.println();
			if(i%3==0&&i!=0) {
				lst.delIndex(i);
			}
		}
		
		lst.printList();
		
		
	}

}
class Node {
	//元素类型为int的节点
	private int data;
	private Node next;
	//定义构造器
	public Node(int i, Node nt){
		data = i;
		next = nt;
	}
	public Node(int i){
		this(i,null);
	}
	public Node(){
		this(0,null);
	}
	//更改元素数值
	public void setData(int i){
		data = i;
	}
	//读取元素数值
	public int getData(){
		return data;
	}
	//更改元素的指向
	public void setNext(Node nt){
		next = nt;
	}
	//读取元素的指向
	public Node getNext(){
		return next;
	}
}
class Linkedlst {
	private Node head;
	private Node tail;
	int size;
	//构造器
	public Linkedlst(){
		tail = head = null;
		size = 0;
	}

	//在链表头部增加节点
	public void addHead(Node hd){
		//如果使用该方法增加链表的第一个节点，则head=tail=hd，且next指向自身。
		if(size==0){
			hd.setNext(hd);
			tail = head = hd;
			size++;
		}
		else{
			tail.setNext(hd);
			hd.setNext(head);
			head = hd;
			size++;
		}
	}

	//在链表尾部增加节点
	public void addTail(Node tl){
		//如果使用该方法增加链表的第一个节点，则tail=head= hd，且next指向自身。
		if(size==0){
			tl.setNext(tl);
			tail = head = tl;
			size++;
		}
		else{
			tail.setNext(tl);
			tl.setNext(head);
			tail = tl;
			size++;
		}
	}

	//删除头部节点，被删掉的head将被自动回收
	public void delHead(){
		if(size>1){
			head = head.getNext();
			tail.setNext(head);
			size--;
		}
		else if(size==1){
			head = tail = null;
			size--;
		}
		else{
			System.out.println("There is no elements in the linked list.");
		}
	}
	//删除指定元素
	public boolean delIndex(int index) {
		if (index < 1 || index > size) {
            return false;
        }
        if (index == 1) {
            head = head.getNext();
            return true;
        }
        int i = 1;
        Node preNode = head;
        Node curNode = preNode.getNext();
        while (curNode != null) {
            if (i == index) {
                preNode.setNext(curNode.getNext());
                return true;
            }
            preNode = curNode;
            curNode = curNode.getNext();
            i++;
        }
        return false;
	}
	
	//删除尾部节点
	public void delTail(){
		if(size>1){
			Node nd = new Node();
			nd = head;
			while(nd.getNext()!=tail){
				nd = nd.getNext();
			}
			nd.setNext(head);
			size--;
		}
		else if(size==1){
			head = tail = null;
			size--;
		}
		else{
			System.out.println("There is no elements in the linked list.");
		}		
	}

	//打印全部节点
	public void printList(){
		Node nd = new Node();
		nd = head;
		try{
			while(nd.getNext()!=head){
				System.out.print(nd.getData());
				System.out.print("->");
				nd = nd.getNext();
			}		
			System.out.print(nd.getData());
			System.out.print("->");
			System.out.print(head.getData());
		}
		catch(Exception e){			
			e.printStackTrace();
		}

	}
}
