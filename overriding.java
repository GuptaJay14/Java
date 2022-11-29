class Car
{  
  void run()
	{
		System.out.println("Car is running");
	}  
}  

class Overriding extends Car
{  
  public static void main(String Args[])
	{  
		Overriding obj = new Overriding();  
		obj.run();  
  	}  
}  
