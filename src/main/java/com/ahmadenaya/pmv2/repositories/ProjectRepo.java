package com.ahmadenaya.pmv2.repositories;

import com.ahmadenaya.pmv2.domain.Project;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepo extends CrudRepository<Project, Long> {

   Project findByProjectId(String projectId);

//   @Override
//   Iterable<Project> findAll();
}
