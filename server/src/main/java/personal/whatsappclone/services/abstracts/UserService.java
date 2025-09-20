package personal.whatsappclone.services.abstracts;

import org.springframework.stereotype.Service;
import personal.whatsappclone.dtos.CreateUserRequest;

@Service
public interface UserService {

    void add(CreateUserRequest userRequest);


}
