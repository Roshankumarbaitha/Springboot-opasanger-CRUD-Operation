package com.example.Springboot_Crud_Opreation;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity(name="Pasanger")
public class Pasanger {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
int id;
String name ;
String address ;
int birthNumber;
String city;
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public int getBirthNumber() {
	return birthNumber;
}
public void setBirthNumber(int birthNumber) {
	this.birthNumber = birthNumber;
}

}
