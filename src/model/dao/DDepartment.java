package model.dao;

import exception.Exception;
import model.entity.EDepartment;
import model.entity.ESeller;
import util.Conexao;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class DDepartment {

    Connection cnn = null;
    PreparedStatement prds = null;
    ResultSet rs = null;
    Statement st = null;

    public DDepartment() {
        cnn = Conexao.getConnection();
    }

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");




    public List<EDepartment> listarDepartment(){
        List<EDepartment> lista = new ArrayList<>();

        try{

            String sql = "SELECT * FROM department;";
            st = cnn.createStatement();
            rs = st.executeQuery(sql);

            System.out.println("===== LISTANDO Direto do Dao    =======");
            while(rs.next()){
                EDepartment department= new EDepartment();
                department.setId(rs.getInt("id"));
                department.setNome(rs.getString("name"));
                lista.add(department);
                //LISTA DIRETO
                System.out.println("ID: " + rs.getInt("id") + " NOME: " + rs.getString("name"));
            }
            System.out.println("=======END LIST =======");


        } catch (SQLException e) {
            throw new Exception(e.getMessage());
        }finally {


            Conexao.closeResultSet(rs);
            Conexao.closeStatement(st);


            Conexao.closeConnection();

        }
        //OU CRIA UMA LISTA QUE RECEBE ESSA FUNÇÃO QUE RETORNA EM 'LISTA'
        return lista;
    }


}
