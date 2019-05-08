package com.senderUserManagement.services;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import com.senderUserManagement.cmdHistory.CmdHistoryService;
import com.senderUserManagement.model.CommandsHistory;
import com.senderUserManagement.repositories.CommandsHistoryRepository;
//IN PROGRES
@RunWith(SpringRunner.class)
@DataJpaTest
@ActiveProfiles("package_history")
@AutoConfigureTestDatabase(replace=Replace.NONE)
public class CmdHistoryServiceTest {
	@Autowired
	CommandsHistoryRepository obiect;
	@Autowired
	CmdHistoryService obiectHist;
	@Test
	public void testGetIstoric() throws IOException {
		CommandsHistory eqTest = new CommandsHistory(2,"Vladut","Țifir-Marian-Vlăduț","Marian-Tanța","Pachetel","2005-09-23 00:00:00","2019-05-03 00:00:00","Strada Revederi","Strada Restantei");
		CommandsHistory eqTest2= new CommandsHistory(8, "Vladut", "Tifir-Marian-Vladut", "Nechifor Gabriel", "pachet X", "2019-03-15 00:00:00", "2019-03-16 00:00:00", "Strada Indepedentei", "Strada Revederii");
		//obiectHist.setcRepo(obiect.findAllByUsername("Vladut"));
		obiectHist.getIstoric("Vladut");
		List<CommandsHistory> listOfEqTests = new ArrayList<CommandsHistory>();
		listOfEqTests.add(eqTest);
		listOfEqTests.add(eqTest2);
		//listOfEqTests=obiect.findAllByUsername("Vladut");
		assertEquals(obiectHist.getIstoric("Vladut").get(0),listOfEqTests.get(0));
//		assertEquals(listOfEqTests.get(0).getDeliver_date(),eqTest.getDeliver_date());
//		assertEquals(listOfEqTests.get(0).getId(),eqTest.getId());
//		assertEquals(listOfEqTests.get(0).getPackage_name(),eqTest.getPackage_name());
//		assertEquals(listOfEqTests.get(0).getDeliver_adress(),eqTest.getDeliver_adress());
//		assertEquals(listOfEqTests.get(0).getPickup_adress(),eqTest.getPickup_adress());
//		assertEquals(listOfEqTests.get(0).getPickup_date(),eqTest.getPickup_date());
//		assertEquals(listOfEqTests.get(0).getReceiver_name(),eqTest.getReceiver_name());
//		assertEquals(listOfEqTests.get(0).getSender_name(),eqTest.getSender_name());
//		assertEquals(listOfEqTests.get(0).getSender_username(),eqTest.getSender_username());
//
//		
//		assertEquals(listOfEqTests.get(1).getDeliver_date(),eqTest2.getDeliver_date());
//		assertEquals(listOfEqTests.get(1).getId(),eqTest2.getId());
//		assertEquals(listOfEqTests.get(1).getPackage_name(),eqTest2.getPackage_name());
//		assertEquals(listOfEqTests.get(1).getDeliver_adress(),eqTest2.getDeliver_adress());
//		assertEquals(listOfEqTests.get(1).getPickup_adress(),eqTest2.getPickup_adress());
//		assertEquals(listOfEqTests.get(1).getPickup_date(),eqTest2.getPickup_date());
//		assertEquals(listOfEqTests.get(1).getReceiver_name(),eqTest2.getReceiver_name());
//		assertEquals(listOfEqTests.get(1).getSender_name(),eqTest2.getSender_name());
//		assertEquals(listOfEqTests.get(1).getSender_username(),eqTest.getSender_username());
	}

}
