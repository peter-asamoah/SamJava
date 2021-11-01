package uni;

public class Student {
    public String name;
    public int studentID;
    public Level level;


    public Student(String name, int studentID, Level level) {
        this.name = name;
        this.studentID = studentID;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public Level getLevel() {
        return level;
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", studentID=" + studentID +
                ", level=" + level +
                '}';
    }
}

