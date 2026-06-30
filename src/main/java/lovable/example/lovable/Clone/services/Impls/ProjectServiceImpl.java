package lovable.example.lovable.Clone.services.Impls;

import lovable.example.lovable.Clone.dto.Project.ProjectRequest;
import lovable.example.lovable.Clone.dto.Project.ProjectResponse;
import lovable.example.lovable.Clone.dto.Project.ProjectSummaryResponse;
import lovable.example.lovable.Clone.services.ProjectService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProjectServiceImpl implements ProjectService {
    @Override
    public ProjectResponse createProject(ProjectRequest projectRequest, Long userId) {
        return null;
    }

    @Override
    public List<ProjectSummaryResponse> getAllProject(Long userId) {
        return List.of();
    }

    @Override
    public ProjectResponse getProjectById(Long id) {
        return null;
    }
}
