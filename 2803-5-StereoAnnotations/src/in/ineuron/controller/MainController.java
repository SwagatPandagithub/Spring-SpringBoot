package in.ineuron.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import in.ineuron.dto.CustomerDTO;
import in.ineuron.service.ICustomerManagementService;
import in.ineuron.vo.CustomerVo;


@Controller
public class MainController {
	
	
	@Autowired
	ICustomerManagementService service;
	
	

	
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
