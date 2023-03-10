package com.example.libraryEntitiesAndDbManager.LibraryContentsPackage.Publisher;

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
public class Publisher {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    @OneToMany(mappedBy = "publisher")
    private Set<Book> books;
}
