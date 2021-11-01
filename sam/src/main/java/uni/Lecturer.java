package uni;

public class Lecturer {
    public String name;
    public lecture lecture;

    public Lecturer(String name, lecture lecture) {
        this.name = name;
        this.lecture = lecture;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public lecture getLecture() {
        return lecture;
    }



    @Override
    public String toString() {
        return "Lecturer{" +
                "name='" + name + '\'' +
                ", lecture='" + lecture + '\'' +
                '}';
    }
}

