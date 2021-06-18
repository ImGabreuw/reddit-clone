package me.gabreuw.redditclone.domain.model;

import lombok.Data;

import javax.persistence.*;

import java.time.Instant;

import static javax.persistence.FetchType.LAZY;
import static javax.persistence.GenerationType.IDENTITY;

@Data
@Entity
public class Comment {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String text;

    private Instant createdDate;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(
            name = "postId",
            referencedColumnName = "postId"
    )
    private Post post;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(
            name = "userId",
            referencedColumnName = "userId"
    )
    private User user;

}
