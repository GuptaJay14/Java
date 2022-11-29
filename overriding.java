class Vehicle
{  
  void run()
	{
		System.out.println("Vehicle is running");
	}  
}  

class Overriding extends Vehicle
{  
  public static void main(String Args[])
	{  
		Overriding obj = new Overriding();  
		obj.run();  
  	}  
}  