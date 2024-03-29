package in.ineuron.vo;

public class CustomerVo {

	private String custName;
	private String custAddr;
	private String pAmt;
	private String rate;
	private String time;
	
	
	static {
		System.out.println("Customervo.class file is loading....");
	}
	
	public CustomerVo(){
		System.out.println("CustomerVo.class file is instantiated....");
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



	public String getpAmt() {
		return pAmt;
	}



	public void setpAmt(String pAmt) {
		this.pAmt = pAmt;
	}



	public String getRate() {
		return rate;
	}



	public void setRate(String rate) {
		this.rate = rate;
	}



	public String getTime() {
		return time;
	}



	public void setTime(String time) {
		this.time = time;
	}



	@Override
	public String toString() {
		return "CustomerVo [custName=" + custName + ", custAddr=" + custAddr + ", pAmt=" + pAmt + ", rate=" + rate
				+ ", time=" + time + "]";
	}

	

}
