package personal.whatsappclone.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import personal.whatsappclone.services.concrates.UserManager;

@AllArgsConstructor
@RestController
@RequestMapping("api/users")
public class UserController {

    private final UserManager userManager;
}
