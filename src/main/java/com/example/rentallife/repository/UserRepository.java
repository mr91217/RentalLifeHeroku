package com.example.rentallife.repository;

import com.example.rentallife.entity.User;
import com.example.rentallife.entity.UserType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    public User findUserByEmail(String email);
    public User findUserByUserName(String name);
    List<User> findByUserType(UserType userType);
    List<User> findAllByUserType(UserType userType);
    User findByUserName(String userName);

}
