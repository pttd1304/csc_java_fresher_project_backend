package com.csc.test;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.csc.dao.PersonDAO;
import com.csc.model.PersonDTO;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/dispatcher-servlet.xml")
public class testPerson {

	@Autowired
	PersonDAO person_Dao;	
	PersonDTO person;
	
	@Test
	public void testGetId() {
		
		person = person_Dao.get(1);
		assertEquals(1, person.getId());
	}
	
	@Test
	public void testAdd() {
		
		person = new PersonDTO();
		person.setAddress("Cau Ong Lanh");
		person.setCmnd("321458712");
		person.setDob("1/2/1995");
		person.setFullname("Vu le");

		person.setSex("female");

		assertEquals("Successful add person to table", true, person_Dao.add(person));
	}
	
	@Test
	public void testDeletePerson() {

			person = person_Dao.get(53);
			person_Dao.delete(person);
			assertNotNull(person);
	}
	
	@Test
	public void testUpdatePerson() {
		person = person_Dao.get(1);
		person.setFullname("Nguoi Ay");
		person_Dao.update(person);
		assertNotNull(person);
	}
	
}








