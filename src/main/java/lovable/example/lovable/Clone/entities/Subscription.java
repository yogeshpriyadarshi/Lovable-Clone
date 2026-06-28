package lovable.example.lovable.Clone.entities;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import org.apache.logging.log4j.CloseableThreadContext;

import java.time.Instant;

@Getter
@Setter
@FieldDefaults(level= AccessLevel.PRIVATE)
public class Subscription {
    Long id;
    User user;
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
