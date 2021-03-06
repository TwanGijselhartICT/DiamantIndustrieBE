package com.backend.diamantindustrie.web;

import java.util.Map;

import com.backend.diamantindustrie.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class DiamondController {

    @Autowired
    private UserService userService;

    @Autowired
    private PointOfInterestService pointOfInterestService;

    @GetMapping("/api/poi")
    public ResponseEntity<?> fetchAllPOINames(){
        return ResponseEntity.ok(pointOfInterestService.FetchAllPointOfInterest());
    }

    @RequestMapping(method = RequestMethod.POST, value = "/api/user")
    public ResponseEntity<?> AddUserToDB(@RequestParam Map<String, String> customQuery){
        return  ResponseEntity.ok(userService.InsertUserIntoDB(customQuery.get("username"), Integer.parseInt(customQuery.get("age"))));
    }

    @RequestMapping(method = RequestMethod.GET, value = "api/user")
    public ResponseEntity<?> CheckIfUserExist(@RequestParam Map<String, String> customQuery){
        return ResponseEntity.ok(userService.CheckIfUserAndAgeExists(customQuery.get("username"), Integer.parseInt(customQuery.get("age"))));
    }

    @RequestMapping(method = RequestMethod.GET, value = "api/diamonds")
    public  ResponseEntity<?> GetDiamonds(@RequestParam Map<String, String> customQuery)
    {
        return ResponseEntity.ok(userService.CheckDiamonds(customQuery.get("username"), Integer.parseInt(customQuery.get("age"))));
    }

    @RequestMapping(method = RequestMethod.PUT, value = "api/diamonds")
    public ResponseEntity<?> UpdateDiamond (@RequestParam (defaultValue = "0") String username, @RequestParam (defaultValue = "0") int age, @RequestParam (defaultValue = "0") int diamonds)
    {
        return ResponseEntity.ok(userService.UpdateDiamondsInDB(username, age, diamonds));
    }

    

}
