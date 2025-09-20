package personal.whatsappclone.utilities.mappers;

import org.springframework.stereotype.Component;
import personal.whatsappclone.dtos.CreateMessageRequest;
import personal.whatsappclone.dtos.GetMessageResponse;
import personal.whatsappclone.entities.Message;

import java.time.LocalDateTime;

@Component
public class MessageMapper {

    public static Message mapToMessage(CreateMessageRequest messageRequest){
        Message message = new Message();

        message.setContent(messageRequest.getContent());
        message.setSentAt(LocalDateTime.now());
        message.setRead(false);
        message.setReceiverId(messageRequest.getReceiverId());
        message.setSenderId(messageRequest.getSenderId());

        return message;

    }

    public static GetMessageResponse mapToResponse(Message message){
        GetMessageResponse messageResponse = new GetMessageResponse();

        messageResponse.setId(message.getId());
        messageResponse.setContent(message.getContent());
        messageResponse.setRead(true);
        messageResponse.setReceiverId(message.getReceiverId());
        messageResponse.setSenderId(message.getSenderId());
        messageResponse.setSentAt(message.getSentAt());

        return messageResponse;
    }
}
