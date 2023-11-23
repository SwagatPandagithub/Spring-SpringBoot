package in.ineuron.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import in.ineuron.dto.EmployeeDto;
import in.ineuron.service.IEmployeeManagementService;
import in.ineuron.vo.EmployeeVo;


@Component(value = "controller")
public class MainController {

	static {
		System.out.println("The controller .class file is loading......");
	}
	
	
	public MainController() {
		System.out.println("MainController sero Param constructor instantiated....\n");
	
	}
	
	
	@Autowired
	IEmployeeManagementService empService;


	@Override
	public String toString() {
		return "MainController [empService=" + empService + "]";
	}
	
	
	public EmployeeVo getHike(EmployeeVo vo) {
		
		EmployeeDto dto = new EmployeeDto();
		dto.setEmpName(vo.getEmpName());
		dto.setEmpAddress(vo.getEmpAddress());
		dto.setEmpAge(Integer.parseInt(vo.getEmpAge()));
		dto.setEmpSal(Float.parseFloat(vo.getEmpSal()));
		empService.calculateHike(dto);
		return null;
	}
	
	
	

}
