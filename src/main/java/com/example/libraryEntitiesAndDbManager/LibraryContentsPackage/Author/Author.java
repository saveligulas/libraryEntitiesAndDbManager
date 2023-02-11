package com.example.libraryEntitiesAndDbManager.LibraryContentsPackage.Author;

import com.example.libraryEntitiesAndDbManager.LibraryContentsPackage.Book.Book;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Author {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    @OneToMany(targetEntity = Book.class, mappedBy = "author",
            fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<Book> books;
}
