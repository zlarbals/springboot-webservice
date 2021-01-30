package me.zlarbals.springboot.web.dto;

import lombok.Getter;
import me.zlarbals.springboot.domain.posts.Posts;

@Getter
public class PostsResponseDto {

    private Long id;
    private String title;
    private String content;
    private String author;

    public PostsResponseDto(Posts entity) {
        this.id = entity.getId();
        this.title=entity.getTitle();
        this.content = entity.getContent();
        this.author = entity.getAuthor();
    }
}
