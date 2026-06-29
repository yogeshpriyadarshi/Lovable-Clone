package lovable.example.lovable.Clone.services;

import lovable.example.lovable.Clone.dto.file.FileContentResponse;
import lovable.example.lovable.Clone.dto.file.FileNode;

import java.util.List;

public interface FileService {

    List<FileNode> getPath(Long projectId, Long userId);

    FileContentResponse getContent(Long projectId, Long userId, String path);
}
