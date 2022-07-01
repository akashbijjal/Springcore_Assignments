package model;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Address implements ApplicationContextAware,BeanNameAware{
private String street;
private String city;
private String state;
private String zip;
private String country;
private ApplicationContext context;
public String getStreet() {
	return street;
}
public void setStreet(String street) {
	this.street = street;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public String getZip() {
	return zip;
}
public void setZip(String zip) {
	this.zip = zip;
}
@Override
public String toString() {
	return " [street=" + street + ", city=" + city + ", state=" + state + ", zip=" + zip + ", country=" + country
			+ "]";
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}


public void go() {
System.out.println("adreess  :"+getStreet()+" "+getCity()+" "+getCountry()+" "+getZip());
}
@Override
public void setApplicationContext(ApplicationContext arg0) throws BeansException {
	this.context=context;
	
}
@Override
public void setBeanName(String beanname) {
	System.out.println("Bean name is "+beanname);
	
}
}
