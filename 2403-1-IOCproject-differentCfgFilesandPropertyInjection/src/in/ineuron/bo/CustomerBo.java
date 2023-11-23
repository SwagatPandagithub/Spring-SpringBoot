package in.ineuron.bo;

public class CustomerBo {
	
	private String custName;
	private String custAddr;
	
	private float pAmt;
	private float rate;
	private float time;
	
	private float interestAmt;
	
	static {
		System.out.println("customerDTO.class file is loading.....");
	}
	
	public CustomerBo() {
		System.out.println("customerDTO.class file is instantiated.....");
	}

	public String getCustName() {
		return custName;
	}

	public String getCustAddr() {
		return custAddr;
	}

	public float getpAmt() {
		return pAmt;
	}

	public float getRate() {
		return rate;
	}

	public float getTime() {
		return time;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public void setCustAddr(String custAddr) {
		this.custAddr = custAddr;
	}

	public void setpAmt(float pAmt) {
		this.pAmt = pAmt;
	}

	public void setRate(float rate) {
		this.rate = rate;
	}

	public void setTime(float time) {
		this.time = time;
	}

	public float getInterestAmt() {
		return interestAmt;
	}

	public void setInterestAmt(float interestAmt) {
		this.interestAmt = interestAmt;
	}

	@Override
	public String toString() {
		return "CustomerBo [custName=" + custName + ", custAddr=" + custAddr + ", pAmt=" + pAmt + ", rate=" + rate
				+ ", time=" + time + ", interestAmt=" + interestAmt + "]";
	}

	
	
	
	
	
}
