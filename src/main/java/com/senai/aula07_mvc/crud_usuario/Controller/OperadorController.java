package com.senai.aula07_mvc.crud_usuario.Controller;

import com.senai.aula07_mvc.crud_usuario.Model.Operador;
import com.senai.aula07_mvc.crud_usuario.Model.OperadorDAO;

import java.util.List;

public class OperadorController {
    private OperadorDAO operadorDAO = new OperadorDAO();

    public List<Operador>listarOperadores(){

        return operadorDAO.listar();
    }
    public boolean cadastrarOperador(Operador operador){
        if (operador!=null){
            operadorDAO.salvar(operador);
            return true;
        }
        return false;
    }
    public boolean atualizarOperador(Operador operador){
        if (operador!=null){
            operadorDAO.atualizar(operador);
            return true;
        }
        return false;
    }
    public boolean deletarOperador(int id){
        if (id>=0){
            operadorDAO.deletar(id);
            return true;
        }
        return false;
    }
}
