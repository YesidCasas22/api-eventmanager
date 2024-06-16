package org.ymcasas.springboot.apieventmanager.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.ymcasas.springboot.apieventmanager.models.Comment;

public interface CommentRepository extends MongoRepository<Comment, String> {
}
