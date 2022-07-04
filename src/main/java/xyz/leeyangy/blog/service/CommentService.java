package xyz.leeyangy.blog.service;

import xyz.leeyangy.blog.domain.Comment;

import java.util.List;

public interface CommentService {

    List<Comment> listCommentByBlogId(Long blogId);

    Comment saveComment(Comment comment);
}
