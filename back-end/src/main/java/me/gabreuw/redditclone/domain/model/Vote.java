package me.gabreuw.redditclone.domain.model;

import lombok.Data;
import me.gabreuw.redditclone.domain.model.enums.VoteType;

import javax.persistence.*;

import static javax.persistence.EnumType.STRING;
import static javax.persistence.FetchType.LAZY;
import static javax.persistence.GenerationType.IDENTITY;

@Data
@Entity
public class Vote {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long voteId;

    @Enumerated(STRING)
    private VoteType voteType;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(
            name = "postId",
            referencedColumnName = "postId"
    )
    @Column(nullable = false)
    private Post post;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(
            name = "userId",
            referencedColumnName = "userId"
    )
    private User user;
}
