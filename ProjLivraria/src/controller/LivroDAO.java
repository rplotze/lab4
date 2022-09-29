package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Livro;

public class LivroDAO {

    private Connection con;
    private PreparedStatement cmd;

    public LivroDAO() {
        this.con = Conexao.conectar();
    }

    public int inserir(Livro livro) {
        try {
            String SQL = "insert into tb_livro (id_editora,titulo,autor,ano,preco,quantidade) values (?,?,?,?,?,?)";

            cmd = con.prepareStatement(
                    SQL,
                    Statement.RETURN_GENERATED_KEYS
            );
            //definir o valor do parâmetro
            cmd.setInt(1, livro.getId_editora());
            cmd.setString(2, livro.getTitulo());
            cmd.setString(3, livro.getAutor());
            cmd.setInt(4, livro.getAno());
            cmd.setDouble(5, livro.getPreco());
            cmd.setDouble(6, livro.getQuantidade());

            //executar a operação
            if (cmd.executeUpdate() > 0) {
                //operação realizada com sucesso!
                ResultSet rs = cmd.getGeneratedKeys();
                return rs.next() ? rs.getInt(1) : -1;
            } else {
                //não foi possível realizar a operação
                return -1;
            }

        } catch (Exception e) {
            System.err.println("ERRO: " + e.getMessage());
            return -1;
        } finally {
            Conexao.desconectar(con);
        }
    }
    
    
    public int atualizar(Livro livro){
        try {
            String SQL = "update tb_livro set titulo=?, autor=?, id_editora=?, ano=?, preco=?, quantidade=? where id=?";
            
            cmd = con.prepareStatement(SQL);
            cmd.setString(1, livro.getTitulo());
            cmd.setString(2, livro.getAutor());
            cmd.setInt(3, livro.getId_editora());
            cmd.setInt(4, livro.getAno());
            cmd.setDouble(5, livro.getPreco());
            cmd.setDouble(6, livro.getQuantidade());
            cmd.setInt(7, livro.getId());
            
            if (cmd.executeUpdate() > 0){
                //Tudo certo com a atualização
                return livro.getId();
            }else{
                //Ocorreu um erro ao atualizar;
                return -1;
            }
        } catch (Exception e) {
            System.err.println("ERRO: " + e.getMessage());
            return -1;
        }finally{
            Conexao.desconectar(con);
        }
    }    

    public List<Livro> listarPorId() {
        try {
            String SQL = "select * from tb_livro order by id";
            cmd = con.prepareStatement(SQL);
            ResultSet rs = cmd.executeQuery();
            List<Livro> lista = new ArrayList<>();
            while (rs.next()) {
                Livro e = new Livro(
                    rs.getInt("id"),
                    rs.getInt("id_editora"),
                    rs.getString("titulo"),
                    rs.getString("autor"),
                    rs.getInt("ano"),
                    rs.getDouble("preco"),
                    rs.getInt("quantidade")
                );
                lista.add(e);
            }
            return lista;
        } catch (Exception e) {
            System.err.println("ERRO: " + e.getMessage());
            return null;
        } finally {
            Conexao.desconectar(con);
        }
    }
    

    public List<Livro> listarPorTitulo() {
        try {
            String SQL = "select * from tb_livro order by titulo";
            cmd = con.prepareStatement(SQL);
            ResultSet rs = cmd.executeQuery();
            List<Livro> lista = new ArrayList<>();
            while (rs.next()) {
                Livro e = new Livro(
                    rs.getInt("id"),
                    rs.getInt("id_editora"),
                    rs.getString("titulo"),
                    rs.getString("autor"),
                    rs.getInt("ano"),
                    rs.getDouble("preco"),
                    rs.getInt("quantidade")
                );
                lista.add(e);
            }
            return lista;
        } catch (Exception e) {
            System.err.println("ERRO: " + e.getMessage());
            return null;
        } finally {
            Conexao.desconectar(con);
        }
    }
    
    public Livro pesquisarPorId(int id){
        try {
            String SQL = "select * from tb_livro where id=?";
            cmd = con.prepareStatement(SQL);
            cmd.setInt(1, id);
            
            //executar a consulta
            ResultSet rs = cmd.executeQuery();
            if (rs.next()){
                Livro e = new Livro(
                    rs.getInt("id"),
                    rs.getInt("id_editora"),
                    rs.getString("titulo"),
                    rs.getString("autor"),
                    rs.getInt("ano"),
                    rs.getDouble("preco"),
                    rs.getInt("quantidade")
                );
                return e;
            }else{
                return null;
            }
        } catch (Exception e) {
            System.err.println("ERRO: " + e.getMessage());
            return null;
        }finally{
            Conexao.desconectar(con);
        }
    }
    
    public List<Livro> pesquisarPorTitulo(String titulo){
        try {
            String SQL = "select * from tb_livro where titulo ilike ?";
            cmd = con.prepareStatement(SQL);
            cmd.setString(1, "%" + titulo + "%");
            ResultSet rs = cmd.executeQuery();
            List<Livro> lista = new ArrayList<>();
            while(rs.next()){
                Livro e = new Livro(
                    rs.getInt("id"),
                    rs.getInt("id_editora"),
                    rs.getString("titulo"),
                    rs.getString("autor"),
                    rs.getInt("ano"),
                    rs.getDouble("preco"),
                    rs.getInt("quantidade")
                );
                lista.add(e);
            }
            return lista;
        } catch (Exception e) {
            System.err.println("ERRO: " + e.getMessage());
            return null;
        }finally{
            Conexao.desconectar(con);
        }
    }    

    
}
