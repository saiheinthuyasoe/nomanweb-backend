package com.nomanweb.models;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "books")
public class Book {
    
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(nullable = false, unique = true)
    private String title;

    private String description;
    
    private String author;
    
    private String coverImageUrl;
    
    @Enumerated(EnumType.STRING)
    private BookType type; // Manga, Manhwa, Novel, etc.

    private LocalDateTime createdAt = LocalDateTime.now();
}

enum BookType {
    MANGA,
    SHONEN_MANGA,
    SHOUJO_MANGA,
    SEINEN_MANGA,
    JOSEI_MANGA,
    KODOMO_MANGA,
    MANHWA,
    JOSEON_MANHWA,
    MANHUA,
    WEBTOON,
    DOUJINSHI,
    AMERICAN_COMICS,
    SUPERHERO_COMICS,
    INDIE_COMICS,
    GRAPHIC_NOVEL,
    BANDE_DESSINEE,
    FRANCO_BELGIAN_COMICS,
    FUMETTI,
    HISTORIETA,
    ARGENTINE_COMICS,
    MEXICAN_COMICS,
    BRAZILIAN_COMICS,
    COMIC_STRIP,
    INDIE_ALTERNATIVE_COMICS,
    TURKISH_COMICS,
    RAJ_COMICS,
    TINKLE_COMICS,
    FILIPINO_KOMIKS,
    MIDDLE_EASTERN_COMICS,
    AFRICAN_COMICS,
    MOTION_COMICS,
    INTERACTIVE_COMICS,
    LIGHT_NOVEL,
    WEB_NOVEL,
    VISUAL_NOVEL,
    HYBRID_COMICS,
    UNDERGROUND_COMICS,
    EXPERIMENTAL_COMICS,
    AI_GENERATED_COMICS,
    SILENT_COMICS
}
