package in.ineuron.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ineuron.bo.CustomerBo;
import in.ineuron.dao.iCustomerDao;
import in.ineuron.dto.CustomerDTO;


@Service
public class CustomentManagementServiceImpl implements ICustomerManagementService {
	
	
	
	@Autowired
	iCustomerDao dao;
	

	


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
