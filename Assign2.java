import java.io.*;
abstract class Person
{
	protected String name;
	protected String address;
	Person()
	{
	}
	Person(String name,String address)
	{
		this.name=name;
		this.address=address;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getAddress()
	{
		return address;
	}
	public void setAddress(String address)
	{
		this.address=address;
	}
	public String toString()
	{
		return("Person[name: "+name+", Address: "+address+"]");
	}
}
class Student extends Person
{
	private String program;
	private int year;
	private double fee;
	Student(){}
	Student (String name, String address, String program,int year,double fee)
	{
		super(name,address);
		this.program=program;
		this.year=year;
		this.fee=fee;
	}
	public String getProgram()
	{
		return program;
	}
	public void setProgram(String program)
	{
		this.program=program;
	}
	public int getYear()
	{
		return year;
	}
	public void setYear(int year)
	{
		this.year=year;
	}
	public double getFee()
	{
		return fee;
	}
	public void setFee(double fee)
	{
		this.fee=fee;
	}
	public String toString()
	{
		return("Student[Person[name: "+name+", Address: "+address+"], Program: "+program+", Fee:"+fee+"]");
	}
}
class Staff extends Person
{
	private String school;
	private double pay;
	Staff(){}
	Staff(String name, String address, String school,double pay)
	{
		super(name,address);
		this.school=school;
		this.pay=pay;
	}
	public String getSchool()
	{
		return school;
	}
	public void setSchool(String school)
	{
		this.school=school;
	}
	public double getPay()
	{
		return pay;
	}
	public void setPay(double pay)
	{
		this.pay=pay;
	}
	public String toString()
	{
		return("Staff[Person[name: "+name+", Address: "+address+"], School: "+school+", pay:"+pay+"]");
	}
}

public class Assign2
{
	public static void main(String a[])
	{
		Student s1 = new Student("mahesh","Kurnool","Android",2016,2000);
		System.out.println(s1.toString());

		Student s2 = new Student();
		s2.setName("Vinod");
		s2.setAddress("Kurnool");
		s2.setProgram("JAVA");
		s2.setFee(1234);
		s2.setYear(2017);
		System.out.println(s2.toString());

		Staff st1 = new Staff("shourya","kurnool","Ravindra",30000);
		System.out.println(st1.toString());

		Staff st2 = new Staff();
		st2.setName("aslam");
		st2.setAddress("Kurnool");
		st2.setSchool("RIDGE");
		st2.setPay(3334);
		System.out.println(st2.toString());
	}
}