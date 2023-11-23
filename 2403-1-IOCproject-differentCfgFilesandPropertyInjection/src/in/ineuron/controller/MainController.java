package in.ineuron.controller;

import in.ineuron.dto.CustomerDTO;
import in.ineuron.service.ICustomerManagementService;
import in.ineuron.vo.CustomerVo;

public class MainController {
	
	ICustomerManagementService service;
	
	
	
	public MainController(ICustomerManagementService service) {
		this.service = service;
		System.out.println("The controller class obejct is created and the service object is injected into the controller object");
		System.out.println("so the service instance variable is created here to have a --controller constructor and into it a service object can be injected--");
	}



	public String processCustomer(CustomerVo vo) throws Exception{
		
		CustomerDTO customerDto = new CustomerDTO();
		
		customerDto.setCustName(vo.getCustName());
		customerDto.setCustAddr(vo.getCustAddr());
		customerDto.setpAmt(Float.parseFloat(vo.getpAmt()));
		customerDto.setRate(Float.parseFloat(vo.getRate()));
		customerDto.setTime(Float.parseFloat(vo.getTime()));
		
		String result = service.calculateSimpleInterest(customerDto);
		
		
		return result;
	}



	@Override
	public String toString() {
		return "MainController [service=" + service + "]";
	}
	
	

}
