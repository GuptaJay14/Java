class Adder{  
static void add(int a,int b)
{
	return a+b;
}  
static int add(int a,int b,int c)
{	
	return a+b+c;
}  
}  

class Overloading
{  
	public static void main(String Args[])
{  
	System.out.println(Adder.add(11,11));  
	System.out.println(Adder.add(11,11,11));  
}
}  