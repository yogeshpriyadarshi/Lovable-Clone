package lovable.example.lovable.Clone.entities;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Plan {
    Integer id;
    String name;
    String stripePriceId;
    Integer maxProject;
    Integer maxTokenPerDay;
    Integer maxPreview;
    Boolean unlimitedAI;
}
