package com.csc.test;

import junit.framework.TestCase;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.csc.dao.MedicineDAO;
import com.csc.model.MedicineDTO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/dispatcher-servlet.xml")
public class Medicinetest extends TestCase {
	@Autowired
	MedicineDAO medicineDao;
	private MedicineDTO medicine;

	@Test
	public void testGetId() {

		medicine = medicineDao.getId(2);
		assertEquals(2, medicine.getId());

	}

	 @Test
	 public void testAddMedicine()
	 {
	 medicine = new MedicineDTO();
	 medicine.setName("Paracitamon");
	 medicine.setCompany("DXC");
	 medicine.setExp("2019");
	 medicine.setMedicineId("med100");
	 medicine.setNsx("1/1/2000");
	 medicine.setQuantity(101);
	 assertEquals("Success to add a medicine in a table", true,
	 medicineDao.add(medicine));
	 }
	@Test
	public void testUpdateMedicine() {
		medicine = medicineDao.getId(2);
		medicine.setName("dau bung");
		medicineDao.update(medicine);
		assertEquals("dau bung", medicine.getName());
	}
//    @Test
//    public  void testDeleteMedicine(){
//    	medicine = medicineDao.getId(20);
//    	medicineDao.delete(medicine);
//    	assertNotNull(medicine);
//    }

}
