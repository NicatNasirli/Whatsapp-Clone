package personal.whatsappclone.controllers;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import personal.whatsappclone.dtos.CreateUserRequest;
import personal.whatsappclone.services.concrates.UserManager;

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

}
