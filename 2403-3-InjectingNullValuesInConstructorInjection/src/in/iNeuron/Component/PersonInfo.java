package in.iNeuron.Component;

import java.util.Date;

public class PersonInfo {
	private Integer pid;
	private String pName;
	private String pAddress;
	
	private Date dob;
	private Date doj;
	private Date dom;
	
	
	
	public PersonInfo(Integer pid, String pName, String pAddress, Date dob, Date doj, Date dom) {
		this.pid = pid;
		this.pName = pName;
		this.pAddress = pAddress;
		this.dob = dob;
		this.doj = doj;
		this.dom = dom;
		System.out.println("PersonInfo. class constructor is called......");
	}
	
	
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public void setpAddress(String pAddress) {
		this.pAddress = pAddress;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public void setDoj(Date doj) {
		this.doj = doj;
	}
	public void setDom(Date dom) {
		this.dom = dom;
	}
	@Override
	public String toString() {
		return "PersonInfo [pid=" + pid + ", pName=" + pName + ", pAddress=" + pAddress + ", dob=" + dob + ", doj="
				+ doj + ", dom=" + dom + "]";
	}
	
	
	

}
