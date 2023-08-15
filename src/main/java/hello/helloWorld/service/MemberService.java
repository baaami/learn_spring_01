package hello.helloWorld.service;

import hello.helloWorld.domain.Member;
import hello.helloWorld.repository.MemoryMemberRepository;

import java.util.List;
import java.util.Optional;

public class MemberService {
    private final MemoryMemberRepository memberRepository = new MemoryMemberRepository();

    public Long join(Member member) {
        // Duplicate Member Check
        validateDuplicateMember(member);
        memberRepository.save(member);
        return member.getId();
    }

    private void validateDuplicateMember(Member member) {
        memberRepository.findByName(member.getName())
                .ifPresent(m -> {
                    throw new IllegalStateException("Already Exist Member");
                });
    }

    /**
     * Find All Members
     */
    public List<Member> findMembers() {
        return memberRepository.findAll();
    }

    public Optional<Member> findOne(Long memberId) {
        return memberRepository.findById(memberId);
    }


}
