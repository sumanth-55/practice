package com.student.vo;
public class StudentVo {
	private String custId;
	 private String name; 
	private String address;
	private String mobileno;
	 public StudentVo() 
	{ 	
	super(); 
		// TODO Auto-generated constructor stub
	 } 
	public StudentVo( String custId, String name, String address, String mobileno) 
	{ 	
	super(); 
		this.custId = custId;
	 	this.name = name; 
		this.address = address; 
		this.mobileno=mobileno;
	} 
	/*@Override
	 public int hashCode() 
	{ 	
	final int prime = 31; 
		int result = 1; 
		result = prime * result + address; 	
	result = prime * result + ((name == null) ? 0 : name.hashCode()); 	
	result = prime * result + custId; 
		return result; 
	} */
	@Override 
	public boolean equals(Object obj) 
	{ 
		if (this == obj) 
			return true; 	
	if (obj == null) 		
	return false; 
		if (getClass() != obj.getClass()) 	
		return false; 	
	StudentVo other = (StudentVo) obj; 	
	if (address != other.address) 	
		return false; 	if (name == null) 
	{ 	
		if (other.name != null) 		
		return false;
	 	}
	 else if (!name.equals(other.name)) 
			return false;
	 	if (custId != other.custId) 		
	return false; 
		return true; 
	} 
	public String getCustId() 
	{ 
		return custId; 
	} 
	public void setCustId(String custId)
	 { 
		this.custId = custId;
	 } 
	public String getName()
	 { 
		return name; 
	} 
	public void setName(String name)
	 { 	
	this.name = name;
	 }
	 public String getAddress() 
	{
	 	return address; 
	} 
	public void setAddress(String address)
	 { 	
	this.address = address; 
	} 
	public String getMobileno() 
	{
	 	return mobileno; 
	} 
	public void setMobileno(String mobileno)
	 { 	
	this.mobileno = mobileno; 
	} 
	@Override
	 public String toString()
	 { 	
	return "StudentVo [custId=" + custId + ", name=" + name + ", address=" + address + ",mobileno=" +mobileno+ "] ";
	}
	 }
