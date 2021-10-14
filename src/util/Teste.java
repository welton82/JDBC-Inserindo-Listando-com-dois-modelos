package util;

import exception.Exception;
import model.dao.DSeller;
import model.entity.ESeller;

import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);
        java.sql.Date data;
        Date mydate;
        java.util.Date da;
        System.out.print("Digite o Vendedor: ");
        String name = sc.nextLine();
        System.out.println("Email: ");
        String email = sc.nextLine();
        System.out.print("Digite data de Nascimento: ");
        String dat = sc.next();

        System.out.print("Informe o salario: ");
        Double salary = sc.nextDouble();
        sc.nextLine();
        System.out.print("Departamento Filiado: ");
        Integer id = sc.nextInt();

        ESeller seller = new ESeller(name, email,dat, salary,id );


        DSeller dSeller = new DSeller();
        dSeller.inserir(seller);



    }
}
