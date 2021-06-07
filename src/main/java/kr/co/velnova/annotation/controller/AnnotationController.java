package kr.co.velnova.annotation.controller;

import kr.co.velnova.annotation.model.Person;
import kr.co.velnova.annotation.service.AnnotationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class AnnotationController {

    private final AnnotationService annotationService;

    @PostMapping("/annotation")
    public Person annotation(@RequestBody Person person){

        System.out.println("person = " + person);
        annotationService.annotation(person);

        return person;
    }
}
