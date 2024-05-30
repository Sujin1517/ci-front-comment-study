package com.example.test_back_comment.controller;

import com.example.test_back_comment.domain.dto.Request.CommentRequest;
import com.example.test_back_comment.domain.dto.response.CommentResponse;
import com.example.test_back_comment.service.CommentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/comments")
@RequiredArgsConstructor
public class CommentController {
    private final CommentService commentService;

    @GetMapping("{id}")
    public List<CommentResponse> getCommentsByPostId(@PathVariable Long id){
        return commentService.getAllCommentsByPostId(id);
    }

    @PostMapping
    public void addComment(@RequestBody CommentRequest req) {
        commentService.addComment(req);
    }

    @DeleteMapping("{id}")
    public void deleteComment(@PathVariable Long id) {
        commentService.deleteComment(id);
    }

}
