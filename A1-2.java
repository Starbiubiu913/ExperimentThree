import java.util.ArrayList;
import java.util.List;

class College {
    private List<Course> courses;
    private Building building;

    public College(Building building) {
        this.courses = new ArrayList<>();
        this.building = building;
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    // other methods, getters and setters
}

class Building {
    private String name;

    public Building(String name) {
        this.name = name;
    }

    // getters and setters
}

class Course {
    private Building building;

    public Course(Building building) {
        this.building = building;
    }

    // getters and setters
}

public class Main {
    public static void main(String[] args) {
        Building building = new Building("Main Building");

        College college = new College(building);

        Course course1 = new Course(building);
        Course course2 = new Course(building);

        college.addCourse(course1);
        college.addCourse(course2);

        // Accessing the building from a course
        System.out.println(course1.getBuilding().getName()); // Output: Main Building
    }
}
