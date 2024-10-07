package ifpr.pgua.eic.colecaoautiagenda.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.List;

import com.github.hugoperlin.results.Resultado;

import ifpr.pgua.eic.colecaoautiagenda.App;
import ifpr.pgua.eic.colecaoautiagenda.models.TarefaDiaria;
import ifpr.pgua.eic.colecaoautiagenda.repositories.RepositorioTarefaDiaria;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;

public class ListarTarefasDiarias implements Initializable{
    
    @FXML
    private ListView<TarefaDiaria> listaDeAgendamentos;

    private RepositorioTarefaDiaria repositorioTarefaDiaria;
    
    public ListarTarefasDiarias(RepositorioTarefaDiaria repositorioTarefaDiaria) {
        this.repositorioTarefaDiaria = repositorioTarefaDiaria;
    }

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        listaDeAgendamentos.getItems().clear();

        listaDeAgendamentos.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);

        Resultado resultado = repositorioTarefaDiaria.listarAgendamentosTarefaDiaria();
        if (resultado.foiErro()) {
            Alert alert = new Alert(AlertType.ERROR, resultado.getMsg());
            alert.showAndWait();
        } else {
            List lista = (List) resultado.comoSucesso().getObj();
            listaDeAgendamentos.getItems().addAll(lista);
        }
        
    }

    @FXML
    void concluirAgendamento(ActionEvent event) {

    }

    @FXML
    void deletarAgendamento(ActionEvent event) {

    }

    @FXML
    void editarAgendamento(ActionEvent event) {
        App.pushScreen("ATUALIZARTAREFADIARIA");
    }

    @FXML
    void voltar(ActionEvent event) {
        App.pushScreen("MENUPRINCIPALLISTAR");
    }
}
