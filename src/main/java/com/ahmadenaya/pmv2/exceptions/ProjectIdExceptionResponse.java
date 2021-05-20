package com.ahmadenaya.pmv2.exceptions;

public class ProjectIdExceptionResponse {

    private String projectId;

    public ProjectIdExceptionResponse(String projectId) {
        this.projectId = projectId;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }
}
