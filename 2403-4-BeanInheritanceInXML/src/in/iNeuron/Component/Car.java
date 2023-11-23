package in.iNeuron.Component;

public class Car {
	
	private String regNo;
	private String engineNo;
	private String model;
	private String type;
	private String company;
	private int engineCC;
	private String color;
	private String owner;
	private String fuelType;
	
	
	public Car(String regNo, String engineNo, String model, String type, String company, int engineCC, String color,
			String owner, String fuelType) {
		super();
		this.regNo = regNo;
		this.engineNo = engineNo;
		this.model = model;
		this.type = type;
		this.company = company;
		this.engineCC = engineCC;
		this.color = color;
		this.owner = owner;
		this.fuelType = fuelType;
		System.out.println("The Car Class constructor is instantiated......");
	}
	
	
	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}
	public void setEngineNo(String engineNo) {
		this.engineNo = engineNo;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public void setType(String type) {
		this.type = type;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public void setEngineCC(int engineCC) {
		this.engineCC = engineCC;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}


	@Override
	public String toString() {
		return "Car [regNo=" + regNo + ", engineNo=" + engineNo + ", model=" + model + ", type=" + type + ", company="
				+ company + ", engineCC=" + engineCC + ", color=" + color + ", owner=" + owner + ", fuelType="
				+ fuelType + "]";
	}
	
	

}
