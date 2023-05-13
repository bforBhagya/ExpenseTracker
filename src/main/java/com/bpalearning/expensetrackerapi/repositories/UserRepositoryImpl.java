package com.bpalearning.expensetrackerapi.repositories;

import com.bpalearning.expensetrackerapi.domain.User;
import com.bpalearning.expensetrackerapi.exception.ETAuthException;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepositoryImpl implements UserRepository{
    @Override
    public Integer create(String firstName, String lastName, String email, String password) throws ETAuthException {
        return null;
    }

    @Override
    public User findByEmailAndPassword(String email, String password) throws ETAuthException {
        return null;
    }

    @Override
    public Integer GetCountBy(String email) throws ETAuthException {
        return null;
    }

    @Override
    public User findByUserId(Integer userId) throws ETAuthException {
        return null;
    }
}
