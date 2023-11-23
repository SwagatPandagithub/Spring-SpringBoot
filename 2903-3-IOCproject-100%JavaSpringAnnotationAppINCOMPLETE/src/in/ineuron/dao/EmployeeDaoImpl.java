	package in.ineuron.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import in.ineuron.bo.EmployeeBo;

@Repository(value = "dao")
public class EmployeeDaoImpl implements iEmployeeDao {

	
	static {
		System.out.println("employeeDao.class fils is loading.....");
	}
	
	public EmployeeDaoImpl() {
		// TODO Auto-generated constructor stub
		System.out.println("employeeDao object is instantiated...\n");
	}
	
	@Override
	public String toString() {
		return "EmployeeDaoImpl [dataSource=" + dataSource + "]";
	}

	@Autowired
	private DataSource dataSource;

	@Override
	public void save(EmployeeBo bo) {
		// TODO Auto-generated method stub

	}

}
