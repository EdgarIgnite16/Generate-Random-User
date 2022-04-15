package Ultilites;

import Model.user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class HandleDatabase {
    public void createTable(String dbName, String tbName) throws Exception {
        String sql = "create table [dbo].[" + tbName +  "] (\n" +
                "\tId int,\n" +
                "\tUid varchar(100),\n" +
                "\tUsername nvarchar(50),\n" +
                "\tEmail varchar(100),\n" +
                "\tFirstname nvarchar(50),\n" +
                "\tLastname nvarchar(50),\n" +
                "\tAddress nvarchar(150),\n" +
                "\tPhoneNumber varchar(50),\n" +
                "\tCreaditCard varchar(100),\n" +
                "\tDateOfBirth varchar(50),\n" +
                "\tGender varchar(50),\n" +
                "\tPassword varchar(50),\n" +
                "\tSocialInsuranceNumber varchar(150)\n" +
                ")";
        try (
                Connection conn = new _Connection(dbName, tbName).getConn();
                Statement stm = conn.createStatement();
        ) {
            stm.executeUpdate(sql);
            System.out.println("Khoi tao table thanh cong !");
        }
    }

    public void insertData(String dbName, String tbName, user userData) throws Exception {
        String sql = "INSERT INTO [dbo].[" + tbName + "] ([Id], [Uid], [Username], [Email], [Firstname], [Lastname], [Address], " +
                "[PhoneNumber], [CreaditCard], [DateOfBirth], [Gender], [Password], [SocialInsuranceNumber])"
                + "VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try(
                Connection conn = new _Connection(dbName, tbName).getConn();
                PreparedStatement pstm = conn.prepareStatement(sql);
        ) {
            pstm.setInt(1, userData.getId());
            pstm.setString(2, userData.getUid());
            pstm.setString(3, userData.getUsername());
            pstm.setString(4, userData.getEmail());
            pstm.setString(5, userData.getFirstname());
            pstm.setString(6, userData.getLastname());
            pstm.setString(7, userData.getAddress());
            pstm.setString(8, userData.getPhoneNumber());
            pstm.setString(9, userData.getCreaditCard());
            pstm.setString(10, userData.getDateOfBirth());
            pstm.setString(11, userData.getGender());
            pstm.setString(12, userData.getPassword());
            pstm.setString(13, userData.getSocialInsuranceNumber());

            // execute query
            pstm.executeUpdate();
        }
    }
}
