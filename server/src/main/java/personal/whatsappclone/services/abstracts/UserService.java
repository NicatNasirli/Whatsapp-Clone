package personal.whatsappclone.services.abstracts;

import org.springframework.stereotype.Service;
import personal.whatsappclone.dtos.CreateUserRequest;
import personal.whatsappclone.dtos.UserResponse;

import java.util.List;

@Service
public interface UserService {

    void add(CreateUserRequest userRequest);

    UserResponse checkUser(CreateUserRequest userRequest);

    List<UserResponse> getAll();
}
