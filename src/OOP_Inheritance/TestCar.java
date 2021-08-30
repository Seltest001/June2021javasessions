package OOP_Inheritance;

public class TestCar {
	
	public static void main (String [] args) {
		
		//-----------------------------------------------------------------
		
		//can I create an object of BMW here?
		// YES, I can!
		// parent and child classes both are having same method.
		//preference will be given to child class -- WHY?
		//This is called METHOD- OVERRIDING- when we have method in parent class
		//as well as in child class with 
		//the same name and 
		//same number of parameters
		//same return type
		
		
		//------------------------------------------------------------------
		
		
		BMW b1 = new BMW();
		
		b1.start();  //BMW - child class- overridden
		b1.autoParking(); //individual method
		b1.stop(); // inherited
		b1.refuel(); // inherited
		b1.start(); // BMW - child class- overridden
		b1.goCar(); //overridden
		BMW.testing();
		Car.testing();
		
		//b1.theftSafety(); sibling methods cannot be accesible.if i need to call
		//audi methods what should i do??
		//create an object of audi class and call it.
		//sibling properties cannot be inherited.
		
		
		Car c = new Car();
		//c.start();
		c.stop();
		c.refuel();
		System.out.println("________________________________");
		
		//top/up casting. create an object of a child class and refer it by
		//it's parent class reference.
		
		    Car c1 = new BMW();
		    
		   // c1.start();
		    c1.stop();
		   // c1.start();
		    c1.refuel();
		    
		   // c1.autoparking();
		   // autoparking must be accessible by bmw only.it's neither inherited
		   // nor part of the car class.
		    
		    
		  //  BMW b = new Car();
		    
		    b1.engine();
		    c.airBags();
		    b1.airBags(); //preference is given to immediate parent over here
		    System.out.println("_______________________________");
		    
		    Vehicle v = new BMW();
		    v.airBags();
		    v.engine();
		    
		    //down casting:parent class object can be referred by child class reference variable
		    
		  //  BMW b2 = (BMW) new Vehicle(); //It's not allowing, we need to convert it.But again it will
		                                  // give Class Cast Exception.
		    
		    
		    System.out.println(b1.price);
			
		
		
	}

}
