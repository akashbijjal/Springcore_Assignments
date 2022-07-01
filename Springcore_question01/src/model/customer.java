package model;



public class customer {
private int customerid;
private String customername;
private String customercontact;
private Address customeraddress;
public int getCustomerid() {
	return customerid;
}
public void setCustomerid(int customerid) {
	this.customerid = customerid;
}
public String getCustomername() {
	return customername;
}
public void setCustomername(String customername) {
	this.customername = customername;
}
public String getCustomercontact() {
	return customercontact;
}
public void setCustomercontact(String customercontact) {
	this.customercontact = customercontact;
}
public Address getCustomeraddress() {
	return customeraddress;
}
public void setCustomeraddress(Address customeraddress) {
	this.customeraddress = customeraddress;
}

@Override
public String toString() {
	return "customer [customerid=" + customerid + ", customername=" + customername + ", customercontact="
			+ customercontact + ", customeraddress=" + customeraddress + "]";
}
public void abc() {
	System.out.println("customerid= "+getCustomerid()+" customername= "+getCustomername()+" customercontact= "+getCustomercontact()+" customerAddress= "+getCustomeraddress());
}





}

