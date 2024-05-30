package com.example.test_back_comment.domain.dto.Request;

import com.example.test_back_comment.domain.entity.Comment;

public record CommentRequest(
        Long boardId,
        String content
) {
    public Comment toEntity() {
        return new Comment(
                null,
                boardId,
                content
        );
    }
}
