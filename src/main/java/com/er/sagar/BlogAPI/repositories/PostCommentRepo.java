package com.er.sagar.BlogAPI.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.er.sagar.BlogAPI.DTO.PostCommentsDto;
import com.er.sagar.BlogAPI.entities.Post;
import com.er.sagar.BlogAPI.entities.PostComments;

@Repository
public interface PostCommentRepo extends JpaRepository<PostComments, Long> {

    List<PostCommentsDto> findPostCommentsByPost(Post post);

}
