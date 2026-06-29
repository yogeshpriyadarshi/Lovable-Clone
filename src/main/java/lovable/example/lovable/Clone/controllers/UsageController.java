package lovable.example.lovable.Clone.controllers;

import lombok.RequiredArgsConstructor;
import lovable.example.lovable.Clone.dto.subscription.PlanLimitResponse;
import lovable.example.lovable.Clone.dto.subscription.UsageTodayResponse;
import lovable.example.lovable.Clone.services.UsageService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usage")
@RequiredArgsConstructor
public class UsageController {
    private final UsageService usageService;

    @GetMapping("/today")
    public ResponseEntity<UsageTodayResponse> getTodayLimit(){
        Long userId = 1L;
        return ResponseEntity.ok(usageService.getTodayLimit(userId));
    }
    public ResponseEntity<PlanLimitResponse> getPlanLimit(){
        Long userId = 1L;
        return ResponseEntity.ok(usageService.getPlanLimit(userId));
    }
}
