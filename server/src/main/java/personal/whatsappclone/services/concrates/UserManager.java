package personal.whatsappclone.services.concrates;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import personal.whatsappclone.dataAccess.UserRepository;
import personal.whatsappclone.dtos.CreateUserRequest;
import personal.whatsappclone.dtos.GetUserResponse;
import personal.whatsappclone.entities.User;
import personal.whatsappclone.services.abstracts.UserService;
import personal.whatsappclone.utilities.mappers.UserMapper;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Component
public class UserManager implements UserService {

    private final UserRepository userRepository;

    @Override
    public void add(CreateUserRequest userRequest) {
        this.userRepository.save(UserMapper.mapToUser(userRequest));
    }

    @Override
    public GetUserResponse checkUser(CreateUserRequest userRequest) {
        Optional<User> foundUser = this.userRepository.
                findByUsernameAndAndPassword(userRequest.getUsername(), userRequest.getPassword());

        return foundUser.map(UserMapper::mapToResponse).orElse(null);
    }

    @Override
    public List<GetUserResponse> getAll() {
       return this.userRepository
               .findAll()
               .stream()
               .map(UserMapper::mapToResponse)
               .toList();
    }
}
