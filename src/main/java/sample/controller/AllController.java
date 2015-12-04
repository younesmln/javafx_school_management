package sample.controller;

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

public class AllController implements Initializable,  EventHandler<MouseEvent>{
    @FXML Button etudiant;
    @FXML Button prof;
    @FXML Button module;

    public void initialize(URL location, ResourceBundle resources) {
        /*((Stage) ((Node) obj).getScene().getWindow()).close();
        Stage studentStage = new Stage();
        Parent root = null;*/
        etudiant.setOnMouseClicked(this);
    }

    @Override
    public void handle(MouseEvent event) {
        Button x = ((Button) event.getSource());
        switch (x.getId()){
            case "etudiant":
                Stage studentStage = new Stage();
                Parent root = null;
                try {
                    root = FXMLLoader.load(getClass().getResource("../view/student.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                    return;
                }
                studentStage.setScene(new Scene(root));
                studentStage.show();
                ((Stage) ((Node) event.getSource()).getScene().getWindow()).close();
                break;
            case "prof":
                System.out.println("profffff");
                break;
        }
    }

}
