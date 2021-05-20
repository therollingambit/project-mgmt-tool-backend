package com.ahmadenaya.pmv2.services;

import com.ahmadenaya.pmv2.domain.Project;
import com.ahmadenaya.pmv2.repositories.ProjectRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectService {

    @Autowired
    private ProjectRepo projectRepo;

    public Project saveOrUpdateProject(Project project) {
        //logic

        return projectRepo.save(project);
    }
}
