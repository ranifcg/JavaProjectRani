package test;

public class Square extends Shape{
	
	double side = getLength();
	
	
	public double calculateArea()
	{
		return (side*side);
	}

	public double calculatePerimeter()
	{
		return (4*side);
	}

}
