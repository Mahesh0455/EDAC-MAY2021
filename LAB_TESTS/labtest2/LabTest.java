
package day6_exceptionHandling;
import java.util.*;
class Student
{
	int rollNo;
	String name;
	Student(int rollNo,String Name)
	{
		this.rollNo=rollNo;
		this.name=name;
	}
}
class StudentInfo
{
	Scanner sc=new Scanner(System.in);
	
	Student[] getData(Student s[])
	{
		for(int i=0;i<3;i++)
			
		{
			System.out.println("Enter rollno and Student name");
			int rollNo=sc.nextInt();
			String name=sc.nextLine();
			
			s[i]=new Student(rollNo ,name);
			
		}
		return s;
	}	
	void display(Student s[])
	{
		System.out.println("*****************");
		for(Student a:s)
		{
			
			System.out.println("Student name is "+a.name+" Student rollno is "+a.rollNo);
		}
	}
}
public class LabTest {

	public static void main(String[] args) {
		StudentInfo sd=new StudentInfo();
		Student s[]=new Student[3];
		s=sd.getData(s);
		sd.display(s);
		
		
		

		
	}

}
