package sample.model.tableModel;

import javafx.beans.property.*;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class StudentModel {
    final StringProperty id;
    final StringProperty nom;
    final StringProperty prenom;
    final StringProperty adresse;
    final StringProperty level;
    final StringProperty gender;
    final StringProperty datedeNaissance;

    public StudentModel setId(String id) {
        this.id.set(id);
        return this;
    }

    public StudentModel setNom(String nom) {
        this.nom.set(nom);
        return this;
    }

    public StudentModel setPrenom(String prenom) {
        this.prenom.set(prenom);
        return this;
    }

    public StudentModel setAdresse(String adresse) {
        this.adresse.set(adresse);
        return this;
    }

    public StudentModel setLevel(String level) {
        this.level.set(level);
        return this;
    }

    public StudentModel setGender(String city) {
        this.gender.set(city);
        return this;
    }

    public StudentModel setDatedeNaissance(String birthday) {
        this.datedeNaissance.set(birthday);
        return this;
    }

    public StudentModel setDatedeNaissanceString(String birthday) {
        this.datedeNaissance.set(birthday);
        return this;
    }

    public String getId() {
        return id.get();
    }

    public StringProperty idProperty() {
        return id;
    }

    public String getNom() {
        return nom.get();
    }

    public StringProperty nomProperty() {
        return nom;
    }

    public String getAdresse() {
        return adresse.get();
    }

    public StringProperty adresseProperty() {
        return adresse;
    }

    public String getLevel() {
        return level.get();
    }

    public StringProperty levelProperty() {
        return level;
    }

    public String getGender() {
        return gender.get();
    }

    public StringProperty genderProperty() {
        return gender;
    }

    public String getDatedeNaissance() {
        return datedeNaissance.get();
    }

    public StringProperty datedeNaissanceProperty() {
        return datedeNaissance;
    }

    public String getPrenom() {
        return prenom.get();
    }

    public StringProperty prenomProperty() {
        return prenom;
    }

    public StudentModel() {
        this.id = new SimpleStringProperty();
        this.nom = new SimpleStringProperty();
        this.prenom = new SimpleStringProperty();
        this.adresse = new SimpleStringProperty();
        this.level = new SimpleStringProperty();
        this.gender = new SimpleStringProperty();
        this.datedeNaissance = new SimpleStringProperty();

    }
}
