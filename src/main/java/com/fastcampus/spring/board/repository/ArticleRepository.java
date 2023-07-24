package com.fastcampus.spring.board.repository;

import com.fastcampus.spring.board.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Long> {
}