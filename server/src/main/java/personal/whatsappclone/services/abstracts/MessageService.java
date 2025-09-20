package personal.whatsappclone.services.abstracts;

import org.springframework.stereotype.Service;
import personal.whatsappclone.dtos.CreateMessageRequest;
import personal.whatsappclone.dtos.GetMessageResponse;

@Service
public interface MessageService {

    void add(CreateMessageRequest createMessageRequest);

    GetMessageResponse getMessage(Long userid1, Long userid2);
}
