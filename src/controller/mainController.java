package controller;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.net.URL;
import java.util.ResourceBundle;

public class mainController implements Initializable {
    public TableView onPitch;
    public TableColumn onpitchName;
    public TableColumn onpitchTeam;
    public TableColumn onpitchNum;
    public TableColumn onpitchPos;
    public TableView onBench;
    public TableColumn onbenchTeam;
    public TableColumn onbenchPos;
    public TableColumn onbenchNum;
    public TableColumn onbenchName;
    public Button addB;
    public Button removeB;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public void onAddB(ActionEvent actionEvent) {
        System.out.println("On add clicked");
    }

    public void onRemoveB(ActionEvent actionEvent) {
        System.out.println("On remove clicked");
    }
}
