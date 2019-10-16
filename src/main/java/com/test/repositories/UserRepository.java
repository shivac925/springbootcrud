package com.test.repositories;

import java.util.List;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.test.model.User;
 
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
 
//    User findByName(String name);
	
	@Query("FROM User")
	@Cacheable("myCache")
	List<User> getAllUsers();
	
}
