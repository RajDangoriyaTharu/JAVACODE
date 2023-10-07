package week5;

public class Sum{
	

	public  void addition(int a, int b) {
		// TODO Auto-generated method stub
int s=0
for(int i=a;i<=b;i++)
{
	s+=i;
	}
System.out.println("the value is" +s);
	}
	static void display()
	{
		System.out.println("hello raj");
	}
public static int total (int i1,int i2) {
	int add=0;
	for (int i=i1;i<=i2;i++)
	{
		add+=i;
	}
	
	return add;
}
public static void main(String[] args) {
	Sum z=new Sum();
	z.add(10, 20);
	System.out.println("add from 1 to 20 is" +total(1,10));
	System.out.println("add from 20 to 30 is" +total(20,30));
	System.out.println("add from 35 to 45 is" +total(35,45));
	display();
}
}
