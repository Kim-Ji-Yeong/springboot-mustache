package com.mustache.controller;

import com.mustache.domain.dto.ArticleDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/articles")
@Slf4j // 로깅을 위한 어노테이션 log를 사용할 수있다.
public class ArticleController {

    @GetMapping(value = "/new")
    public String newArticleForm() {
        return "articles/new";
    }

    @PostMapping(value = "/posts")
    public String createArticle(ArticleDto form){
        log.info(form.toString());
        return "";
    }
}
