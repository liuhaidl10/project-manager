package com.github.mkopylec.projectmanager.project.dto;

import com.github.mkopylec.projectmanager.domain.values.Status;

import java.util.List;

public class ExistingProject {

    private String identifier;
    private String name;
    private Status status;
    private String team;
    private List<ProjectFeature> features;

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public List<ProjectFeature> getFeatures() {
        return features;
    }

    public void setFeatures(List<ProjectFeature> features) {
        this.features = features;
    }
}
