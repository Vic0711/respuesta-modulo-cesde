package com.cesde.coursemanager.repository;

import com.cesde.coursemanager.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {
    List<Course> findByNameContainingIgnoreCase(String name);
    List<Course> findByPriceBetween(Double minPrice, Double maxPrice);
    List<Course> findByStartDateAfter(LocalDateTime startDateAfter);
}
