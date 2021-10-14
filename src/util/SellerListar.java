package util;

import model.dao.DSeller;
import model.entity.ESeller;

import java.util.List;

public class SellerListar {
    public static void main(String[] args) {

        DSeller dSeller = new DSeller();

        //dSeller.listarSeller();

        List<ESeller> lista = dSeller.retornaListaSeller();

        for(ESeller x: lista){
            System.out.println("Id: " + x.getId());
            System.out.println("nome: " + x.getName());
            System.out.println("Salario: " + x.getBaseSalary());
            System.out.println("Nascimento: " + x.getBirthdate());
            System.out.println("Email: "+ x.getBirthdate());
            System.out.println("Id do Departamento:" + x.getDepartment());
            System.out.println("---------------------");
        }


    }
}
