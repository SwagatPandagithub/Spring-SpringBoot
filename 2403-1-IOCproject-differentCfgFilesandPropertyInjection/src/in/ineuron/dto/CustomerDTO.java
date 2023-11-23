package in.ineuron.dto;

import in.ineuron.vo.CustomerVo;

public class CustomerDTO {
	
	private CustomerVo vo;
	
	private String custName;
	private String custAddr;
	
	private float pAmt;
	private float rate;
	private float time;
	
	static {
		System.out.println("customerDTO.class file is loading.....");
	}
	
	public CustomerDTO() {
		System.out.println("customerDTO.class file is instantiated.....");
	}

	

	public CustomerVo getVo() {
		return vo;
	}



	public void setVo(CustomerVo vo) {
		this.vo = vo;
	}



	public String getCustName() {
		return custName;
	}



	public void setCustName(String custName) {
		this.custName = custName;
	}



	public String getCustAddr() {
		return custAddr;
	}



	public void setCustAddr(String custAddr) {
		this.custAddr = custAddr;
	}



	public float getpAmt() {
		return pAmt;
	}



	public void setpAmt(float pAmt) {
		this.pAmt = pAmt;
	}



	public float getRate() {
		return rate;
	}



	public void setRate(float rate) {
		this.rate = rate;
	}



	public float getTime() {
		return time;
	}



	public void setTime(float time) {
		this.time = time;
	}



	@Override
	public String toString() {
		return "CustomerDTO [custName=" + custName + ", custAddr=" + custAddr + ", pAmt=" + pAmt + ", rate=" + rate
				+ ", time=" + time + "]";
	}
	
	
	
	
}
