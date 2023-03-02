package com.example.javaspringtesting.stream.model;

import java.util.List;

public class Author {

  String name;
  List<String> comments;

  public Author(String name, List<String> comments) {

    this.name = name;
    this.comments = comments;

  }

  public String getName() {

    return name;
  }

  public List<String> getComments() {

    return comments;
  }
}
