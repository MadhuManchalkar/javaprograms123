package company_work;
//hiding the data..security purpose.to access data hidden data we need to use geetre and setter method
class Motor
{
	 int rpm;
	 boolean working;
	 String fuelType;
	 Motor(int rpm,boolean working,String fuelType)
	 {
		 this.rpm=rpm;
		 this.working=working;
		 this.fuelType=fuelType;
		 System.out.println(this.rpm);
		 System.out.println(this.working);
		 System.out.println(this.fuelType);
	 }
	 void run()
	 {
		 System.out.println("it will work properly");
	 }
	 void stop()
	 {
		 System.out.println("it will not work properly");
	 }
}
class WaterPumpMotor extends  Motor
{
	WaterPumpMotor()
	{
		super(1200,true,"petrol");
	}
	void run()
	{
		System.out.println("it will work properly ");
	}
	void stop()
	{
		System.out.println("it will not work properly");
	}
	void run(boolean working )
	{
		System.out.println("its work"+working);
	}
	void stop(boolean working)
	{
		System.out.println("it is is working"+working);
	}
	void reset()
	{
		System.out.println("reset the method");
	}
}
class MotorOperator
{
	void operator(Motor obj)
	{
		obj.run();
		obj.stop();
		if(obj instanceof WaterPumpMotor)
		{
			WaterPumpMotor obj1=(WaterPumpMotor)obj;
			obj1.run();
			obj1.run();
		}
		else
		{
			System.out.println("motor is not instance of waterpump");
		}
	}

}

public class Even_odd_prime {

	public static void main(String[] args) {
		WaterPumpMotor waterpumpmotor=new WaterPumpMotor();
		waterpumpmotor.run();
		waterpumpmotor.stop();
		waterpumpmotor.run(true);
		waterpumpmotor.stop(false);
		waterpumpmotor.reset();
		System.out.println("++++++");
		Motor obj=new  WaterPumpMotor();
		WaterPumpMotor obj1=(WaterPumpMotor)obj;
		System.out.println("++++++");
		MotorOperator obj3=new MotorOperator();
		obj3.operator(obj);
		
	}
}
