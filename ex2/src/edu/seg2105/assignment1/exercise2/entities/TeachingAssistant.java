package edu.seg2105.assignment1.exercise2.entities;

public class TeachingAssistant extends Instructor {
    private final int max_courses = 3;

    public TeachingAssistant(String firstName, String lastName, String id, double salary) {
        super(firstName, lastName, id, salary);
    }

    @Override
    public boolean assignCourse(Course course) {
        if (courses.size() < max_courses) {
            courses.add(course);
            return true;
        } else {
            return false;
        }
    }
    
}
