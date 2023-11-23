package in.ineuron.service;

import in.ineuron.bo.CustomerBo;
import in.ineuron.dao.iCustomerDao;
import in.ineuron.dto.CustomerDTO;

public class CustomentManagementServiceImpl implements ICustomerManagementService {
	
	//Remember the diagram the dao object is injected into the service layer implementation class
	iCustomerDao dao;
	

	public CustomentManagementServiceImpl(iCustomerDao dao) {
		this.dao = dao;
		System.out.println("customerManagementServiceImpl class object is instantiated and dao object is injected using setter injection");
		System.out.println(dao.getClass().getName());
	}


	@Override
	public String calculateSimpleInterest(CustomerDTO dto) throws Exception {
		
		float interestAmount = (dto.getpAmt()*dto.getRate()*dto.getTime())/100.0f;
		
		CustomerBo customerBo = new CustomerBo();
		customerBo.setCustName(dto.getCustName());
		customerBo.setCustAddr(dto.getCustAddr());
		customerBo.setpAmt(dto.getpAmt());
		customerBo.setRate(dto.getRate());
		customerBo.setTime(dto.getTime());
		
		customerBo.setInterestAmt(interestAmount);
		
		int count = dao.save(customerBo);
		
		return count==0?"customer registration failed":"customer registration successful --> interest amount calculated "+interestAmount;
	}


	
}
