package com.bpalearning.expensetrackerapi.repositories;

import com.bpalearning.expensetrackerapi.domain.User;
import com.bpalearning.expensetrackerapi.exception.ETAuthException;
import org.springframework.stereotype.Repository;


public interface UserRepository {
    //find userId by using all user data parameters
    Integer create(String firstName, String lastName, String email, String password) throws ETAuthException;

    //find UserId by email and password
    User findByEmailAndPassword(String email, String password) throws ETAuthException;

    //To register a new user, check whether the user is already in the list or not
    Integer GetCountBy(String email) throws ETAuthException;

    //get User by given User Id
    User findByUserId(Integer userId) throws ETAuthException;

}
