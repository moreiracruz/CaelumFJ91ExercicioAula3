package br.com.caelum.course;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.caelum.course.model.Course;

@Repository
public interface CourseRepository extends CrudRepository<Course, UUID> {

}
