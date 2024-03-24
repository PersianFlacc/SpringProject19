package org.example.project19.aspects;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class UniversityLoggingAspect {

    @After("org.example.project19.aspects.MyPointcuts.getStudents()")
    public void afterGetStudentsLoggingAdvice() {
        System.out.println("afterGetStudentsLoggingAdvice: логирование нормального окончания" +
                "работы метода или выброс исключения");
    }
}
