package lovable.example.lovable.Clone.dto.subscription;

public record UsageTodayResponse(
        Long tokensUsed,
        Long tokensLimit,
        Long previewsRunning,
        Long previewsLimit
) {
}
