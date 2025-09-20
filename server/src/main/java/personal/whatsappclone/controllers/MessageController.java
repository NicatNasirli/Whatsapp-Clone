package personal.whatsappclone.controllers;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import personal.whatsappclone.services.concrates.MessageManager;

@AllArgsConstructor
@RestController
@RequestMapping("api/messages")
public class MessageController {

    private final MessageManager messageManager;

}
