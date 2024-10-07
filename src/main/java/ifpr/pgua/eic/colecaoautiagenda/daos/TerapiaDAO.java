package ifpr.pgua.eic.colecaoautiagenda.daos;

import com.github.hugoperlin.results.Resultado;

import ifpr.pgua.eic.colecaoautiagenda.models.Terapia;

public interface TerapiaDAO {
    Resultado criar(Terapia terapia);
    Resultado listar();
  //  Resultado editar(int id, Terapia novo);
  //  Resultado deletar(int id);
}
