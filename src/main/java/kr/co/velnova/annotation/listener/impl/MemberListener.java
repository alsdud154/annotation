package kr.co.velnova.annotation.listener.impl;

import kr.co.velnova.annotation.annotation.CustomAnnotation;
import kr.co.velnova.annotation.listener.AnnotationListener;
import kr.co.velnova.annotation.model.Person;
import org.springframework.stereotype.Component;

@Component
@CustomAnnotation(type = "member")
public class MemberListener implements AnnotationListener {
    @Override
    public void save(Person person) {
        System.out.println("=======================member 테이블에 저장=======================");
    }
}
