package in.ineuron.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import in.ineuron.model.Employee;


@Repository
public class EmployeeDaoImplClasss implements EmployeeDaoImpl {

	
	String sql_query = "select EMP_ID,EMP_NAME from employee";
	@Autowired
	private  DataSource dataSource;
	
	@Override
	public List<Employee> findAllEmployees() {
		// TODO Auto-generated method stub
		ArrayList<Employee> list = new ArrayList<Employee>();
		
		try {
			Connection connection = dataSource.getConnection();
			PreparedStatement pstmt = connection.prepareStatement(sql_query);
			
			ResultSet resultSet = pstmt.executeQuery();
			
			
			while (resultSet.next()) {
				Employee employee = new Employee();
				employee.seteId(resultSet.getInt(1));
				employee.seteName(resultSet.getString(2));
				
				list.add(employee);
				
				
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}

}
