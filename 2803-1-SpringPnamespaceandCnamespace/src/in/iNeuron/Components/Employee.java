package in.iNeuron.Components;

import java.util.Date;

public class Employee {
	
	private Integer eid;
	private String eName;
	private Date doj;
	private Department department;
	
	static {
		System.out.println("employee.class file is loading...");
	}
	
	public Employee() {
		System.out.println("Employee constructor is getting called.... ");
		}
	
	public void setEid(Integer eid) {
		this.eid = eid;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public void setDoj(Date doj) {
		this.doj = doj;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", eName=" + eName + ", doj=" + doj + ", department=" + department + "]";
	}
	
	
	

}
