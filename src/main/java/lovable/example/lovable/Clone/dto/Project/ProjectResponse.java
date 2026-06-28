package lovable.example.lovable.Clone.dto.Project;

import lovable.example.lovable.Clone.dto.user.UserProfileResponse;

import java.time.Instant;

public record ProjectResponse(
        String name,
        Instant createdAt,
        Instant updatedAt,
        UserProfileResponse owner
) {
}
