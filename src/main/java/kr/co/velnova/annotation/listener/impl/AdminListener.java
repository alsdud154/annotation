package kr.co.velnova.annotation.listener.impl;

import kr.co.velnova.annotation.annotation.CustomAnnotation;
import kr.co.velnova.annotation.listener.AnnotationListener;
import kr.co.velnova.annotation.model.Person;
import org.springframework.stereotype.Component;

@Component
@CustomAnnotation(type = "admin")
public class AdminListener implements AnnotationListener {
    @Override
    public void save(Person person) {
        System.out.println("=======================admin 테이블에 저장=======================");
    }
}
