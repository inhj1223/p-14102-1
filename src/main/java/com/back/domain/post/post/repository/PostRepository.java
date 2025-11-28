package com.back.domain.post.post.repository;

import com.back.domain.post.post.entity.Post;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;


public interface PostRepository extends JpaRepository<Post, Integer> {

}
