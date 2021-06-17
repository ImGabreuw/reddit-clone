package me.gabreuw.redditclone.domain.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import java.time.Instant;

@Data
@Entity
public class User {

    @Id
    @GeneratedValue
    private Long userId;

    @Column(nullable = false)
    private String username;

    @Column(nullable = false)
    private String password;

    @Email
    @Column(nullable = false)
    private String email;

    private Instant created;

    private boolean enabled;
}
