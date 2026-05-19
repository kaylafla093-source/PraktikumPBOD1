/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistensi_A;

/**
 *
 * @author Kayla Febrina Laura Ayu 24060124120004
 */

import java.sql .*;
/*
 * File : MySQLPersonDAO.java
 * Deskripsi : implementasi PersonDAO untuk MySQL
*/
public class MySQLPersonDAO implements PersonDAO{
    public void savePerson(Person person) throws Exception{
        String name = person.getName();
        //membuat koneksi, nama db, user, password menyesuaikan
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection (
                         "jdbc:mysql://localhost/pbo","root","KflaKfla19$");
        //kerjakan mysql query
        String query = "INSERT INTO person (name) VALUES('"+name+"')";
        System.out.println(query);
        Statement s = con.createStatement();
        s.executeUpdate(query);
        //tutup koneksi database
        con.close ();
    }
}