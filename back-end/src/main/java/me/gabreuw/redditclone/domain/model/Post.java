package me.gabreuw.redditclone.domain.model;

import lombok.Data;

import javax.persistence.*;

import java.time.Instant;

import static javax.persistence.FetchType.LAZY;
import static javax.persistence.GenerationType.IDENTITY;

@Data
@Entity
public class Post {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long postId;

    @Column(nullable = false)
    private String postName;

    @Column(nullable = false)
    private String url;

    @Lob
    @Column(nullable = false)
    private String description;

    private Integer voteCount;

    private Instant createdDate;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(
            name = "userId",
            referencedColumnName = "userId"
    )
    private User user;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(
            name = "id",
            referencedColumnName = "id"
    )
    private Subreddit subreddit;

}
