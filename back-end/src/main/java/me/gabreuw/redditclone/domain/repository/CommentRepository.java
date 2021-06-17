package me.gabreuw.redditclone.domain.repository;

import me.gabreuw.redditclone.domain.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {}