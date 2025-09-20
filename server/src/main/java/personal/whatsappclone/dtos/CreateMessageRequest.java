package personal.whatsappclone.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateMessageRequest {

    private String content;
    private Long senderId;
    private Long receiverId;
}
