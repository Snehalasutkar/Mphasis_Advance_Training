package program6_3;

public class Employeee {
int EmpNo;
String EmpName;
String Address;



public Employeee(int empNo, String empName, String address) {
	super();
	this.EmpNo = empNo;
	this.EmpName = empName;
	this.Address = address;
}

public int getEmpNo() {
	return EmpNo;
}

public void setEmpNo(int empNo) {
	EmpNo = empNo;
}

public String getEmpName() {
	return EmpName;
}

public void setEmpName(String empName) {
	EmpName = empName;
}

public String getAddress() {
	return Address;
}

public void setAddress(String address) {
	Address = address;
}




}
