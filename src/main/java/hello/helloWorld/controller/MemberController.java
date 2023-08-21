package hello.helloWorld.controller;

import hello.helloWorld.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MemberController {
    // 여러 서비스들이 멤버 서비스를 사용할 것임
    // 하나만 생성해서 공용으로 사용하면 됨 (스프링 컨테이너에 등록)
    private final MemberService memberService;

    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }
}
