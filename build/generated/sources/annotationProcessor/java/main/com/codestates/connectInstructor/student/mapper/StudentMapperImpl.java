package com.codestates.connectInstructor.student.mapper;

import com.codestates.connectInstructor.student.dto.StudentDto;
import com.codestates.connectInstructor.student.entity.Student;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-09-01T16:38:34+0900",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.2.1.jar, environment: Java 19.0.2 (Amazon.com Inc.)"
)
@Component
public class StudentMapperImpl implements StudentMapper {

    @Override
    public Student postToStudent(StudentDto.Post request) {
        if ( request == null ) {
            return null;
        }

        Student student = new Student();

        student.setEmail( request.getEmail() );
        student.setPassword( request.getPassword() );
        student.setName( request.getName() );
        student.setIntroduce( request.getIntroduce() );

        return student;
    }
}
