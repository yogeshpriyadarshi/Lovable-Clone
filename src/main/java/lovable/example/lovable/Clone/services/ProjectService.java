package lovable.example.lovable.Clone.services;

import lovable.example.lovable.Clone.dto.Project.ProjectRequest;
import lovable.example.lovable.Clone.dto.Project.ProjectResponse;
import lovable.example.lovable.Clone.dto.Project.ProjectSummaryResponse;

import java.util.List;

public interface ProjectService {
     ProjectResponse createProject(ProjectRequest projectRequest, Long userId);
     List<ProjectSummaryResponse> getAllProject(Long userId);
     ProjectResponse getProjectById(Long id);

}
