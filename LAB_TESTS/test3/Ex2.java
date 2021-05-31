import java.util.*;
class Employee{
	int empId;
	String empName;
	Employee(){
		
	}
	
	Employee(int empId,String empName){
		this.empId=empId;
		this.empName=empName;
		
		
		
	}
}
public class Ex2 {

	public static void main(String[] args) {
		ArrayList<Employee>list=new ArrayList<Employee>();
		list.add(new Employee(111,"Mahesh"));
		list.add(new Employee(112,"Kumar"));
		list.add(new Employee(113,"Sagar"));
		for(Employee e:list) {
			System.out.println(e.empId+" "+e.empName);
		}
		
		
		

	}

}
