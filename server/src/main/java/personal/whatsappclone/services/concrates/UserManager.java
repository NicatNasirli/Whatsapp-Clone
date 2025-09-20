package personal.whatsappclone.services.concrates;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import personal.whatsappclone.dataAccess.UserRepository;
import personal.whatsappclone.services.abstracts.UserService;

@AllArgsConstructor
@Component
public class UserManager implements UserService {

    private final UserRepository userRepository;
}
