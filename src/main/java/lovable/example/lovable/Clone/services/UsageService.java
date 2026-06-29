package lovable.example.lovable.Clone.services;

import lovable.example.lovable.Clone.dto.subscription.PlanLimitResponse;
import lovable.example.lovable.Clone.dto.subscription.UsageTodayResponse;

public interface UsageService {
    UsageTodayResponse getTodayLimit(Long userId);
    PlanLimitResponse getPlanLimit(Long userId);
}
