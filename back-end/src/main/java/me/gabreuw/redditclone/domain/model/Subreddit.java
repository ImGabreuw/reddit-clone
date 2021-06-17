package me.gabreuw.redditclone.domain.model;

import lombok.Data;

import javax.persistence.*;

import java.time.Instant;
import java.util.List;

import static javax.persistence.FetchType.LAZY;
import static javax.persistence.GenerationType.IDENTITY;

@Data
@Entity
public class Subreddit {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String description;

    private Instant createdDate;

    @OneToMany
    private List<Post> posts;

    @ManyToOne(fetch = LAZY)
    private User user;

}
