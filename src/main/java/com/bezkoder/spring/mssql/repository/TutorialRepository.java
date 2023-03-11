package com.bezkoder.spring.mssql.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import com.bezkoder.spring.mssql.model.Tutorial;

public interface TutorialRepository extends CrudRepository<Tutorial, Long> {
  List<Tutorial> findByPublished(boolean published);
  List<Tutorial> findByTitleContaining(String title);
}
