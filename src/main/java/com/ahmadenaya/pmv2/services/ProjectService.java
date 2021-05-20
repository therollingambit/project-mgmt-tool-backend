package com.ahmadenaya.pmv2.services;

import com.ahmadenaya.pmv2.domain.Project;
import com.ahmadenaya.pmv2.exceptions.ProjectIdException;
import com.ahmadenaya.pmv2.repositories.ProjectRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProjectService {

    @Autowired
    private ProjectRepo projectRepo;

    public Project saveOrUpdateProject(Project project) {
        //logic
        try {
            project.setProjectId(project.getProjectId().toUpperCase());
            return projectRepo.save(project);
        }catch (Exception e) {
            throw new ProjectIdException("Project Id " + project.getProjectId().toUpperCase() + " already exists");
        }
    }

    public Project findProjectByIdentifier(String projectId) {
        Project project = projectRepo.findByProjectId(projectId.toUpperCase());

        if(project == null){
            throw new ProjectIdException("Project ID '"+projectId+"' does not exist");
        }

        return project;
    }

    public Iterable<Project> findAllProjects() {
        return projectRepo.findAll();
    }

    public void deleteProjectById(String projectId) {
        Project project = projectRepo.findByProjectId(projectId.toUpperCase());

        if (project == null){
            throw new ProjectIdException("Project with " + projectId + " does not exist.");
        }

        projectRepo.delete(project);
    }
}
