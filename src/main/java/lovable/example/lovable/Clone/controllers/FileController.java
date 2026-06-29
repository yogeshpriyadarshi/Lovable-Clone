package lovable.example.lovable.Clone.controllers;

import lombok.RequiredArgsConstructor;
import lovable.example.lovable.Clone.dto.file.FileContentResponse;
import lovable.example.lovable.Clone.dto.file.FileNode;
import lovable.example.lovable.Clone.services.FileService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/projects/{projectId}/files")
@RequiredArgsConstructor
public class FileController {
    private final FileService fileService;

    @GetMapping
    public ResponseEntity<List<FileNode>>  getFileTree(
            @PathVariable Long projectId
    ){
        Long userId = 1L;
        return ResponseEntity.ok(fileService.getPath(projectId,userId));
    }
    @GetMapping("/{*path}")
    public ResponseEntity<FileContentResponse> getProjectContent(
            @PathVariable Long projectId,
            @PathVariable String path
    ){
        Long userId = 1L;
        return ResponseEntity.ok(fileService.getContent(projectId,userId,path));

    }


}
