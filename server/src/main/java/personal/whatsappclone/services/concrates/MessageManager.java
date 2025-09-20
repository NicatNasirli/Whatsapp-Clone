package personal.whatsappclone.services.concrates;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import personal.whatsappclone.dataAccess.MessageRepository;
import personal.whatsappclone.services.abstracts.MessageService;

@AllArgsConstructor
@Component
public class MessageManager implements MessageService {

    private final MessageRepository messageRepository;
}
