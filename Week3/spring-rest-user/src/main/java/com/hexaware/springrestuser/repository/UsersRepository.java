package com.hexaware.springrestuser.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hexaware.springrestuser.entities.Users;
@Repository
public interface UsersRepository extends JpaRepository<Users, Long> {
	List<Users> findBySalaryLessThan(double salary);
	@Query("select u from Users u where u.salary BETWEEN :min and :max")
	List<Users> BySalRange(double min,double max);
	@Modifying
	@Query("delete from Users u where u.userName=?1")
	int deleteByUsername(String userName);
}
