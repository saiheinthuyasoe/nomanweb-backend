package com.nomanweb.services;

import com.nomanweb.models.Chapter;
import com.nomanweb.models.Book;
import com.nomanweb.repositories.ChapterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class ChapterService {

    @Autowired
    private ChapterRepository chapterRepository;

    public List<Chapter> getChaptersByBook(Book book) {
        return chapterRepository.findByBook(book);
    }

    public Optional<Chapter> getChapterById(UUID id) {
        return chapterRepository.findById(id);
    }

    public Chapter createChapter(Chapter chapter) {
        return chapterRepository.save(chapter);
    }

    public void deleteChapter(UUID id) {
        chapterRepository.deleteById(id);
    }
}
