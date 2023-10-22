public class School {
    private String name;
    private List<Department> departments;
    
    // constructors, getters and setters
}

public class Department {
    private String name;
    private List<Instructor> instructors;
    private List<Subject> subjects;
    
    // constructors, getters and setters
}

public class Instructor {
    private String name;
    private Department department;
    private List<Subject> courses;
    
    // constructors, getters and setters
}

public class Subject {
    private String title;
    private Department department;
    private List<Instructor> instructors;
    
    // constructors, getters and setters
}

public class Student {
    private String name;
    private List<Course> courses;
    
    // constructors, getters and setters
}

public class Course {
    private String title;
    private Student student;
    
    // constructors, getters and setters
}
