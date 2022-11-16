package com.mustache.service;

import com.mustache.domain.dto.ArticleAddRequest;
import com.mustache.domain.dto.ArticleAddResponse;
import com.mustache.domain.dto.ArticleDto;
import com.mustache.domain.entity.Article;
import com.mustache.repository.ArticleRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

//Repository에서 .findById한 후 ArticleDto로 만드는 기능
@Service
public class ArticleService {

    private final ArticleRepository articleRepository;

    public ArticleService(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }

    public ArticleDto getArticleById(Long id) {
        Optional<Article> optArticle = articleRepository.findById(id);
        ArticleDto articleDto = Article.of(optArticle.get());
        return articleDto;
    }

    public ArticleAddResponse add(ArticleAddRequest dto) {
        Article article = dto.toEntity();
        Article savedArticle = articleRepository.save(article);
        return new ArticleAddResponse(savedArticle.getId(), savedArticle.getTitle(), savedArticle.getContent())
    }
}
