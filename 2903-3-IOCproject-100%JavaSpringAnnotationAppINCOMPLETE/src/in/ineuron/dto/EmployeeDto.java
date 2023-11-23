package in.ineuron.dto;

public class EmployeeDto {
	
	private Integer empId;
	private String empName;
	private Integer empAge;
	private String empAddress;
	private float empSal;
	private float hikeAmount;
	
	
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Integer getEmpAge() {
		return empAge;
	}
	public void setEmpAge(Integer empAge) {
		this.empAge = empAge;
	}
	public String getEmpAddress() {
		return empAddress;
	}
	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}
	public float getEmpSal() {
		return empSal;
	}
	public void setEmpSal(float empSal) {
		this.empSal = empSal;
	}
	public float getHikeAmount() {
		return hikeAmount;
	}
	public void setHikeAmount(float hikeAmount) {
		this.hikeAmount = hikeAmount;
	}
	
	
	
	@Override
	public String toString() {
		return "EmployeeBo [empId=" + empId + ", empName=" + empName + ", empAge=" + empAge + ", empAddress="
				+ empAddress + ", empSal=" + empSal + ", hikeAmount=" + hikeAmount + "]";
	}
	

}
