package com.example.libraryEntitiesAndDbManager.Interfaces;

import java.util.Collection;
import java.util.Optional;

public interface LibraryService<Object> {
    public Collection<Object> getAll();
    public Optional<Object> getById(Long id);
    public String saveOrUpdate(Object o);
    public String deleteById(Long id);
}
