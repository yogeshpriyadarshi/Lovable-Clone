package lovable.example.lovable.Clone.entities;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.time.Instant;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class User {
    Long id;
    String name;
    String password;
    String email;
    String AvatarUrl;
    Instant createdAt;
    Instant updatedAt;
    Instant deletedAt;
}
