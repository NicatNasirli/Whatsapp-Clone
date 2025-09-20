package personal.whatsappclone.controllers;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import personal.whatsappclone.dtos.CreateUserRequest;
import personal.whatsappclone.dtos.UserResponse;
import personal.whatsappclone.services.concrates.UserManager;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("api/users")
public class UserController {

    private final UserManager userManager;

    @PostMapping("/register")
    public ResponseEntity<String> register(@RequestBody CreateUserRequest user){
        this.userManager.add(user);

        return ResponseEntity.ok("Registered successfully");
    }

    @PostMapping("/login")
    public UserResponse login(@RequestBody CreateUserRequest user){
        return this.userManager.checkUser(user);
    }

    @GetMapping
    public ResponseEntity<List<UserResponse>> getAll(){
        this.userManager.getAll();

        return new ResponseEntity<>(HttpStatus.OK);
    }

}
