package hello.helloWorld.repository;

import hello.helloWorld.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepsitory {
    Member save(Member member);
    Optional<Member> findById(Long id);
    Optional<Member> findByName(String name);
    List<Member> findAll();
}
