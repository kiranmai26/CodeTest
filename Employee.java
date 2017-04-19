package com.random;

public class Employee {

	/**
	 * @param args
	 */
	
	private Long id;
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return Phone;
	}

	public void setPhone(String phone) {
		Phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
  
	
	private String name;
	private String Phone;
	private String address;
	// to get the employee info
	public Employee getEmpdata(){
			Employee e1=new Employee();
			e1.setId(54321L);
			e1.setName("Kiran");
			e1.setPhone("444-0100");
			e1.setAddress("MT");
			return e1;
		    }
System.out.println(e1);
	

}
