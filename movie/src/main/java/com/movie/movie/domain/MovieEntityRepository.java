package com.movie.movie.domain;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface MovieEntityRepository extends JpaRepository<MovieEntity, UUID> {
}