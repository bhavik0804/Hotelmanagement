/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

/**
 *
 * @author bhavi
 */
import java.sql.*;
import javax.swing.JOptionPane;
public class tables {
    public static void main(String[] args)
    {
        Connection con=null;
        Statement st=null;
        try
        {
            con=ConnectionProvider.getCon();
            st=con.createStatement();
            st.execute("create table users (Username varchar(20),Email varchar(20),Password varchar(20),Securityquestion varchar(80),Answer varchar(30),Address varchar(200),status varchar(20))");
            st.execute("create table rooms (Roomnumber varchar(20),Roomtype varchar(25),bed varchar(25),price int,status varchar(20))");
            st.executeUpdate("create table customers(id int,name varchar(200),mobilenumber varchar(20),nationality varchar(200),gender varchar(25),idproof varchar(200),idproofnumber varchar(20),customercheckin varchar(20),email varchar(200),Roomnumber varchar(20),Roomtype varchar(25),bed varchar(25),priceperday int,numberofdaystay int,totalamount varchar(200),checkout varchar(200) )");
            JOptionPane.showMessageDialog(null, "Table Created Sucesfully");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        finally
        {
            try
        {
            con.close();
            st.close();
        }
        catch(Exception e)
        {}
        }
    
    }
}

