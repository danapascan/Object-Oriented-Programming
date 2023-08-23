import java.awt.Color;
import java.util.Date;

public class car {
	String brand;
	Color color;
	private int currentSpeed;
	int currentGear;
	int maxSpeed;
	int gearNumber;
	double milage;
	Sofer sofer;
	Rezervor rezervor;
	//Date lastUpdate;
	
	public static final int MAX_GEAR=6;
	public static final int MIN_GEAR=1;
	
	private car() {
		this.milage=0;
		//this.lastUpdate= new Date();
	}
	
	public car(String brand, Color color,int maxSpeed, int currentSpeed, int currentGear, int gearNumber)
	{
		this.brand=brand;
		this.color=color;
		this.maxSpeed=maxSpeed;
		this.currentSpeed=currentSpeed;
		this.gearNumber=gearNumber;
		this.currentGear=currentGear;
	}
	
	
	public int accelerate(int acceleration)
	{
		//Date newDate= new Date();
		//milage+= currentSpeed * Math.abs(((this.lastUpdate.getTime()-newDate.getTime())/1000.0/60/60));
		
		if( this.currentSpeed + acceleration > maxSpeed)
		{
			this.currentSpeed=maxSpeed;
		}
		else this.currentSpeed+=acceleration;
		
		//this.lastUpdate=newDate;
		System.out.println("Accelerated to "+ this.currentSpeed);
		return currentSpeed;
	}
	
	public int deccelerate(int decceleration)
	{
		//Date newDate= new Date();
		//milage+= currentSpeed * Math.abs(((this.lastUpdate.getTime()-newDate.getTime())/1000.0/60/60));
		
		if( this.currentSpeed - decceleration <0)
		{
			this.currentSpeed=0;
		}
		else this.currentSpeed-=decceleration;
		
		//this.lastUpdate=newDate;
		System.out.println("Deccelerated to "+ this.currentSpeed);
		return currentSpeed;
	}
	
	public int changeGear(int newGear)
	{
		if(newGear<=MAX_GEAR && newGear>=MIN_GEAR)
		{
			this.currentGear=newGear;
		}
		
		System.out.println("Changed gear to "+ this.currentGear);
		return currentGear;
		
	}
	
	public void stop()
	{
		//Date newDate= new Date();
		//milage+= currentSpeed * Math.abs(((this.lastUpdate.getTime()-newDate.getTime())/1000.0/60/60));
		//this.lastUpdate=newDate;
		this.currentGear=1;
		this.currentSpeed=0;
		System.out.println("Stop");
		return;
	}
	/*
	public double getMilage()
	{
		return this.milage;
	}
	*/
	public String toString()
	{
		return "Brand: " +brand+ " color "+ color.toString()+ " maxSpeed " + maxSpeed +" currentSpeed "+ currentSpeed+ " currentGear "+currentGear+" gearNumber "+gearNumber;
	}
}
