package com.kreena.crudfullstackbackend.repository;
import com.kreena.crudfullstackbackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

}
