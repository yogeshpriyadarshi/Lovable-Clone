package lovable.example.lovable.Clone.services;

import lovable.example.lovable.Clone.dto.member.InviteMemberRequest;
import lovable.example.lovable.Clone.dto.member.MemberResponse;

import java.util.List;

public interface ProjectMemberService {

    MemberResponse InviteMember(InviteMemberRequest inviteMemberRequest, Long projectId,Long userId);

    List<MemberResponse> getProjectMember(Long projectId, Long UserId);

    MemberResponse updateRole(InviteMemberRequest inviteMemberRequest, Long projectId,Long memberId,Long userId);

    MemberResponse removeMember(Long projectId, Long memberId, Long UserId);
}
