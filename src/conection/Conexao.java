package conection;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {
    
    private String url = "jdbc:mysql://localhost/biblioteca";
    private String root = "root";
    private String senha = "113322";
    
    Connection con;
    
    public Connection getConection() {
        try {
            con = DriverManager.getConnection(url, root, senha);
            System.out.println("Banco conectado");
            return con;
            
        } catch (Exception e) {
            return null;
        }
    }
    
    
    public void Desconect() {
        try {
            this.con.close();
        } catch (Exception e) {
        }
    }
    
}
