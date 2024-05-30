package com.example.test_back_comment.domain.dto.response;

import com.example.test_back_comment.domain.entity.Comment;

public record CommentResponse (
        Long id,
        String content
){
    public static CommentResponse from(Comment comment) {
        return new CommentResponse(comment.getId(), comment.getContent());
    }
}
