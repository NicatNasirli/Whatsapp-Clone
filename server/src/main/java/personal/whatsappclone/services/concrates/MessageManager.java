package personal.whatsappclone.services.concrates;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import personal.whatsappclone.dataAccess.MessageRepository;
import personal.whatsappclone.dtos.CreateMessageRequest;
import personal.whatsappclone.dtos.GetMessageResponse;
import personal.whatsappclone.entities.Message;
import personal.whatsappclone.services.abstracts.MessageService;
import personal.whatsappclone.utilities.mappers.MessageMapper;

import java.util.Optional;

@AllArgsConstructor
@Component
public class MessageManager implements MessageService {

    private final MessageRepository messageRepository;

    @Override
    public void add(CreateMessageRequest createMessageRequest) {
        this.messageRepository.save(MessageMapper.mapToMessage(createMessageRequest));
    }

    @Override
    public GetMessageResponse getMessage(Long userid1, Long userid2) {
        Optional<Message> foundMessage = this.messageRepository.findBySenderIdAndAndReceiverId(userid1, userid2);

        return foundMessage.map(MessageMapper::mapToResponse).orElse(null);
    }
}
