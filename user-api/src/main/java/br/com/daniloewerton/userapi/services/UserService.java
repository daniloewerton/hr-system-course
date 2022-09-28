package br.com.daniloewerton.userapi.services;

import br.com.daniloewerton.userapi.domain.User;

import java.util.List;

public interface UserService {

    User findById(Long id);
    List<User> findAll();
}
