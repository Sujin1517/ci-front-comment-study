package com.example.test_back_comment.service;

import com.example.test_back_comment.domain.dto.Request.CommentRequest;
import com.example.test_back_comment.domain.dto.response.CommentResponse;

import java.util.List;

public interface CommentService {
    List<CommentResponse> getAllCommentsByPostId(Long postId);
    void addComment(CommentRequest req);
    void deleteComment(Long id);
}
