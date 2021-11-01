package uni;

import java.util.List;

public class Course {
    public Lecturer Lecturer;
    List<Student> Classlist;
    public Level Level;


    public Course(Lecturer lecturer, List<Student> classlist, Level level) {
        Lecturer = lecturer;
        Classlist = classlist;
        Level = level;
    }

    public Lecturer getLecturer() {
        return Lecturer;
    }

    public void setLecturer(Lecturer lecturer) {
        Lecturer = lecturer;
    }

    public List<Student> getClasslist() {
        return Classlist;
    }

    public void setClasslist(List<Student> classlist) {
        Classlist = classlist;
    }

    public Level getLevel() {
        return Level;
    }


    @Override
    public String toString() {
        return "Course{" +
                "Lecturer='" + Lecturer + '\'' +
                ", Classlist=" + Classlist +
                ", Level=" + Level +
                '}';
    }
}
