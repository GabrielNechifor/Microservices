package com.senderUserManagement.repositories;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import com.senderUserManagement.model.Profiles;

@RunWith(SpringRunner.class)
@DataJpaTest
@ActiveProfiles("profiles")
@AutoConfigureTestDatabase(replace=Replace.NONE)
public class GetProfileDataRepositoryTest {
	@Autowired
	ProfilesRepository obiect;

    @Test
public void testFindById() {
    	
    	Profiles eqTest = new Profiles("Andra", "andra_andronic@yahoo.mail", "0342564782","Romania", "sssss", "Primaverii nr 5"
    			,"Nucului nr 5","Pacii nr 6","Piata revolutiei nr 5","Aventurii nr 17");
    	Profiles eqTest2 = new Profiles("Andra", "andra_andronic@yahoo.mail", "0342564782","Romania", "sssss", "Primaverii nr 5"
    			,null,null,null,null);
    	
		obiect.findById("Andra");
		assertEquals(eqTest,obiect.findById("Andra"));
    	
    }

  }