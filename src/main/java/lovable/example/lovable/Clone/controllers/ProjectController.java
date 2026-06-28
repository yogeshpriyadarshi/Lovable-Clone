package lovable.example.lovable.Clone.controllers;

import lombok.RequiredArgsConstructor;
import lovable.example.lovable.Clone.dto.Project.ProjectRequest;
import lovable.example.lovable.Clone.dto.Project.ProjectResponse;
import lovable.example.lovable.Clone.dto.Project.ProjectSummaryResponse;
import lovable.example.lovable.Clone.services.ProjectService;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/projects")
@RequiredArgsConstructor
public class ProjectController {

    private final ProjectService projectService;

    @PostMapping
    public ResponseEntity<ProjectResponse> createProject(@RequestBody ProjectRequest projectRequest){
        Long userId = 1L; //  userId will come from spring security
        return ResponseEntity.ok(projectService.createProject(projectRequest,userId));
    }

    @GetMapping
    public ResponseEntity<List<ProjectSummaryResponse>> getAllProject(){
        Long userId = 1L; // userId will come from spring security
        return ResponseEntity.ok(projectService.getAllProject(userId));
    }
    @GetMapping("/{id}")
    public ResponseEntity<ProjectResponse> getProjectById(@PathVariable Long id ){
        Long userId = 1L; // userId will come from spring security;
        return ResponseEntity.ok(projectService.getProjectById(id));
    }





}
