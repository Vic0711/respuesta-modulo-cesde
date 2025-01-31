package com.cesde.coursemanager.controller;

import com.cesde.coursemanager.model.Course;
import com.cesde.coursemanager.repository.CourseRepository;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/courses")
public class CourseController {
    private final CourseRepository repository;

    public CourseController(CourseRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Course> getAllCourses(
            @RequestParam(required = false) String name,
            @RequestParam(required = false) Double minPrice,
            @RequestParam(required = false) Double maxPrice,
            @RequestParam(required = false) LocalDateTime startDateAfter) {
        
        if (name != null) {
            return repository.findByNameContainingIgnoreCase(name);
        } else if (minPrice != null && maxPrice != null) {
            return repository.findByPriceBetween(minPrice, maxPrice);
        } else if (startDateAfter != null) {
            return repository.findByStartDateAfter(startDateAfter);
        }
        
        return repository.findAll();
    }

    @PostMapping
    public Course createCourse(@RequestBody Course course) {
        return repository.save(course);
    }

    @DeleteMapping("/{id}")
    public void deleteCourse(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
