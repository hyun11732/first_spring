package hello.core.member;

public interface MemberRepository {
    void saves(Member member);
    Member findById(Long memberId);
}
