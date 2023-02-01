package com.example.fieldpasserbe.post.service;

import com.example.fieldpasserbe.post.dto.PostListResponseDto;
import org.springframework.data.domain.Slice;

public interface PostService {

    Long countPostById(int id);

    Slice<PostListResponseDto> PostList(int page);
}