import java.io.*;
abstract class Shape
{
	protected String color;
	protected Boolean filled;
	Shape()
	{
		color="No color";
		filled=false;
	}
	Shape(String color,Boolean filled)
	{
		this.color=color;
		this.filled=filled;
	}
	public String getColor()
	{
		return color;
	}
	public void setColor(String color)
	{
		this.color=color;
	}
	public Boolean isFilled()
	{
		return filled;
	}
	public void setFilled(Boolean filled)
	{
		this.filled=filled;
	}
	public abstract double getArea();
	public abstract double getPerimeter();
	public abstract String toString();
}
class Circle extends Shape
{
	private double radius;
	Circle()
	{
	}
	Circle(double radius)
	{
		this.radius=radius;
	}
	Circle(double radius,String color,Boolean filled)
	{
		super(color,filled);
		this.radius=radius;
		//this.color=color;
		//this.filled=filled;
	}
	public double getRadius()
	{
		return radius;
	}
	public void setRadius(double radius)
	{
		this.radius=radius;
	}
	public double getArea()
	{
		double area;
		area=3.14*radius*radius;
		return area;
	}
	public double getPerimeter()
	{
		double per;
		per=2*3.14*radius;
		return per;
	}
	public String toString()
	{
		return "This is a "+color+" Circle";
	}
}
class Rectangle extends Shape
{
	protected double width,length;
	Rectangle ()
	{
	}
	Rectangle (double width,double length)
	{
		this.width=width;
		this.length=length;
	}
	Rectangle (double width,double length,String color,Boolean filled)
	{
		super(color,filled);
		this.width=width;
		this.length=length;
		//this.color=color;
		//this.filled=filled;
	}
	public double getWidth()
	{
		return width;
	}
	public void setWidth(double width)
	{
		this.width=width;
	}
	public double getLength()
	{
		return length;
	}
	public void setLength(double length)
	{
		this.length=length;
	}
	public double getArea()
	{
		double area;
		area=length*width;
		return area;
	}
	public double getPerimeter()
	{
		return (2*(length+width));
	}
	public String toString()
	{
		return "This is a "+color+" Rectangle";
	}
}
class Square extends Rectangle
{
	double side;
	Square ()
	{
	}
	Square (double side)
	{
		this.side=side;
	}
	Square (double side,String color,Boolean filled)
	{
		super(side,side,color,filled);
		this.side=side;
		//this.color=color;
		//this.filled=filled;
	}
	public double getSide()
	{
		return  side;
	}
	public void setSide(double side)
	{
		this.side=side;
	}
	public void setWidth(double side)
	{
		width=side;
	}
	public void setLength(double side)
	{
		length=side;
	}
	public String toString()
	{
		return "This is a "+color+" Square";
	}
}
public class Assign1
{
	public static void main(String a[])
	{
		Circle c1=new Circle (8);
		System.out.println("Area of the circle= "+c1.getArea());
		System.out.println("Perimeter of the circle= "+c1.getPerimeter());
		System.out.println(c1.toString());
		
		Circle c2=new Circle (11,"red",true);
		System.out.println("Area of the circle= "+c2.getArea());
		System.out.println("Perimeter of the circle= "+c2.getPerimeter());
		System.out.println(c2.toString());

		Square s1=new Square();
		s1.setWidth(9);
		s1.setLength(9);
		System.out.println("Area of the square= "+s1.getArea());
		System.out.println("Perimeter of the square= "+s1.getPerimeter());
		System.out.println(s1.toString());

		Square s2=new Square(11,"yellow",true);
		s2.setWidth(11);
		s2.setLength(11);
		System.out.println("Area of the square= "+s2.getArea());
		System.out.println("Perimeter of the square= "+s2.getPerimeter());
		System.out.println(s2.toString());
	}
}