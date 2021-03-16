package com.dev.repository;

import com.dev.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends JpaRepository<User, Long> {
    @Query(value = "from User u left join fetch u.vacancies v where u.email = :email")
    User findByEmail(@Param("email") String email);
}
