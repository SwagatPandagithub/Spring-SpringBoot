package in.iNeuron.Components;

import java.util.Date;

public class Department {
	
	private Integer deptId;
	private String deptName;
	private Date dob;
	
	
	public Department(Integer deptId, String deptName, Date dob) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
		this.dob = dob;
	}


	@Override
	public String toString() {
		return "Department [deptId=" + deptId + ", deptName=" + deptName + ", dob=" + dob + "]";
	}
	
	

}
