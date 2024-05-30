package com.example.test_back_comment.service;

import com.example.test_back_comment.domain.dto.Request.CommentRequest;
import com.example.test_back_comment.domain.dto.response.CommentResponse;
import com.example.test_back_comment.domain.entity.Comment;
import com.example.test_back_comment.domain.repository.CommentRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CommentServiceImpl implements CommentService {
    private final CommentRepository commentRepository;

    @Override
    public List<CommentResponse> getAllCommentsByPostId(Long postId) {
        return commentRepository.findAllByBoardId(postId).stream().map(CommentResponse::from).toList();
    }

    @Override
    @Transactional
    public void addComment(CommentRequest req) {
        commentRepository.save(req.toEntity());
    }

    @Override
    @Transactional
    public void deleteComment(Long id) {
        Comment comment = commentRepository.findById(id).orElseThrow(IllegalArgumentException::new);
        commentRepository.deleteById(comment.getId());
    }
}
