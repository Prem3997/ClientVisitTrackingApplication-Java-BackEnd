package com.service;

import java.util.List;

import com.model.Project;

public interface ProjectService {
	public boolean addProject(Project project);

	public Project getProject(String projectId);

	public boolean isProjectExists(String projectId);

	public boolean deleteProject(String projectId);

	public boolean updateProject(Project project);

	public List<Project> getProjects();
}
