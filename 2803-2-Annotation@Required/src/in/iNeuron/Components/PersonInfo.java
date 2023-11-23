package in.iNeuron.Components;

import org.springframework.beans.factory.annotation.Required;

public class PersonInfo {
	
	private Integer pId;
	private String pName;
	private String pAddr;
	
	
	public Integer getpId() {
		return pId;
	}
	
	@Required
	public void setpId(Integer pId) {
		this.pId = pId;
	}
	public String getpName() {
		return pName;
	}
	
	@Required
	public void setpName(String pName) {
		this.pName = pName;
	}
	public String getpAddr() {
		return pAddr;
	}
	@Required
	public void setpAddr(String pAddr) {
		this.pAddr = pAddr;
	}
	
	
	@Override
	public String toString() {
		return "PersonInfo [pId=" + pId + ", pName=" + pName + ", pAddr=" + pAddr + "]";
	}
	
	
	
	
	
	

}
