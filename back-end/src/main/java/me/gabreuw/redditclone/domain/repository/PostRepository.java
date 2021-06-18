package me.gabreuw.redditclone.domain.repository;

import me.gabreuw.redditclone.domain.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {}