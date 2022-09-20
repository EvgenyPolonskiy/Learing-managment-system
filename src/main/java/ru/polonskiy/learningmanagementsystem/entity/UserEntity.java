package ru.polonskiy.learningmanagementsystem.entity;


import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Data
@Entity
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "login", nullable = false, updatable = false)
    @Size(min = 5)
    private String login;

    @Column(name = "password", nullable = false, length = 3000)
    private String password;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "surname", nullable = false)
    private String surname;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "phone_number", nullable = false)
    @Size(min = 7)
    private String phoneNumber;

    @Column(name = "url_avatar")
    private String urlAvatar;


    private ZonedDateTime registrationDate;
    private String updateUser;
    private ZonedDateTime updateDate;

    @ElementCollection(targetClass = Role.class)
    @CollectionTable(name = "user_role", joinColumns = @JoinColumn("user_id"))
    private Set<Role> role = new HashSet<>();

/*    @OneToMany(cascade = )*/
    /*private List<CourseEntity> courses = new ArrayList<>();*/

}
