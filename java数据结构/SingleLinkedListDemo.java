public class SingleLinkedListDemo {
	public static void main(String[] args) {
		SingleLinkedList l=new SingleLinkedList();
		
		l.add2(new HeroNode(2, "卢俊义", "玉麒麟"));
		l.add2(new HeroNode(1, "宋江", "及时雨"));
		l.add2(new HeroNode(3, "吴用", "智多星"));
		l.add2(new HeroNode(4, "林用", "豹子头"));
		
		l.list();
	}
}

//定义SingleLinkedList管理英雄
class SingleLinkedList{
	//先定义一个头节点. 不存放具体的数据
	private HeroNode head=new HeroNode(0,"","");
	
	public void add(HeroNode heronode) {
		HeroNode temp=head;
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next=heronode;
	}
	
	public void list() {
		HeroNode temp=head;
		while(temp.next!=null) {
			System.out.println(temp.next);
			temp=temp.next;
		}
	}
	
	public void add2(HeroNode heronode) {
		HeroNode temp=head;
		
		while(temp.next!=null) {
			if(temp.next.no>heronode.no) {
				heronode.next=temp.next;
				temp.next=heronode;
				return;
			}if(temp.next.no==heronode.no) {
				System.out.println(heronode+"添加失败,已经存在:"+temp.next);
				return;
			}
			temp=temp.next;
		}
		temp.next=heronode;
		
	}
	
}

//先定义一个HeroNode,每个HeroNode对象就是一个节点
class HeroNode{
	public int no;
	public String name;
	public String nickname;
	public HeroNode next;	//指向下一个节点
	
	public HeroNode(int no,String name,String nickname) {
		this.no=no;
		this.name=name;
		this.nickname=nickname;
	}

	//为了显示方便,重写toString方法
	@Override
	public String toString() {
		//return "HeroNode [no=" + no + ", name=" + name + ", nickname=" + nickname + ", next=" + next + "]";
		//如果输出next属性,会导致这样输出:
		/*
		HeroNode [no=1, name=宋江, nickname=及时雨, next=HeroNode [no=2, name=卢俊义, nickname=玉麒麟, next=HeroNode [no=3, name=吴用, nickname=智多星, next=HeroNode [no=4, name=林用, nickname=豹子头, next=null]]]]
		HeroNode [no=2, name=卢俊义, nickname=玉麒麟, next=HeroNode [no=3, name=吴用, nickname=智多星, next=HeroNode [no=4, name=林用, nickname=豹子头, next=null]]]
		HeroNode [no=3, name=吴用, nickname=智多星, next=HeroNode [no=4, name=林用, nickname=豹子头, next=null]]
		HeroNode [no=4, name=林用, nickname=豹子头, next=null]
		 */
		return "HeroNode [no=" + no + ", name=" + name + ", nickname=" + nickname + "]";
	}
	
}
