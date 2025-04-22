package car.service.backend.service;

import car.service.backend.dto.UserRequest;
import car.service.backend.dto.UserResponse;

import java.util.List;

public interface UserService {
    UserResponse createUser(UserRequest request);
    UserResponse getUserById(Long id);
    List<UserResponse> getAllUsers();
}
