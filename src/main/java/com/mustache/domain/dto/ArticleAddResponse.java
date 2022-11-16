package com.mustache.domain.dto;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ArticleAddResponse {
    private Long id;
    private String title;
    private String content;
}
