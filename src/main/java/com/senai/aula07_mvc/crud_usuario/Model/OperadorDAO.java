package com.senai.aula07_mvc.crud_usuario.Model;

import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.ArrayList;

public class OperadorDAO{
private final String FILE_PATH = "operadores.json";
private final Gson gson= new GsonBuilder().setPrettyPrinting().create();

private List<Operador> carregar() {
    try (FileReader reader = new FileReader(FILE_PATH)) {
        Type listType = new TypeToken<ArrayList<Operador>>()
    }
}
}
