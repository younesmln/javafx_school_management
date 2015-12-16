package sample.model.tableModel;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 * Created by supernov_a on 02/12/2015.
 */
public class ModuleModel {
    final StringProperty id;
    final StringProperty label;
    final StringProperty coefficient;
    final StringProperty niveau;
    final StringProperty credit;

    public ModuleModel() {
        this.id = new SimpleStringProperty();
        this.label = new SimpleStringProperty();
        this.coefficient = new SimpleStringProperty();
        this.niveau = new SimpleStringProperty();
        this.credit = new SimpleStringProperty();


    }

    public ModuleModel setId(String id) {
        this.id.set(id);
        return this;
    }

    public ModuleModel setLabel(String label) {
        this.label.set(label);
        return this;
    }

    public ModuleModel setCoefficient(String cof) {
        this.coefficient.set(cof);
        return this;
    }

    public ModuleModel setNiveau(String niveau) {
        this.niveau.set(niveau);
        return this;
    }
    public ModuleModel setCredit(String credit) {
        this.credit.set(credit);
        return this;
    }

    public String getId() {
        return id.get();
    }

    public StringProperty idProperty() {
        return id;
    }

    public String getLabel() {
        return label.get();
    }

    public StringProperty labelProperty() {
        return label;
    }

    public String getCoefficient() {
        return coefficient.get();
    }

    public StringProperty coefficientProperty() {
        return coefficient;
    }

    public String getNiveau() {
        return niveau.get();
    }

    public StringProperty niveauProperty() {
        return niveau;
    }

    public String getCredit() {
        return credit.get();
    }

    public StringProperty creditProperty() {
        return credit;
    }


}
