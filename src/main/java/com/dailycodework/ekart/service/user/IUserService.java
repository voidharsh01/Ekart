package com.dailycodework.ekart.service.user;

import com.dailycodework.ekart.dto.UserDto;
import com.dailycodework.ekart.model.User;
import com.dailycodework.ekart.request.CreateUserRequest;
import com.dailycodework.ekart.request.UserUpdateRequest;

public interface IUserService {

    User getUserById(Long userId);
    User createUser(CreateUserRequest request);
    User updateUser(UserUpdateRequest request, Long userId);
    void deleteUser(Long userId);

    UserDto convertUserToDto(User user);
}
