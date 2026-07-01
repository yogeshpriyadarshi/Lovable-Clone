package lovable.example.lovable.Clone.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.apache.logging.log4j.CloseableThreadContext;

import java.time.Instant;

@Getter
@Setter
@FieldDefaults(level= AccessLevel.PRIVATE)
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "subscription")
public class Subscription {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @OneToOne
    User user;
    @OneToOne
    Plan plan;
    String stripeSubscriptionId;
    String status;

    Instant currentPeriodStart;
    Instant currentPeriodEnd;
    Instant cancelAtPeriodEnd;


    Instant createdAt;
    Instant deletedAt;
    Instant updatedAt;
}
