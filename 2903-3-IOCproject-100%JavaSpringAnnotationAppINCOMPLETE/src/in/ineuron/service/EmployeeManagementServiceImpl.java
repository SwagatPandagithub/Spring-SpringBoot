package in.ineuron.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ineuron.bo.EmployeeBo;
import in.ineuron.dao.iEmployeeDao;
import in.ineuron.dto.EmployeeDto;
import in.ineuron.vo.EmployeeVo;

@Service(value = "empService")
public class EmployeeManagementServiceImpl implements IEmployeeManagementService {
	
	
	static {
		System.out.println("EmployeeManagementServiceImpl.class file is loading");
	}
	
	EmployeeManagementServiceImpl(){
		System.out.println("EmployeeManagementServiceImpl object is instantiated...\n");
		
	}
	


	// Remember the diagram the dao object is injected into the service layer
	// implementation class
	@Autowired
	iEmployeeDao dao;

	@Override
	public EmployeeVo calculateHike(EmployeeDto dto) {
		// TODO Auto-generated method stub
		EmployeeBo bo = new EmployeeBo();
		bo.setEmpName(dto.getEmpName());
		bo.setEmpAddress(dto.getEmpAddress());
		bo.setEmpAge(dto.getEmpAge());
		bo.setEmpSal(dto.getEmpSal());
		
		//BeanUtils.copyProperties(dto, bo);
		
		
		return null;
	}

	@Override
	public String toString() {
		return "EmployeeManagementServiceImpl [dao=" + dao + "]";
	}
	
	
	

}
