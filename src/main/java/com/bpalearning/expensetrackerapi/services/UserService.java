package com.bpalearning.expensetrackerapi.services;

import com.bpalearning.expensetrackerapi.domain.User;
import com.bpalearning.expensetrackerapi.exception.ETAuthException;


public interface UserService {
    User validateUser(String email, String password) throws ETAuthException;

    User registerUser(String firstName, String lastName, String email, String password) throws ETAuthException;


}
