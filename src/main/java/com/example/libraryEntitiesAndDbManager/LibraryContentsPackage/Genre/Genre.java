package com.example.libraryEntitiesAndDbManager.LibraryContentsPackage.Genre;

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
public class Genre {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    @ManyToMany(mappedBy = "genres")
    private Set<Book> books;
}
