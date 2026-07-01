package lovable.example.lovable.Clone.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.Instant;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "chat_session")
public class ChatSession {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @OneToOne
    Project project;
    @OneToOne
    User user;
    @Column(nullable = false)
    String title;
    @CreationTimestamp
    Instant createdAt;
    @UpdateTimestamp
    Instant updatedAt;
    Instant deletedAt;
}
