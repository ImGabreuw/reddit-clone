package me.gabreuw.redditclone.domain.model.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum VoteType {

    UPVOTE(1),
    DOWNVOTE(-1);

    @Getter
    private final int direction;

}
