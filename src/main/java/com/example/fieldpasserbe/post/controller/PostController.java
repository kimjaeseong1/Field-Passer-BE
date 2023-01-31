package com.example.fieldpasserbe.post.controller;

import com.example.fieldpasserbe.post.service.PostService;
import com.example.fieldpasserbe.post.dto.PostListResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Slice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class PostController {

    private final PostService postService;

    @GetMapping("/api/post")
    public Slice<PostListResponseDto> postList(@RequestParam(name = "page") int page) {
        return postService.PostList(page);
    }
}
