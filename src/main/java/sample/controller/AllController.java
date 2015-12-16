package sample.controller;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class AllController implements Initializable {
    @FXML Button etudiant;
    @FXML Button prof;
    @FXML Button module;

    public void initialize(URL location, ResourceBundle resources) {
        /*((Stage) ((Node) obj).getScene().getWindow()).close();
        Stage studentStage = new Stage();
        Parent root = null;*/
    }

    @FXML
    public void prof(ActionEvent event){
        Button x = ((Button) event.getSource());
        Stage profStage = new Stage();
        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource("../view/prof.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }
        profStage.setScene(new Scene(root));
        profStage.show();
        ((Stage) ((Node) event.getSource()).getScene().getWindow()).close();
    }

    @FXML
    public void etudiant(ActionEvent event){
        Button x = ((Button) event.getSource());
        Stage profStage = new Stage();
        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource("../view/student.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }
        profStage.setScene(new Scene(root));
        profStage.show();
        ((Stage) ((Node) event.getSource()).getScene().getWindow()).close();
    }

    @FXML
    public void module(ActionEvent event){
        Button x = ((Button) event.getSource());
        Stage profStage = new Stage();
        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource("../view/module.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }
        profStage.setScene(new Scene(root));
        profStage.show();
        ((Stage) ((Node) event.getSource()).getScene().getWindow()).close();
    }

}
