package com.codestates.connectInstructor.student.service;

import com.codestates.connectInstructor.event.SignupEvent;
import com.codestates.connectInstructor.exception.BusinessLogicException;
import com.codestates.connectInstructor.exception.ExceptionCode;
import com.codestates.connectInstructor.student.entity.Student;
import com.codestates.connectInstructor.student.repository.StudentRepository;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional
public class StudentService {
    private final StudentRepository repository;
    private final ApplicationEventPublisher applicationEventPublisher;

    public StudentService(StudentRepository repository, ApplicationEventPublisher applicationEventPublisher) {
        this.repository = repository;
        this.applicationEventPublisher = applicationEventPublisher;
    }

    public Student createStudent(Student student) {
        verifyEmail(student.getEmail());

        if (!student.isOauth()) {
            //TODO 시큐리티 구현 후, password 암호화하기
        }

        Student saved = repository.save(student);

        applicationEventPublisher.publishEvent(new SignupEvent(saved.getEmail(), saved.getName()));

        return saved;
    }

    public void verifyEmail(String email) {
        Optional<Student> optionalStudent = repository.findByEmail(email);

        if (optionalStudent.isPresent()) throw new BusinessLogicException(ExceptionCode.USED_EMAIL);
    }
}
