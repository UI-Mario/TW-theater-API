package com.thoughtworks.theater.service;

import com.thoughtworks.theater.repository.MovieRepository;
import org.springframework.stereotype.Service;

@Service
public class MovieService {

  private final MovieRepository movieRepository;

  public MovieService(MovieRepository movieRepository) {
    this.movieRepository = movieRepository;
  }

  // TODO: complete this service
}
