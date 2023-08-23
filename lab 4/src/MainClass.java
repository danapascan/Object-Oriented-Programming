import java.awt.Color;

public class MainClass {

	public static void main(String[] args) {
		car car= new car("BMW",new Color(255,0,0), 230,50,3,6);
		car.accelerate(10);
		car.deccelerate(20);
		car.changeGear(4);
		car.stop();
		System.out.println(car);
		

	}

}
