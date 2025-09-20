package personal.whatsappclone.utilities;

import org.springframework.stereotype.Component;
import personal.whatsappclone.dtos.CreateUserRequest;
import personal.whatsappclone.dtos.UserResponse;
import personal.whatsappclone.entities.User;

import java.time.LocalDateTime;

@Component
public class UserMapper {


    public static User mapToUser(CreateUserRequest userRequest){
        User user = new User();

        user.setUsername(userRequest.getUsername());
        user.setPassword(userRequest.getPassword());
        user.setCreatedAt(LocalDateTime.now());

        return user;
    }

    public static UserResponse mapToResponse(User user){
        UserResponse userResponse = new UserResponse();

        userResponse.setId(user.getId());
        userResponse.setUsername(user.getUsername());
        userResponse.setPassword(user.getPassword());
        userResponse.setCreatedAt(user.getCreatedAt());

        return userResponse;
    }
}
