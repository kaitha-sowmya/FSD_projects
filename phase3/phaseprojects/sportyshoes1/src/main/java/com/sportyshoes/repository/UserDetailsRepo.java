package com.sportyshoes.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sportyshoes.entity.*;



@Repository
public interface UserDetailsRepo extends JpaRepository<UserDetails, Long> {
	

	public List<UserDetails> findByusername(String username);
}
