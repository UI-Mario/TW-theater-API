package com.thoughtworks.theater.repository;

import com.thoughtworks.theater.entity.Movie;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends CrudRepository<Movie, String> {
  // TODO: complete this repository
}
