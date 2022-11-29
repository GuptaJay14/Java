class Add{
static void a1(int a, int b)
{
	int sum = a+b;
	System.out.println("Addition of "+a+" + "+b+" = "+sum);
}

static void a1(int a, int b, int c)
{
	int sum1 = a+b+c;
	System.out.println("Addition of "+a+" + "+b+" + " +c+ " = "+sum1);
}

}

class Overloading1{
public static void main(String Args[])
{
	Add.a1(21,22);
	Add.a1(21,22,23);
}


}