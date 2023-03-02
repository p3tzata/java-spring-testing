package com.example.javaspringtesting.stream;

import com.example.javaspringtesting.stream.model.Author;
import java.util.List;
import java.util.stream.Collectors;


public class FlatMap {

  public String flatMap() {

    Author author1 = new Author("Ivo", List.of("Geeks", "for", "Geeks"));
    Author author2 = new Author("Ivo1", List.of("Geeks9", "for", "Geeks"));
    Author author3 = new Author("Pep2", List.of("Geeks9", "for", "Geeks"));

    List<Author> authors = List.of(author1, author2, author3);

    Object collect = authors.stream().flatMap(el -> el.getComments().stream()).collect(Collectors.toList());

    return collect.toString();

  }
}
