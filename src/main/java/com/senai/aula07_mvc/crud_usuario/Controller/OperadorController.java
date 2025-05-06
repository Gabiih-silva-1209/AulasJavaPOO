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
            OperadorDAO salvar(operador);
            return true;
        }
        return false;
    }
    public boolean atualizrOperador(Operador operador){
        if (operador!=null){
            OperadorDAO.atualizar(operador);
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
