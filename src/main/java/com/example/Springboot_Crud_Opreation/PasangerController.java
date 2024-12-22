package com.example.Springboot_Crud_Opreation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //control all request(strating point)
public class PasangerController {
@Autowired //connect repository to database using hibernate
PasangerRepository prepo;
@RequestMapping("/test")
public String test()
{
	return"this is for test";
}
 //to create data
@RequestMapping("/savedata")
public String savedata(@RequestBody Pasanger p) 
{
	prepo.save(p);
	return"data is save into database";
}
// to read data
@RequestMapping("/displaydata")
public List<Pasanger> displaydata()
{
return prepo.findAll();	
}
@RequestMapping("/{id}")
public Optional<Pasanger>  byId(@PathVariable int id)
{
	return prepo.findById(id);
}
@RequestMapping("/name/{name}")
public List<Pasanger> byName(@PathVariable  String name )
{
	return prepo.findByName(name);
}

@RequestMapping("/birthNumber/{birthnumber}")
public List<Pasanger> byBirthNumber(@PathVariable int birthNumber)
{
	return prepo.findByBirthNumber(birthNumber);
}
}
//to update data
//@RequestMapping("/update/{id}")
//public 































