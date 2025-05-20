package com.movie.movie.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;

import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "rating_entity")
public class RatingEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(nullable = false)
    private UUID id;

    @OneToOne(cascade = CascadeType.ALL, optional = false, orphanRemoval = true)
    @JoinColumn(name = "movie_entity_id", nullable = false)
    private MovieEntity movieEntity;

    @Column(name = "would_watch_again")
    @Min(0)
    @Max(10)
    private Integer wouldWatchAgain;

    @Column(name = "acting_quality")
    @Min(1)
    @Max(10)
    private Integer actingQuality;

    @Column(name = "visual_effects")
    @Min(1)
    @Max(10)
    private Integer visualEffects;

    @Column(name = "plot")
    @Min(1)
    @Max(10)
    private Integer plot;
}