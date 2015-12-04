package sample.controller;

import javafx.beans.binding.BooleanBinding;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import sample.model.User;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML TextField login;
    @FXML TextField password;

    @FXML Button valider;
    @FXML AnchorPane wrapper;

    @FXML
    protected void loginFunction(ActionEvent e) throws IOException {
        login(e.getSource());
    }

    public void initialize(URL location, ResourceBundle resources) {
        BooleanBinding booleanBinding = login.textProperty()
                .isEmpty().or(password.textProperty().isEmpty());
        valider.disableProperty().bind(booleanBinding);
    }

    protected void showAlert(String header, String body){
        Alert alert= new Alert(Alert.AlertType.ERROR);
        alert.setHeaderText(header);
        alert.setContentText(body);
        alert.show();
    }
    @FXML
    public void enterkeyPressed(KeyEvent t) {
        if (t.getCode().equals(KeyCode.ENTER)) login(t.getSource());
    }

    public void login(Object obj){
        User users = User.findFirst("login = ?", login.getText());
        if (users == null){
            showAlert("erreur d'authentification", "Erreur vérifier votre login ou votre mot de passe");
            return;
        }
        else {
            if (users.get("password").equals(password.getText())){
                Stage AllStage = new Stage();
                Parent root = null;
                try {
                    root = FXMLLoader.load(getClass().getResource("../view/All.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                    return;
                }
                System.out.println(root.toString());
                AllStage.setScene(new Scene(root));
                AllStage.show();
                ((Stage) ((Node) obj).getScene().getWindow()).close();
            }
            else {
                showAlert("erreur d'authentification", "Erreur vérifier votre login ou votre mot de passe");
            }
        }
    }
}
