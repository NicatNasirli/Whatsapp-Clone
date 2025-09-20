package personal.whatsappclone.dtos;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetMessageResponse {

    private Long id;
    private String content;
    private LocalDateTime sentAt;
    private boolean isRead;
    private Long senderId;
    private Long receiverId;
}
