package in.ineuron.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;



import in.ineuron.bo.CustomerBo;

public class CustomerDaoImpl implements iCustomerDao{
	
	private static final String SQL_Query="insert into customer(custName,custAddr,rate,principalAmt,timeperiod,interestAmount)values(?,?,?,?,?,?)";
	
	private DataSource dataSource;
	//DataSource object(as dependent class) is created in this class (target class)
	public CustomerDaoImpl(DataSource dataSource) {
		this.dataSource = dataSource;
		System.out.println("customerdaoImpl class is instantiated and datasource object is injected in DAO impl class..."+dataSource.getClass().getName());
	}
		int count = 0;
	@Override
	public int save(CustomerBo bo) throws Exception {
		try {
		Connection connection = dataSource.getConnection();
		PreparedStatement pstmt = connection.prepareStatement(SQL_Query);
		pstmt.setString(1, bo.getCustName());
		pstmt.setString(2, bo.getCustAddr());
		pstmt.setFloat(3, bo.getRate());
		pstmt.setFloat(4, bo.getpAmt());
		pstmt.setFloat(5, bo.getTime());
		pstmt.setFloat(6, bo.getInterestAmt());
				
		count = pstmt.executeUpdate();
		}catch(SQLException sql) {
			sql.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return count;
	}
}
