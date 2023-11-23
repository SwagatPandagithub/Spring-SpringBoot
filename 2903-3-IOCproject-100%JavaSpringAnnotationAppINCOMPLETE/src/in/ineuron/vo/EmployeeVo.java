package in.ineuron.vo;

public class EmployeeVo {
	
	private String empId;
	private String empName;
	private String empAge;
	private String empSal;
	private String empAddress;
	
	
	
	
	
	
	
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpAge() {
		return empAge;
	}
	public void setEmpAge(String empAge) {
		this.empAge = empAge;
	}
	public String getEmpSal() {
		return empSal;
	}
	public void setEmpSal(String empSal) {
		this.empSal = empSal;
	}
	public String getEmpAddress() {
		return empAddress;
	}
	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}
	@Override
	public String toString() {
		return "EmployeeVo [empId=" + empId + ", empName=" + empName + ", empAge=" + empAge + ", empSal=" + empSal
				+ ", empAddress=" + empAddress + "]";
	}
	
	
	
	

}
