package problem05;

import javax.annotation.Resource;


public class Employee {
private int empid;
private String employeename;


@Resource
  private pancard pan;


public int getEmpid() {
	return empid;
}


public void setEmpid(int empid) {
	this.empid = empid;
}


public String getEmployeename() {
	return employeename;
}


public void setEmployeename(String employeename) {
	this.employeename = employeename;
}


public pancard getPan() {
	return pan;
}


public void setPan(pancard pan) {
	this.pan = pan;
}





}
