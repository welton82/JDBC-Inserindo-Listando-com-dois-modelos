package util;

import model.dao.DDepartment;
import model.entity.EDepartment;

import java.util.ArrayList;
import java.util.List;

public class DepartmentListar {
    public static void main(String[] args) {

        EDepartment ed = new EDepartment();
        DDepartment dd = new DDepartment();

        List<EDepartment> lista = dd.listarDepartment();

        System.out.println("==== LISTANDO POR UMA LISTA AUXILIAR =========");
        for(EDepartment x: lista){
            System.out.println("Id: " + x.getId() + " Nome: " + x.getNome());
            //System.out.println();
        }

    }
}
