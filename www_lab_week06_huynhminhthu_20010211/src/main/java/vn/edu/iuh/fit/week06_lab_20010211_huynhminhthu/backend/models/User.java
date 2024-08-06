package vn.edu.iuh.fit.week06_lab_20010211_huynhminhthu.backend.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;
import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "last_name",nullable = false, length = 50)
    private String lastName;

    @Column(name = "first_name", nullable = false, length = 50)
    private String firstName;

    @Column(name = "middle_name", nullable = false, length = 50)
    private String middleName;

    @Column(name = "email", nullable = false, length = 50)
    private String email;

    @Column(name = "mobile", nullable = false, length = 15)
    private String mobile;

    @Lob
    @Column(name = "profile")
    private String profile;

    @Lob
    @Column(name = "intro")
    private String intro;

    @Column(name = "password_hash", nullable = false, length = 32)
    private String passwordHash;

    @Column(name = "last_login", nullable = false)
    private Instant lastLogin;

    @Column(name = "registered_at")
    private Instant registeredAt;

    @OneToMany(mappedBy = "parent")
    private Set<Post> posts = new LinkedHashSet<>();

    @OneToMany(mappedBy = "post")
    private Set<PostComment> comments = new LinkedHashSet<>();

}
