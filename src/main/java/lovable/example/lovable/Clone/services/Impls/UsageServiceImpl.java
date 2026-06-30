package lovable.example.lovable.Clone.services.Impls;

import lovable.example.lovable.Clone.dto.subscription.PlanLimitResponse;
import lovable.example.lovable.Clone.dto.subscription.UsageTodayResponse;
import lovable.example.lovable.Clone.services.UsageService;
import org.springframework.stereotype.Service;

@Service
public class UsageServiceImpl implements UsageService {
    @Override
    public UsageTodayResponse getTodayLimit(Long userId) {
        return null;
    }

    @Override
    public PlanLimitResponse getPlanLimit(Long userId) {
        return null;
    }
}
