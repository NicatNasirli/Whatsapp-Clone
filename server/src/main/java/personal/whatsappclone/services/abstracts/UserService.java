package personal.whatsappclone.services.abstracts;

import org.springframework.stereotype.Service;
import personal.whatsappclone.dtos.CreateUserRequest;
import personal.whatsappclone.dtos.GetUserResponse;

import java.util.List;

@Service
public interface UserService {

    void add(CreateUserRequest userRequest);

    GetUserResponse checkUser(CreateUserRequest userRequest);

    List<GetUserResponse> getAll();
}
