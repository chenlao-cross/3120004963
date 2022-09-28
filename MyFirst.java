public class MyFirst{

	private int age;
	private String name;
	
	public void say() {
		System.out.println("myname:  "+name+"  age:  "+age);
	}
	
	public MyFirst()
	{
	System.out.println("common  method");
	}
	
	MyFirst(String name1,int age1)
	{
		this();
		this.age=age1;
		name=name1;
		System.out.println("new method");
	}
	public static void main(String[] args) {
		MyFirst me=new MyFirst();
		MyFirst me1=new MyFirst("zhangsan",20);
		me.say();
		me1.say();
		
	}
}
