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
@Table(name = "chapters")
public class Chapter {
    
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private int chapterNumber;

    private String title;

    @ManyToOne
    @JoinColumn(name = "book_id", nullable = false)
    private Book book;
    
    private String contentUrl; // PDF, Text, or Image URLs

    private LocalDateTime createdAt = LocalDateTime.now();
}
