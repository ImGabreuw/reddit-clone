package me.gabreuw.redditclone.domain.repository;

import me.gabreuw.redditclone.domain.model.Vote;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VoteRepository extends JpaRepository<Vote, Long> {}