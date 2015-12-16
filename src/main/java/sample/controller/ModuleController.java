package sample.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import sample.helper.TableEdit;
import sample.model.Student;
import sample.model.tableModel.StudentModel;

import java.io.IOException;
import java.net.URL;
import java.util.Hashtable;
import java.util.ResourceBundle;

public class ModuleController implements Initializable {

    @FXML ComboBox niveau;
    /*
    @FXML TextField label;
    @FXML TextField coefficient;
    @FXML TextField credit;
    @FXML TextField rechercheText;
    @FXML TableView<StudentModel> modulesTable;
    @FXML TableColumn<StudentModel, String> id_column;
    @FXML TableColumn<StudentModel, String> label_column;
    @FXML TableColumn<StudentModel, String> coefficient_column;
    @FXML TableColumn<StudentModel, String> niveau_column;
    @FXML TableColumn<StudentModel, String> credit_column;

    ObservableList<StudentModel> studentData;
    Hashtable<String,String> formvalues = new Hashtable<>();
    private int toEdit = -1;


    @FXML
    protected void ajouter(ActionEvent e) throws NullPointerException {
        insertFromForm(0);
    }

    @FXML
    protected void supprimer(ActionEvent e){
        int selectedIndex = modulesTable.getSelectionModel().getSelectedIndex();
        if (selectedIndex < 0){
            showAlert("aucun choix", "choisissez un element pour le supprimer");
            return;
        }
        StudentModel m = modulesTable.getItems().get(selectedIndex);
        modulesTable.getItems().remove(selectedIndex);
        Student.deleteModel(m);
        toEdit = -1;
    }

    @FXML
    protected void modifier(ActionEvent e){
        if (toEdit == -1) {
            int selectedIndex = modulesTable.getSelectionModel().getSelectedIndex();
            if (selectedIndex < 0){
                showAlert("aucun choix", "choisissez un element pour le modifier");
                return;
            }
            StudentModel m = modulesTable.getItems().get(selectedIndex);
            toEdit = selectedIndex;
            initForm(m.getNom(), m.getPrenom(), m.getDatedeNaissance(),
                    m.getAdresse(), m.getLevel(), m.getGender());
            System.out.println("put informations .............");
        } else {
            System.out.println("start updating ...............");
            insertFromForm(Integer.parseInt(modulesTable.getItems().get(toEdit).getId()));
            refresh(null);
            toEdit = -1;
        }
    }

    @FXML
    protected void chercher(ActionEvent e){
        String keyword = rechercheText.getText();
        refresh(keyword);

    }
    */
    public void initialize(URL location, ResourceBundle resources) {
        niveau.getItems().addAll("L1", "L2", "L3", "M1", "M2");
    }
    /*
    protected void initTable() {
        modulesTable.setEditable(true);
        id_column.setCellValueFactory(cellData -> cellData.getValue().idProperty());

        nom_column.setCellValueFactory(cellData -> cellData.getValue().nomProperty());

        prenom_column.setCellValueFactory(cellData -> cellData.getValue().prenomProperty());

        date_column.setCellValueFactory(cellData -> cellData.getValue().datedeNaissanceProperty());

        niveau_column.setCellValueFactory(cellData -> cellData.getValue().levelProperty());

        sexe_column.setCellValueFactory(cellData -> cellData.getValue().genderProperty());

        adresse_column.setCellValueFactory(cellData -> cellData.getValue().adresseProperty());
    }
    protected void refresh(String k){
        studentData = FXCollections.observableArrayList();
        if (k == null) studentData = Student.getAllStudents(null);
        else studentData = Student.getAllStudents(k);
        studentsTable.setItems(studentData);
    }

    public boolean validation(){

        for (String key : formvalues.keySet()){
            if (formvalues.get(key).matches("\\s*")) return false;
        }
        return true;
    }

    protected void showAlert(String header, String body){
        Alert alert= new Alert(Alert.AlertType.ERROR);
        alert.setHeaderText(header);
        alert.setContentText(body);
        alert.show();
    }

    public Hashtable getValues(){
        Hashtable<String,String> values = new Hashtable<>();
        values.put("nom", nom.getText());
        values.put("prenom", prenom.getText());
        values.put("date", date.getValue() == null ? " " : date.getValue().toString());
        values.put("adresse", adresse.getText());
        values.put("level", niveau.getValue().toString());
        values.put("sexe", ((RadioButton)sexe.getSelectedToggle()).getText());
        return values;
    }

    private void insertFromForm(int i) {
        formvalues = getValues();
        if (validation()) {
            StudentModel model = new StudentModel()
                    .setNom(formvalues.get("nom"))
                    .setPrenom(formvalues.get("prenom"))
                    .setDatedeNaissanceString(formvalues.get("date"))
                    .setAdresse(formvalues.get("adresse"))
                    .setGender(formvalues.get("sexe"))
                    .setLevel(formvalues.get("level"));
            if (i != 0) Student.updateModel(model, i);
            else Student.insertModel(model);
            refresh(null);
            initForm();
            toEdit = -1;
        } else showAlert("Input Error", "vérifiez les champ svp");
    }

    public void initForm(String...v){
        if (v.length == 0) {
            label.setText("");
            coefficient.setText("");
            credit.setText("");
            niveau.setValue("L1");
        }else{
            label.setText(v[0]);
            coefficient.setText(v[1]);
            credit.setText(v[2]);
            niveau.setValue(v[4]);
        }
    }*/

    @FXML
    void exit(ActionEvent event){
        Stage AllStage = new Stage();
        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource("../view/All.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }
        AllStage.setScene(new Scene(root));
        AllStage.show();
        ((Stage) ((Node) event.getSource()).getScene().getWindow()).close();
    }
}
