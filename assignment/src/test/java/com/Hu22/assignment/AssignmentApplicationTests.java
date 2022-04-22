package com.Hu22.assignment;

import com.Hu22.assignment.entity.data.Data;
import com.Hu22.assignment.entity.data.Masternode;
import com.Hu22.assignment.entity.data.SoftwareComponent;
import com.Hu22.assignment.entity.data.Workernode;
import com.Hu22.assignment.entity.networking.Firewall;
import com.Hu22.assignment.entity.networking.Networking;
import com.Hu22.assignment.entity.networking.Subnet;
import com.Hu22.assignment.entity.object.Object;
import com.Hu22.assignment.entity.virtual.BootDisk;
import com.Hu22.assignment.entity.virtual.VirtualMachine;
import com.Hu22.assignment.repository.DataRepository;
import com.Hu22.assignment.repository.NetworkingRepository;
import com.Hu22.assignment.repository.ObjectRepository;
import com.Hu22.assignment.repository.VirtualRepository;
import com.Hu22.assignment.service.DataService;
import com.Hu22.assignment.service.NetworkingService;
import com.Hu22.assignment.service.ObjectService;
import com.Hu22.assignment.service.VirtualService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class AssignmentApplicationTests {
	@Autowired
	private DataRepository dataRepository;
	@Autowired
	private NetworkingRepository networkingRepository;

	@Autowired
	private ObjectRepository objectRepository;
	@Autowired
	private VirtualRepository virtualRepository;

	@Autowired
	private DataService dataService;
	@Autowired
	private NetworkingService networkingService;
	@Autowired
	private ObjectService objectService;

	@Autowired
	private VirtualService virtualService;

	@Test
	public void datasignuptest(){
		Data t=new Data("dummy", "dummyEncrypt", new SoftwareComponent("companyNme", "v1"),
				new Masternode("Family", 1, 1, "100", "1"),
				new Workernode("family", "100", 1, 1, "1", 1));
		int prevRepoSize  = dataRepository.findAll().size();
		dataService.signingNewInfo(t);
		int afterRepoSize = dataRepository.findAll().size();
		assertEquals(prevRepoSize+1, afterRepoSize);
		dataRepository.delete(t);
	}

	@Test
	public void dataGetDetailTest(){
		Data t=new Data("dummy", "dummyEncrypt", new SoftwareComponent("companyNme", "v1"),
				new Masternode("Family", 1, 1, "100", "1"),
				new Workernode("family", "100", 1, 1, "1", 1));
		dataRepository.save(t);
		Data response = dataRepository.findByNameAndEncryption("dummy", "dummyEncrypt");
		assertNotNull(response);
		dataRepository.delete(t);
	}
	@Test
	public void networkDetailTest(){
		Networking t=new Networking("dummy1","xyz",
				new Subnet("abc","north","323","public"),
				new Firewall("zes","hell","34","abs"));
		int prevSize=networkingRepository.findAll().size();
		networkingService.signingNewInfo(t);
		int afterRepoSize=networkingRepository.findAll().size();
		assertEquals(prevSize+1,afterRepoSize);
		networkingRepository.delete(t);

	}

	@Test
	public void networkingGetDetailTest() {
		Networking t = new Networking("dummy1", "xyz",
				new Subnet("abc", "north", "323", "public"),
				new Firewall("zes", "hell", "34", "abs"));
		networkingRepository.save(t);
		Networking response = networkingRepository.findByNameAndDescription("dummy1", "xyz");
		assertNotNull(response);
		networkingRepository.delete(t);
	}

	@Test
	public void objectDetailTest(){
		Object t=new Object("abc","xyz","private","http","8");
		int prevSize=objectRepository.findAll().size();
		objectService.signingNewInfo(t);
		int afterSize=objectRepository.findAll().size();
		assertEquals(prevSize+1,afterSize);
		objectRepository.delete(t);
	}

//	@Test
//	public void objectdelete(){
//		Object t=new Object("abc2","xyz2","private","http","8");
//		objectRepository.save(t);
//		int newSize=objectRepository.findAll().size();
//		//objectRepository.delete(t);
//		objectService.deleteById(1);
//		int currentSize=objectRepository.findAll().size();
//		assertEquals(newSize,currentSize);
//	}

	@Test
	public void objectGetDetailsTest(){
		Object t=new Object("abc1","xyz1","private","http","8");
		objectRepository.save(t);
		Object response=objectRepository.findByNameAndRegion("abc1","xyz1");
		assertNotNull(response);
		objectRepository.delete(t);
	}

	@Test
	public void virtualDetailTest(){
		VirtualMachine t=new VirtualMachine("abc1","xyz1","os",4,32,"https",
				new BootDisk("4","32"));
		int prevSize=virtualRepository.findAll().size();
		virtualService.signingNewInfo(t);
		int afterSize=virtualRepository.findAll().size();
		assertEquals(prevSize,afterSize-1);
		virtualRepository.delete(t);
	}



	@Test
	public void virtualGetDetailTest(){
		VirtualMachine t=new VirtualMachine("abc","xyz","os",4,32,"https",
				new BootDisk("4","32"));
		virtualRepository.save(t);
		VirtualMachine response=virtualRepository.findByNameAndRegion("abc","xyz");
	}


}
