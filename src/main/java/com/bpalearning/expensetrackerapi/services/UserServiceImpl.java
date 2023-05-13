package com.bpalearning.expensetrackerapi.services;

import com.bpalearning.expensetrackerapi.domain.User;
import com.bpalearning.expensetrackerapi.exception.ETAuthException;
import com.bpalearning.expensetrackerapi.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;

    @Override
    public User validateUser(String email, String password) throws ETAuthException {
        return null;
    }

    @Override
    public User registerUser(String firstName, String lastName, String email, String password) throws ETAuthException {
        return null;
    }
}
