package com.backend.diamantindustrie;

import com.backend.diamantindustrie.service.PointOfInterestService;
import com.backend.diamantindustrie.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class DiamondIndustryApplicationTests {

	@Autowired
	private UserService userService;

	@Autowired
	private PointOfInterestService pointOfInterestService;

	@Test
	void CheckPOIAmount() {
		//Currently 7 POI items in the database so it should pass
		assertEquals(7, pointOfInterestService.FetchAllPointOfInterest().size(), 0);
	}

	@Test
	void CheckIfUserExist() {
		assertEquals("true", userService.CheckIfUserAndAgeExists("TestCaseUser", 1));
	}

	@Test
	void Get_Update_Get_Restore_GetDiamonds() {
		//Get the initial value of the amount of diamonds a specific user has
		assertEquals("15" , userService.CheckDiamonds("TestCaseUser",1));
		//Update the initial value to 30 and check if the response is good
		assertEquals("Succesvol: 30 bijgewerkt in de database!", userService.UpdateDiamondsInDB("TestCaseUser", 1, 30));
		//Check if the value is updated to 30
		assertEquals("30" , userService.CheckDiamonds("TestCaseUser",1));
		//Reset the amount back to 15 and check if the response is good
		assertEquals("Succesvol: 15 bijgewerkt in de database!", userService.UpdateDiamondsInDB("TestCaseUser", 1, 15));
		//Check if the value is updated back to 15
		assertEquals("15" , userService.CheckDiamonds("TestCaseUser",1));

	}


}
