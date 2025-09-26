package modelo.serviços;

import model.entities.Crud;

import java.util.ArrayList;
import java.util.List;

public class DepartamentoServicos {

    public List<Crud> findAll() {

        // Lógica para buscar todos os departamentos no banco de dados
        List<Crud> list = new ArrayList<>();
        list.add(new Crud(1, "RH"));
        list.add(new Crud(2, "TI"));
        list.add(new Crud(3, "Marketing"));
        list.add(new Crud(4, "Vendas"));
        list.add(new Crud(5, "MGA"));
        list.add(new Crud(6, "Unipaper"));
        return list;

    }


}
