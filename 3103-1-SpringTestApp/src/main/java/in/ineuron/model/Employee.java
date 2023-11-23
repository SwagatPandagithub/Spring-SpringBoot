package in.ineuron.model;

public class Employee {
	
	private Integer eId;
	private String eName;
	private String eAddr;
	
	
	
	public Integer geteId() {
		return eId;
	}
	public void seteId(Integer eId) {
		this.eId = eId;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public String geteAddr() {
		return eAddr;
	}
	public void seteAddr(String eAddr) {
		this.eAddr = eAddr;
	}
	
	
	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", eName=" + eName + ", eAddr=" + eAddr + "]";
	}
	
	
	

}
