package lovable.example.lovable.Clone.entities;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.time.Instant;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ProjectMember {
    Project project;
    User user;
    String role;
    User invitedBy;
    Instant invitedAt;
    Instant acceptedAt;
}
