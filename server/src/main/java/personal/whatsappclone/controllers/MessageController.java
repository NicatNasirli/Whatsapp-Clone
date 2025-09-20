package personal.whatsappclone.controllers;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import personal.whatsappclone.dtos.CreateMessageRequest;
import personal.whatsappclone.dtos.GetMessageResponse;
import personal.whatsappclone.services.concrates.MessageManager;

@AllArgsConstructor
@RestController
@RequestMapping("api/messages")
public class MessageController {

    private final MessageManager messageManager;

    @PostMapping("/send")
    public ResponseEntity<String> send(@RequestBody CreateMessageRequest createMessageRequest){
        this.messageManager.add(createMessageRequest);

        return ResponseEntity.ok("Message sent!");
    }

    @GetMapping("/chat/{userid1}/{userid2}")
    public ResponseEntity<GetMessageResponse> getMessages(@PathVariable Long userid1, @PathVariable Long userid2){
        return ResponseEntity.ok(this.messageManager.getMessage(userid1, userid2));
    }

}
