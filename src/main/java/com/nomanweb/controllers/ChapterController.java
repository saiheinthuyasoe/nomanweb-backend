package com.nomanweb.controllers;

import com.nomanweb.models.Chapter;
import com.nomanweb.models.Book;
import com.nomanweb.repositories.BookRepository;
import com.nomanweb.services.ChapterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/api/chapters")
public class ChapterController {

    @Autowired
    private ChapterService chapterService;

    @Autowired
    private BookRepository bookRepository;

    @GetMapping("/{bookId}")
    public List<Chapter> getChaptersByBook(@PathVariable UUID bookId) {
        Optional<Book> book = bookRepository.findById(bookId);
        return book.map(chapterService::getChaptersByBook).orElse(null);
    }

    @PostMapping
    public Chapter createChapter(@RequestBody Chapter chapter) {
        return chapterService.createChapter(chapter);
    }

    @DeleteMapping("/{id}")
    public void deleteChapter(@PathVariable UUID id) {
        chapterService.deleteChapter(id);
    }
}
