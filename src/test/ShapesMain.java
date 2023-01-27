package test;

public class ShapesMain {
	public static void main(String[] args) {
	Square sqr_obj = new Square();
	
	sqr_obj.setLength(8);
	System.out.println("Side of square is "+ sqr_obj.getLength());
	System.out.println("Area of square is "+ sqr_obj.calculateArea());
	System.out.println("Perimeter of square is "+ sqr_obj.calculatePerimeter());

	Rectangle rct_obj = new Rectangle();
	
	rct_obj.setLength(8);
	rct_obj.setBreadth(2);
	System.out.println("Sides of rectangle are "+ rct_obj.getLength()+ "," + rct_obj.getBreadth());
	System.out.println("Area of rectangle is "+ rct_obj.calculateArea());
	System.out.println("Perimeter of rectangle is "+ rct_obj.calculatePerimeter());


	
	Shape obj1 = new Shape();
	obj1.setLength(10);
	obj1.setBreadth(5);
	System.out.println(obj1.calculateArea());
	System.out.println(obj1.calculatePerimeter());
	
	Rectangle obj2 = new Rectangle();
	obj2.setLength(10);
	obj2.setBreadth(5);
	System.out.println(obj2.calculateArea());
	System.out.println(obj2.calculatePerimeter());
	
	Shape obj3 = new Rectangle();
	obj3.setLength(10);
	obj3.setBreadth(5);
	System.out.println(obj3.calculateArea());
	System.out.println(obj3.calculatePerimeter());
	}
}
