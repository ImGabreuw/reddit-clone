package me.gabreuw.redditclone.domain.repository;

import me.gabreuw.redditclone.domain.model.Subreddit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubredditRepository extends JpaRepository<Subreddit, Long> {}