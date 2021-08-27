package controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import model.SoccerPlayer;

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

    private ObservableList<SoccerPlayer> onPitchPlayers = FXCollections.observableArrayList();
    private ObservableList<SoccerPlayer> onBenchPlayers = FXCollections.observableArrayList();

    public void onAddB(ActionEvent actionEvent) {
        System.out.println("On add clicked");

        SoccerPlayer SP = (SoccerPlayer) onPitch.getSelectionModel().getSelectedItem();

        if (SP == null)
            return;

            onPitchPlayers.remove(SP);
            onBenchPlayers.add(SP);
        }


        public void onRemoveB(ActionEvent actionEvent) {
            System.out.println("On remove clicked");

        SoccerPlayer SP = (SoccerPlayer) onBench.getSelectionModel().getSelectedItem();

        if (SP == null)
            return;

            onBenchPlayers.remove(SP);
            onPitchPlayers.add(SP);
        }

@Override
public void initialize(URL url, ResourceBundle resourceBundle) {

 onPitch.setItems(onPitchPlayers);
 onBench.setItems(onBenchPlayers);

    onpitchName.setCellValueFactory(new PropertyValueFactory<>("name"));
    onpitchTeam.setCellValueFactory(new PropertyValueFactory<>("team"));
    onpitchNum.setCellValueFactory(new PropertyValueFactory<>("jersey"));
    onpitchPos.setCellValueFactory(new PropertyValueFactory<>("position"));

    onbenchName.setCellValueFactory(new PropertyValueFactory<>("name"));
    onbenchTeam.setCellValueFactory(new PropertyValueFactory<>("team"));
    onbenchNum.setCellValueFactory(new PropertyValueFactory<>("jersey"));
    onbenchPos.setCellValueFactory(new PropertyValueFactory<>("position"));

    onPitchPlayers.add(new SoccerPlayer("Pedro Gallese", "Orlando City SC", 1, "goalkeeper"));
    onPitchPlayers.add(new SoccerPlayer("Julian Arujo", "LA Galaxy", 2, "defender"));
    onPitchPlayers.add(new SoccerPlayer("George Bello", "Atlanta United FC", 3, "defender"));
    onPitchPlayers.add(new SoccerPlayer("Cristian Roldan", "Seattle Sounders", 23, "midfielder"));
    onPitchPlayers.add(new SoccerPlayer("Nouhou", "Seattle Sounders", 5, "defender"));
    onPitchPlayers.add(new SoccerPlayer("João Paulo", "Seattle Sounders", 6, "midfielder"));
    onPitchPlayers.add(new SoccerPlayer("Alex Roldan", "Seattle Sounders", 13, "defender"));
    onPitchPlayers.add(new SoccerPlayer("Raúl Ruidaz", "Seattle Sounders", 9, "forward"));
    onPitchPlayers.add(new SoccerPlayer("Yeimar Gómez", "Seattle Sounders", 28, "defender"));
    onPitchPlayers.add(new SoccerPlayer("Nani", "Orlando City SC", 17, "forward"));
    onPitchPlayers.add(new SoccerPlayer("Sebastian Lletget", "LA Galaxy", 18, "midfielder"));
    onPitchPlayers.add(new SoccerPlayer("Rodolfo Pizarro", "Inner Miami CF", 15, "midfielder"));
    onPitchPlayers.add(new SoccerPlayer("Miles Robinson", "Atlanta United FC", 12, "defender"));
    onPitchPlayers.add(new SoccerPlayer("Gustavo Bou", "New England Revolution", 7, "forward"));
    onPitchPlayers.add(new SoccerPlayer("Damir Kreilach", "Real Salt Lake", 8, "midfielder"));
    onPitchPlayers.add(new SoccerPlayer("Lucas Zelerayán", "Columbus Crew", 11, "midfielder"));
    onPitchPlayers.add(new SoccerPlayer("James Sands", "New York City FC", 16, "defender"));
    onPitchPlayers.add(new SoccerPlayer("Dániel Sallói", "Sporting Kansas City", 19, "forward"));
    onPitchPlayers.add(new SoccerPlayer("Edward Atuesta", "Los Angeles FC", 20, "midfielder"));
    onPitchPlayers.add(new SoccerPlayer("Diego Rossi", "Los Angeles FC", 21, "forward"));
    onPitchPlayers.add(new SoccerPlayer("Jesús David Murillo", "Los Angeles FC", 94, "defender"));
    onPitchPlayers.add(new SoccerPlayer("Ricardo Pepi", "FC Dallas", 24, "forward"));
    onPitchPlayers.add(new SoccerPlayer("Walker Zimmerman", "Nashville SC", 25, "defender"));
    onPitchPlayers.add(new SoccerPlayer("Andre Blake", "Philadelphia Union", 26, "goalkeeper"));
    onPitchPlayers.add(new SoccerPlayer("Kai Wagner", "Philadelphia Union", 27, "defender"));
    onPitchPlayers.add(new SoccerPlayer("Matt Turner", "New England Revolution", 30, "goalkeeper"));
    onPitchPlayers.add(new SoccerPlayer("Cade Cowell", "San Jose Earthquakes", 44, "forward"));
    }
}

