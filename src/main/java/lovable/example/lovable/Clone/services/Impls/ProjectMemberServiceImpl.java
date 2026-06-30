package lovable.example.lovable.Clone.services.Impls;

import lovable.example.lovable.Clone.dto.member.InviteMemberRequest;
import lovable.example.lovable.Clone.dto.member.MemberResponse;
import lovable.example.lovable.Clone.services.ProjectMemberService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProjectMemberServiceImpl implements ProjectMemberService {
    @Override
    public MemberResponse InviteMember(InviteMemberRequest inviteMemberRequest, Long projectId, Long userId) {
        return null;
    }

    @Override
    public List<MemberResponse> getProjectMember(Long projectId, Long UserId) {
        return List.of();
    }

    @Override
    public MemberResponse updateRole(InviteMemberRequest inviteMemberRequest, Long projectId, Long memberId, Long userId) {
        return null;
    }

    @Override
    public MemberResponse removeMember(Long projectId, Long memberId, Long UserId) {
        return null;
    }
}
