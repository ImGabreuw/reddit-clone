package me.gabreuw.redditclone.domain.repository;

import me.gabreuw.redditclone.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {}