package com.example.javaspringtesting.stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class FlatMapTest {

  @Test
  void withGroupingBy() {
    Collectors_ collectors = new Collectors_();
    String actual = collectors.flatMapping();
    String expected = "{Ivo=[Geeks, for, Geeks, Geeks9, for, Geeks], Pepi=[Geeks9, for, Geeks]}";
    Assertions.assertEquals(expected,actual);
  }

  @Test
  void sample() {
    FlatMap fm = new FlatMap();
    String actual = fm.flatMap();
    String expected = "[Geeks, for, Geeks, Geeks9, for, Geeks, Geeks9, for, Geeks]";
    Assertions.assertEquals(expected,actual);
  }

}
