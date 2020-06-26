/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class NewClass2 {
    
}
public class koneksiDB {
    private Connection mysqlconfig;
    public  Connection konekDB()throws SQLException{
        try {
            String url="jdbc:mysql://localhost:3306/Data_Pegawai"; //url database
            String user="root"; //user database
            String pass=""; //password database
           DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            mysqlconfig=DriverManager.getConnection(url, user, pass);            
        } catch (SQLException e) {
            System.err.println("koneksi gagal "+e.getMessage()); //perintah menampilkan error pada koneksi
        }
        return mysqlconfig;
    }  
}
}

  
