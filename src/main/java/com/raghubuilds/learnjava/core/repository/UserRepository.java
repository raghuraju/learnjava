package com.raghubuilds.learnjava.core.repository;

import com.raghubuilds.learnjava.core.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
