package test;

public class Rectangle extends Shape{
	
	public double calculateArea()
	{
		return getLength() * getBreadth();
	}
	
	public double calculatePerimeter()
	{
		return 2 * (getLength() + getBreadth());
	}
	
}
