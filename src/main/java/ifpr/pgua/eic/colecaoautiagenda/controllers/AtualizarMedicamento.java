package ifpr.pgua.eic.colecaoautiagenda.controllers;

import ifpr.pgua.eic.colecaoautiagenda.App;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

public class AtualizarMedicamento {
    
    @FXML
    private DatePicker labelData;

    @FXML
    private TextField labelDetalhes;

    @FXML
    private TextField labelHorario;

    @FXML
    private TextField labelTitulo;

    @FXML
    void botaoAtualizarMedicamento(ActionEvent event) {

    }

    @FXML
    void botaoTirarFoto(ActionEvent event) {

    }

    @FXML
    void voltar(ActionEvent event) {
        App.pushScreen("LISTARMEDICAMENTOS");
    }
}
