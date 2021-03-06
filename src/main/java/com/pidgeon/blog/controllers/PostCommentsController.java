package com.pidgeon.blog.controllers;

import com.pidgeon.blog.models.Comment;
import com.pidgeon.blog.models.Post;
import com.pidgeon.blog.services.CommentService;
import com.pidgeon.blog.services.PostService;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/posts/{postId}/comments")
public class PostCommentsController {
  @Resource
  private CommentService commentService;

  @Resource
  private PostService postService;

  @RequestMapping(value = "", method = RequestMethod.POST)
  public Comment create(@PathVariable Long postId, @RequestBody Comment c) {
    Optional<Post> p = postService.findById(postId);
    c.setPost(p.get());

    Comment savedC = commentService.save(c);

    return savedC;
  }

  @RequestMapping(value = "", method = RequestMethod.GET)
  public List<Comment> comments(@PathVariable Long postId) {
    Optional<Post> p = postService.findById(postId);

    return p.get().getComments();
  }
}
