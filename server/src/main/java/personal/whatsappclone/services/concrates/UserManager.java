package personal.whatsappclone.services.concrates;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import personal.whatsappclone.dataAccess.UserRepository;
import personal.whatsappclone.dtos.CreateUserRequest;
import personal.whatsappclone.services.abstracts.UserService;
import personal.whatsappclone.utilities.UserMapper;

@AllArgsConstructor
@Component
public class UserManager implements UserService {

    private final UserRepository userRepository;

    @Override
    public void add(CreateUserRequest userRequest) {
        this.userRepository.save(UserMapper.mapToUser(userRequest));
    }
}
