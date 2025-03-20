package com.nomanweb.repositories;

import com.nomanweb.models.Chapter;
import com.nomanweb.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.UUID;

@Repository
public interface ChapterRepository extends JpaRepository<Chapter, UUID> {
    List<Chapter> findByBook(Book book);
}
