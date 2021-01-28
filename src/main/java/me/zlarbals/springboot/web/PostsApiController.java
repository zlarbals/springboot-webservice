package me.zlarbals.springboot.web;

import lombok.RequiredArgsConstructor;
import me.zlarbals.springboot.service.PostsService;
import me.zlarbals.springboot.web.dto.PostsSaveRequestDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class PostsApiController {

    private final PostsService postsService;

    @PostMapping("/api/v1/posts")
    public Long save(@RequestBody PostsSaveRequestDto requestDto){
        return postsService.save(requestDto);
    }

}
