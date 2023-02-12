package com.example.libraryEntitiesAndDbManager.UserPackage.Role;

import com.example.libraryEntitiesAndDbManager.LibraryContentsPackage.Book.Book;
import com.example.libraryEntitiesAndDbManager.UserPackage.User.User;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Role {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    @OneToMany(targetEntity = User.class, mappedBy = "role",
            fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<User> users;

}
