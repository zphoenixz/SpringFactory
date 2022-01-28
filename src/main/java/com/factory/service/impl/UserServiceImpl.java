package com.factory.service.impl;

import com.factory.builder.UserBuilder;
import com.factory.model.UserFactory;
import com.factory.model.request.UserRequest;
import com.factory.model.response.UserResponse;
import com.factory.repository.UserRepository;
import com.factory.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository repository;
    private final UserFactory userFactory = new UserFactory();

    @Override
    public UserResponse create(UserRequest request) {
        var entity = userFactory.createUser(request.getType(), request);
        var entitySaved = repository.save(entity);
        return UserBuilder.entityToResponseCreate(entitySaved);
    }

    @Override
    public List<UserResponse> getAll() {
        return UserBuilder.listEntityToResponse(repository.findAll());
    }
}
