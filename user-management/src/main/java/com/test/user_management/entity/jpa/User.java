package com.test.user_management.entity.jpa;


import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "tbl_user")
public class User extends AuditEntity{

    @Id
    @Column(columnDefinition = "serial")
    private Long id;

    @Column(length = 55, unique = true)
    private String email;

    private String password;
    @Column(length = 100, name="full_name")
    private String fullName;
    @Column(length = 100)
    private String username;
    private String role;

}
