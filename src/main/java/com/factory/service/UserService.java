package com.factory.service;

import com.factory.model.request.UserRequest;
import com.factory.model.response.UserResponse;

import java.util.List;

public interface UserService {

    UserResponse create(UserRequest request);
    List<UserResponse> getAll();
}
