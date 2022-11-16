package com.mustache.controller;

import com.mustache.domain.dto.ArticleAddRequest;
import com.mustache.domain.dto.ArticleAddResponse;
import com.mustache.domain.dto.ArticleDto;
import com.mustache.service.ArticleService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

//받은 요청과 parameter를 Service로 보내고 그 결과를 받아서 return
@RestController
@RequestMapping("/api/v1/articles")
public class ArticleRestController {

    private final ArticleService articleService;

    public ArticleRestController(ArticleService articleService) {
        this.articleService = articleService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<ArticleDto> getArticle(@PathVariable Long id) {
        ArticleDto articleDto = articleService.getArticleById(id);
        return ResponseEntity.ok().body(articleDto);
    }
    @PostMapping
    public ResponseEntity<ArticleAddResponse> addArticle(ArticleAddRequest dto){
        ArticleAddResponse response = articleService.add(dto);
        return ResponseEntity.ok().body(response);
    }
}