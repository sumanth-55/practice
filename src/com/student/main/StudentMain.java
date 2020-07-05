package com.student.main;
import java.util.*;
import com.students.dao.StudentDao;
import com.student.vo.StudentVo;
import java.lang.*;
public class StudentMain {
	@SuppressWarnings("resource")
	public static void main(String[] args)
	 { 
		StudentDao studentDao=new StudentDao();
	 // Database handling 	
		StudentVo studentVo=new StudentVo();
	 // Storing student details 	
		int ch=0; 	
		// Following line are for user input 	
		Scanner scanner=new Scanner(System.in); 		
		while(true) 
			{ 
	System.out.println("1) ADD CUSTOMER"); 
	System.out.println("2) DISPLAY CUSTOMERS"); 
	System.out.println("3) DELETE CUSTOMER"); 
	System.out.println("4) DISPLAY SPECIFIC CUSTOMER"); 
	System.out.println("5) UPDATE CUSTOMR DETAILS"); 	
	System.out.println("6) EXIT"); 		
	System.out.println("Enter your choice"); 		
	ch=scanner.nextInt(); 	
		switch(ch) 	
		{ 	
		case 1 : 	
	System.out.println("Enter the custId");
	 String custId=scanner.next(); 
	 System.out.println("Enter the name");
	 String name=scanner.next(); 
	 System.out.println("Enter the address");
	 String address=scanner.next();
	 System.out.println("Enter the mobileno");
	 String mobileno=scanner.next();
	// following lines are for storing the data in studentCVo 
	 studentVo.setCustId(custId); 
	 studentVo.setName(name); 
	 studentVo.setAddress(address); 
	 studentVo.setMobileno(mobileno);
	// StudentVo object is passed to StudentDao so that data in the StudentVo object can be saved in the database table  
	  boolean isRecordAdded=studentDao.addStudent(studentVo); 
			if(isRecordAdded) 
	{ 	 
	System.out.println("Record added!!!"); 
	} 
	else
	 {
	 	 System.out.println("Not able to add record!!!!");
	 }
	break; 	
	case 2 : 
	System.out.println("The data is "); 
	List<StudentVo> customerList=studentDao.displayCustomers(); 
	for(StudentVo customer : customerList) 
	{ 	
	 System.out.println(customer.getCustId()+"\t"+customer.getName()+"\t"+customer.getAddress()); 
	} 
	break; 		
	case 3 : System.out.println("Enter the id to be deleted"); 		 
	String custIdToDelete=scanner.next(); 		
	 boolean isDeleted=studentDao.delete(custIdToDelete); 			 
	 if(isDeleted) 			
	 { 			 	 
	System.out.println("The record got deleted"); 			 } 			 
	else 			 
	{ 			 	 
	System.out.println("Unable to delete the record!!!"); 			
	 } 			
	 break; 		
	case 4 : 
	System.out.println("Enter the id to be searched and get the student displayed"); 		 
	String custIdToSearch=scanner.next(); 		 
	StudentVo student=studentDao.searchStudent(custIdToSearch); 		 
	if(student!=null) 	
		 { 	
	System.out.println(student.getCustId()); 		 	 
	System.out.println(student.getName()); 		 	 
	System.out.println(student.getAddress()); 	
		 } 		
	 else 	
		 { 		 	 
	System.out.println("Record not found!!!!"); 		
	 } 		 break; 	
		case 5 : 
	System.out.println("Enter the id to be updated"); 	
	 String custIdToSearchForUpdate=scanner.next(); 		 
	 StudentVo studentForUpdate=studentDao.searchStudent(custIdToSearchForUpdate); 		
	 int updateChoice=0; 		 
	if(studentForUpdate!=null) 		 
	{ 		 	
	System.out.println("1)UPDATE NAME"); 		 	
	System.out.println("2)UPDATE MARKS"); 		 	
	updateChoice=scanner.nextInt(); 		 	
	switch(updateChoice) 		 	
	{ 		 	
	case 1 : 
	System.out.println("The old name "+studentForUpdate.getName()); 		 		 
	System.out.println("Enter the new name"); 		 		 
	String updatedName=scanner.next(); 		 		 
	studentForUpdate.setName(updatedName); 		 		 
	break; 		 	
	case 2 : 
	System.out.println("The previous address "+studentForUpdate.getAddress()); 		 
	System.out.println("Enter changed score"); 		 
	String addressToUpdate=scanner.next(); 		 
	studentForUpdate.setAddress(addressToUpdate); 		 
	break; 		 
	default : 
	System.out.println("Option is wrong"); 		 
		} 		
	 boolean updated=studentDao.updateStudent(studentForUpdate); 		 
	if(updated) 		
	 { 		 	
	 System.out.println("Record updated"); 	
		 } 		 
	else 		 
	{ 		 	
	 System.out.println("Record update was not successful"); 		 
	} 		 
	}
	else 		
	 { 		 	 
	System.out.println("Record not Found"); 
	 } 
	break; 		
	case 6 : System.exit(0); 		 
	break; 		
	default : 
	System.out.println("Please the option between 1-6"); 		
	}
	// end of switch case 
		 } 
	// end of while loop 	
	} 
}
