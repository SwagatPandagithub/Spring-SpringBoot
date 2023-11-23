package in.iNeuron.Component;

public class Student {
	
	private String name;
	private Integer sid;
	private String addr;
	private Integer age;
	
	public Student(String name, Integer sid, String addr, Integer age) {
		System.out.println("Parameterised Constructor is called....");
		this.name = name;
		this.sid = sid;
		this.addr = addr;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", sid=" + sid + ", addr=" + addr + ", age=" + age + "]";
	}
	
	
	

}
