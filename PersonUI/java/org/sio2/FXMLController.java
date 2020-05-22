package org.sio2;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.input.KeyEvent;
import org.sio2.model.Person;
import org.sio2.model.SampleData;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;

import java.net.URL;
import java.util.ResourceBundle;

public class FXMLController
{
    @FXML
    private TextField firstnameTextField;
    @FXML
    private TextField lastnameTextField;
    @FXML
    private TextArea notesArea;
    @FXML
    private Button removeButton;
    @FXML
    private Button createButton;
    @FXML
    private Button updateButton;
    @FXML
    private ListView<Person> listView;
    @FXML
    private Person selectedPerson;

    @FXML
    private final ObservableList<Person> personList = FXCollections.observableArrayList(Person.extractor);

    public void initialize(URL url, ResourceBundle resources)
    {
        SampleData.fillSampleData(personList);
        listView.setItems(personList);
    }

    @FXML
    private void createButtonAction(ActionEvent actionEvent)
    {
    }

    @FXML
    private void removeButtonAction(ActionEvent actionEvent)
    {
    }

    @FXML
    private void updateButtonAction(ActionEvent actionEvent)
    {
    }

    @FXML
    private void handleKeyAction(KeyEvent keyEvent)
    {
    }

}
