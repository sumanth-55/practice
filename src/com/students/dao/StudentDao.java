package com.students.dao;
import java.util.*;
import java.sql.*;
import java.sql.SQLException;
import java.lang.*;
import com.student.vo.*;
public class StudentDao {
	private Connection connection; 	
	private PreparedStatement statement; 	
	private ResultSet result; 	 
	public StudentDao() 	
	{ 	
	try
	{ 			
	Class.forName("com.mysql.jdbc.Driver");
	connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/customer","root","Sen1@23sum"); 	 
	System.out.println("Getting connected!!!");	 	 
	} 
	catch (Exception e)
	 { 		 
	e.printStackTrace(); 		
	} 	 
		} 	
public boolean addStudent(StudentVo studentVo) 	
	{ 		
	boolean inserted=false; 		
	String SQL="INSERT INTO details VALUES(?,?,?,?)"; 	 
	try 
	{ 			
	statement=connection.prepareStatement(SQL); 	 
	statement.setString(1,studentVo.getCustId()); 	 
	statement.setString(2,studentVo.getName());
	statement.setString(3,studentVo.getAddress());
	statement.setString(4,studentVo.getMobileno());
	int recordUpdated=statement.executeUpdate(); 	 
	if(recordUpdated>0) 	 
	{ 	 
	inserted=true; 	 	
	 } 	 
	} 
	catch (Exception e) 
	{ 			 			
	e.printStackTrace(); 		
	} 	
	 return inserted; 
		} 	 	 	
	public List<StudentVo> displayCustomers() 	
	{ 	
	List<StudentVo> customerList=new ArrayList<>();
	// this will hold all the data read from the table 	 
	String SQL="select custId,name,address,mobileno from details"; 	 
	try 
	{ 		
	statement=connection.prepareStatement(SQL); 		
	result=statement.executeQuery(); 		
	while(result.next()) 		
	{ 			
	StudentVo studentVo=new StudentVo(); 			
	studentVo.setCustId(result.getString("custId")); 			
	studentVo.setName(result.getString("name")); 			
	studentVo.setAddress(result.getString("address"));
	studentVo.setMobileno(result.getString("mobileno"));
	customerList.add(studentVo); 	
		} 		 		
	 } 
	catch (SQLException e)
	 { 	
		// TODO Auto-generated catch block 		
		e.printStackTrace(); 
		}	 		
	return customerList; 	
	} 
public boolean delete(String custIdToDelete) 
	{ 		
	boolean isDeleted=false; 		
	String SQL="DELETE FROM details where custId=?"; 		
	try 
	{ 			
	statement=connection.prepareStatement(SQL); 			
	statement.setString(1, custIdToDelete); 			
	int deleteStatus=statement.executeUpdate();	
			if(deleteStatus>0) 		
		{ 				
	isDeleted=true; 		
		} 		
	} 
	catch (SQLException e) 
	{ 			
	// TODO Auto-generated catch block 			
		e.printStackTrace(); 		
	} 		 		
	return isDeleted; 	
	} 
	
public StudentVo searchStudent(String custIdToSearch) 
	{ 	 
	StudentVo studentVo=null; 	 
	String sql="SELECT custId,name,address,mobileno FROM details WHERE custId=?"; 	
	 try
	 { 			
	statement=connection.prepareStatement(sql); 			
	statement.setString(1,custIdToSearch); 			
	result=statement.executeQuery(); 			
	if(result.next()) 		
		{ 				
	StudentVo Of=new StudentVo(); 				
	studentVo.setCustId(result.getString("custId")); 				
	studentVo.setName(result.getString("name")); 				
	studentVo.setAddress(result.getString("address"));
	studentVo.setMobileno(result.getString("mobileno"));
	} 	
		} 
	catch (SQLException e)
	 { 		
		// TODO Auto-generated catch block 			
		e.printStackTrace(); 	
		} 	 
	return studentVo; 	
	} 	
		
public boolean updateStudent(StudentVo studentForUpdate) 
	{ 		
	boolean isRecordUpdated=false; 	
	 String sql="UPDATE details set name=?,address=? WHERE custId=?"; 	 
	try 
	{ 			
	statement=connection.prepareStatement(sql); 			
	statement.setString(1, studentForUpdate.getName()); 			
	statement.setString(2, studentForUpdate.getAddress()); 			
	statement.setString(3, studentForUpdate.getCustId()); 			
	int noRecordUpdated=statement.executeUpdate(); 			
	if(noRecordUpdated>0) 			
	{ 				
	isRecordUpdated=true; 			
	} 		
	} catch (SQLException e) 
	{ 		
		// TODO Auto-generated catch block 			
		e.printStackTrace(); 		
	} 	 	 		
	return isRecordUpdated; 	
	} 	
}
