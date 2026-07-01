package lovable.example.lovable.Clone.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.CreationTimestamp;

import java.time.Instant;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="chat_messages")
public class ChatMessages {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    Long id;
    @OneToOne
    Project project;
    @OneToOne
    User user;

    String role;
    @CreationTimestamp
    Instant createdAt;
}
