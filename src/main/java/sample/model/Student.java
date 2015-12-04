package sample.model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import org.javalite.activejdbc.Model;
import sample.model.tableModel.StudentModel;
import java.util.ArrayList;
import java.util.List;


public class Student extends Model {

    public static void insertModel(StudentModel md){
        Student s = new Student();
        s.set("nom", md.getNom(),"prenom", md.getPrenom(),"level", md.getLevel(), "date_de_naissance",
                md.getDatedeNaissance(), "gender", md.getGender(), "adresse", md.getAdresse()).saveIt();
    }

    public static void updateModel(StudentModel md, int i){
        Student s = Student.findFirst("id = ?", i);
        if (s != null){
            s.set("nom", md.getNom(),"prenom", md.getPrenom(),"level", md.getLevel(), "date_de_naissance",
                    md.getDatedeNaissance(), "gender", md.getGender(), "adresse", md.getAdresse());
            System.out.println(s.saveIt());
        }
    }

    public static void deleteModel(StudentModel md){
        Student s = Student.findFirst("id = ?", md.getId());
        if (s != null){
            s.delete();
        }
    }
    public static ObservableList getAllStudents(String condition){
        ObservableList listData = FXCollections.observableArrayList();
        List<Student> students;
        if (condition == null) students = Student.findAll();
        else students = Student.where("nom like ? or prenom like ?", "%"+condition+"%");
        System.out.println(students.size());
        List<StudentModel> studentModels = new ArrayList<>(students.size());
        for (Student  s : students){
            studentModels.add(convert(s));
        }
        listData.addAll(studentModels);
        return listData;
    }

    public static StudentModel convert(Student s){
        StudentModel sm = new StudentModel().setId(s.get("id").toString())
                .setNom(s.get("nom").toString())
                .setPrenom(s.get("prenom").toString())
                .setDatedeNaissance(s.get("date_de_naissance").toString())
                .setLevel(s.get("level").toString())
                .setGender(s.get("gender").toString())
                .setAdresse(s.get("adresse").toString());
        return sm;
    }

}
