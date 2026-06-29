package lovable.example.lovable.Clone.controllers;

import lombok.RequiredArgsConstructor;
import lovable.example.lovable.Clone.dto.member.InviteMemberRequest;
import lovable.example.lovable.Clone.dto.member.MemberResponse;
import lovable.example.lovable.Clone.services.ProjectMemberService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/projects/{projectId}/members")
@RequiredArgsConstructor
public class ProjectMemberController {
      private final ProjectMemberService projectMemberService;

      @GetMapping
      public ResponseEntity<List<MemberResponse>> getProjectMemeber(@PathVariable Long projectId){
          Long userId = 1L;
          return ResponseEntity.ok(projectMemberService.getProjectMember(projectId,userId));
      }

      @PostMapping
      public ResponseEntity<MemberResponse> inviteMember(
              @RequestBody InviteMemberRequest inviteMemberRequest,
              @PathVariable Long projectId
              ){
          Long userId = 1L;
          return ResponseEntity.ok(projectMemberService.InviteMember(inviteMemberRequest,projectId,userId));
      }
      @PatchMapping("/{memberId}")
      public ResponseEntity<MemberResponse> updateRole(
              @PathVariable Long projectId,
              @PathVariable Long memberId,
              @RequestBody InviteMemberRequest inviteMemberRequest
      ){
          Long userId = 1L;
          return ResponseEntity.ok(projectMemberService.updateRole(inviteMemberRequest,projectId,memberId,userId));
      }

      @DeleteMapping("/{memberId}")
      public ResponseEntity<MemberResponse> removeMember(
            @PathVariable Long projectId,
            @PathVariable Long memberId
      ){
          Long userId = 1L;
          return ResponseEntity.ok(projectMemberService.removeMember(projectId,memberId,userId));
      }




}
