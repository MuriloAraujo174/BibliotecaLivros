package dao;

import beans.PacoteCadastroFuncionarios;
import conection.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class CadastroFuncionariosDao {
    
    Conexao conex;
    Connection conn;
    
    public CadastroFuncionariosDao() {
        this.conex = new Conexao();
        this.conn = conex.getConection();
    }
    
    public void register(PacoteCadastroFuncionarios funcionarios) {
        
        String sql = "insert into funcionarios(nome, cpf, email, senha, typeUser) values (?, ?, ?, ?, ?)";
        
        try {
            PreparedStatement st = this.conn.prepareStatement(sql);
            
            
            st.setString(1, funcionarios.getPerson().getNome());
            st.setString(2, funcionarios.getCpf().getCpf());
            st.setString(3, funcionarios.getLogin().getEmail());
            st.setString(4, funcionarios.getLogin().getSenha());
            st.setString(5, funcionarios.getTypeUser().getTyperUser());
            
            st.executeUpdate();
            
        } catch (Exception e) {
            Logger.getLogger(CadastroFuncionariosDao.class.getName()).log(Level.SEVERE, null, e);
        }
        
    }
    
    
}
