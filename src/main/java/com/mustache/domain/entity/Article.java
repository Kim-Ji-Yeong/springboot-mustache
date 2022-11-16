package com.mustache.domain.entity;

import com.mustache.domain.dto.ArticleDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
//@Table(name ="article2")
@Getter
@Builder
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String content;

    public Article(String title, String content) {
        this.title = title;
        this.content = content;
    }
        //Article을 ArticleDto로 만드는 부분
        public static ArticleDto of (Article article){
            return new ArticleDto(article.getId(), article.getTitle(), article.getContent());
        }
    }
