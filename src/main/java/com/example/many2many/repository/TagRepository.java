package com.example.many2many.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.many2many.model.Tag;

@Repository
public interface TagRepository extends JpaRepository<Tag, Long> {

}
