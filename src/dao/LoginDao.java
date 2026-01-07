package dao;

import beans.PacoteCadastroFuncionarios;
import conection.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class LoginDao {
    
    Conexao conex;
    Connection conn;
    
    public LoginDao() {
        this.conex = new Conexao();
        this.conn = conex.getConection();
    }
    
    public PacoteCadastroFuncionarios login(PacoteCadastroFuncionarios funcionario) {
        String sql = "select * from funcionarios where email = ? senha = ?";
        
        try {
            PreparedStatement st = this.conn.prepareStatement(sql);
        
            st.setString(1, funcionario.getLogin().getEmail());
            st.setString(2, funcionario.getLogin().getSenha());
            
            ResultSet rs = st.executeQuery();
            
            while(rs.next()) {
                PacoteCadastroFuncionarios loginFun = new PacoteCadastroFuncionarios();
                loginFun.getPerson().setNome(rs.getString("nome"));
                loginFun.getCpf().setCpf(rs.getString("cpf"));
                loginFun.getLogin().setEmail(rs.getString("email"));
                loginFun.getLogin().setSenha(rs.getString("senha"));
                
                return loginFun;
                
                
            }
            
        } catch (Exception e) {
            
        }
        return null;
    }
    
    
}
