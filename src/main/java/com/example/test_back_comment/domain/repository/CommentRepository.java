package com.example.test_back_comment.domain.repository;

import com.example.test_back_comment.domain.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepository
        extends JpaRepository<Comment, Long> {

    List<Comment> findAllByBoardId(Long id);
}
