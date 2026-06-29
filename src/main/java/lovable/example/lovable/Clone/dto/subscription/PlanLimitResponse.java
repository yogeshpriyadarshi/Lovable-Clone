package lovable.example.lovable.Clone.dto.subscription;

public record PlanLimitResponse(
        String planName,
        Long maxTokensPerDay,
        Long maxProjects,
        Boolean unlimitedAi
) {
}
