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
@Table(name = "preview")
public class Preview {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @OneToOne
    Project project;
    String namespace;
    String podName;
    String previewUrl;
    String status;
    Instant startedAt;
    Instant terminatedAt;
    @CreationTimestamp
    Instant CreatedAt;
}
