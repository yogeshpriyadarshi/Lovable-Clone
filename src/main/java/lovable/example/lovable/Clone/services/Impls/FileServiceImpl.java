package lovable.example.lovable.Clone.services.Impls;

import lovable.example.lovable.Clone.dto.file.FileContentResponse;
import lovable.example.lovable.Clone.dto.file.FileNode;
import lovable.example.lovable.Clone.services.FileService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FileServiceImpl implements FileService {
    @Override
    public List<FileNode> getPath(Long projectId, Long userId) {
        return List.of();
    }

    @Override
    public FileContentResponse getContent(Long projectId, Long userId, String path) {
        return null;
    }
}
