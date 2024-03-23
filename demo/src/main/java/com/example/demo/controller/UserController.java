package com.example.demo.controller;
import com.example.demo.Repository.CampaignRepository;
import com.example.demo.Repository.UserRepository;
import com.example.demo.models.Campaign;
import com.example.demo.models.User;

import com.example.demo.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

import java.util.Optional;


@RestController
public class UserController {

    private final UserService userService;
    @Autowired

    private UserRepository userRepository;
    @Autowired

    private CampaignRepository campaignRepository;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping(path="/user/{id}/campaigns")
    public @ResponseBody String createNewCampaign(@PathVariable Long id,@RequestParam String name, @RequestParam double budget, @RequestParam double spend, @RequestParam double kpi, @RequestParam double baseBid, @RequestParam double maxBid, @RequestParam double CPM){
        User user = userRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("User not found with id: " + id));
        Campaign newCampaign = new Campaign(user,name, budget,spend, kpi, baseBid, maxBid, CPM);
        user.getCampaigns().add(newCampaign);
        return "campaign successfully created with name: "+ name;
    }
    // Endpoint to create a new user
    @PostMapping("/users")
    public String createUser(@RequestParam String username,
                           @RequestParam String password,
                           @RequestParam String name,
                           @RequestParam String email,
                           @RequestParam String phoneNumber,
                           @RequestParam String address,
                           @RequestParam String companyName) {
        // Create a new user object
        User newUser = new User(username, password, name, email, phoneNumber, address, companyName);

        // Save the user to the database
        userRepository.save(newUser);

        return "user successfully created with name: "+ name;
    }
    @GetMapping("/find/{id}")
    public Optional<Campaign> findCampaignById(@PathVariable Integer id) {
        return campaignRepository.findById(id);
    }

}

