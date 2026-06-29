package lovable.example.lovable.Clone.dto.file;

import java.time.Instant;

public record FileNode(
        String path,
        Long size,
        Instant modifiedAt,
        String type
) {
}
