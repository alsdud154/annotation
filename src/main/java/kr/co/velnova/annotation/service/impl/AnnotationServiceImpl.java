package kr.co.velnova.annotation.service.impl;

import kr.co.velnova.annotation.annotation.CustomAnnotation;
import kr.co.velnova.annotation.listener.AnnotationListener;
import kr.co.velnova.annotation.model.Person;
import kr.co.velnova.annotation.service.AnnotationService;
import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import java.util.Map;

@RequiredArgsConstructor
@Service
public class AnnotationServiceImpl implements AnnotationService {

    private final ApplicationContext applicationContext;

    @Override
    public void annotation(Person person) {

        Map<String, Object> beansWithAnnotation = applicationContext.getBeansWithAnnotation(CustomAnnotation.class);

        AnnotationListener annotationListener = (AnnotationListener) beansWithAnnotation.values().stream()
                .filter(object -> object.getClass().getDeclaredAnnotation(CustomAnnotation.class).type().equals(person.getType()))
                .findAny()
                .orElse(null);

        if (annotationListener != null) {
            annotationListener.save(person);
        }

    }
}
