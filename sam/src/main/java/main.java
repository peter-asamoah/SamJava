import uni.*;

import java.util.ArrayList;
import java.util.List;

public class main {

    public static void main(String[] args){
        Student kwame = new Student("kwame",10233, Level.First);
        Student kwaku = new Student("kwaku",10263, Level.Second);
        Student kofi = new Student("kofi",10325, Level.First);
        Student ama = new Student("ama",10285, Level.Third);
        Student abena = new Student("abena",18525, Level.First);
        Student kwasi = new Student("kwasi",10215, Level.Fourth);
        Student kojo = new Student("kojo ",15866, Level.Second);
        Student adwoa = new Student("adwoa ",18265, Level.Third);
        Student akosua = new Student("akosua",15865, Level.Fourth);
        Student akua = new Student("akua",18995, Level.Second);
        Student afia = new Student("afia",10135, Level.Third);
        Student kobena = new Student("kobena ",10995, Level.Fourth);

        Lecturer Sam = new Lecturer("Mr. Sam", lecture.Programming);
        Lecturer Peter = new Lecturer("Mr. Peter", lecture.Gardening);
        Lecturer Turkson = new Lecturer( "Mr. Turkson", lecture.Physics);

        List<Student> progstudents = new ArrayList<>();
        Course IntroToProg = new Course( Sam, progstudents, Level.First);
        progstudents.add(kwame);
        progstudents.add(kofi);
        progstudents.add(abena);

        List<Student> gstudents = new ArrayList<>();
        Course AdvGardening = new Course(Peter, gstudents, Level.Fourth);
        gstudents.add(ama);
        gstudents.add(kwasi);
        gstudents.add(adwoa);
        gstudents.add(akosua);
        gstudents.add(afia);
        gstudents.add(kobena);

        List<Student> pstudents = new ArrayList<>();
        Course Physics = new Course(Turkson, pstudents, Level.Fourth);
        pstudents.add(akosua);


        System.out.println(IntroToProg.getClasslist());

    }


}
