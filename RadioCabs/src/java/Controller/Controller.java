/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DB.DBUtils;
import Model.Advertisement;
import Model.Driver;
import Model.Registration;
import Model.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author hung
 */
public class Controller {

    public boolean addRegistration(Registration r) throws ClassNotFoundException, SQLException {
        String sql = "insert into Registration values(?,?,?,?,?,?,?,?)";
        try {
            Connection conn = DBUtils.connection();
            User u = new User();
            u.setUsername(r.getUsername());
            u.setPass(r.getPass());
            u.setEmail(r.getEmail());
            u.setTypeUser(1);
            if (addUser(u)) {
                PreparedStatement pre = conn.prepareStatement(sql);
                pre.setString(1, r.getUsername());
                pre.setString(2, r.getDesignation());
                pre.setString(3, r.getName());
                pre.setString(4, r.getAddress());
                pre.setString(5, r.getMobile());
                pre.setString(6, r.getTelephone());
                pre.setString(7, r.getFax());
                pre.setInt(8, r.getPaymentType());
                if (pre.executeUpdate() == 1) {
                    return true;
                }
            } else if (!checkRegistration(u)) {
                PreparedStatement pre = conn.prepareStatement(sql);
                pre.setString(1, r.getUsername());
                pre.setString(2, r.getDesignation());
                pre.setString(3, r.getName());
                pre.setString(4, r.getAddress());
                pre.setString(5, r.getMobile());
                pre.setString(6, r.getTelephone());
                pre.setString(7, r.getFax());
                pre.setInt(8, r.getPaymentType());
                if (pre.executeUpdate() == 1) {
                    return true;
                }
            }else   System.out.println("da co");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        }
        return false;
    }
    
     public boolean addDriver(Driver d) throws ClassNotFoundException, SQLException {
        String sql = "insert into Driver values(?,?,?,?,?,?,?,?,?,?)";
        try {
            Connection conn = DBUtils.connection();
            User u = new User();
            u.setUsername(d.getUsername());
            u.setPass(d.getPass());
            u.setEmail(d.getEmail());
            u.setTypeUser(1);
            if (addUser(u)) {
                PreparedStatement pre = conn.prepareStatement(sql);
                pre.setString(1, d.getUsername());
                pre.setString(2, d.getName());
                pre.setString(3, d.getContact());
                pre.setString(4, d.getAddress());
                pre.setString(5, d.getCity());
                pre.setString(6, d.getMobile());
                pre.setString(7, d.getTelephone());
                pre.setString(8, d.getExp());
                pre.setString(9, d.getDescription());
                pre.setInt(10, d.getPaymentType());
                if (pre.executeUpdate() == 1) {
                    return true;
                }
            } else if (!checkDriver(u)) {
                PreparedStatement pre = conn.prepareStatement(sql);
                pre.setString(1, d.getUsername());
                pre.setString(2, d.getName());
                pre.setString(3, d.getContact());
                pre.setString(4, d.getAddress());
                pre.setString(5, d.getCity());
                pre.setString(6, d.getMobile());
                pre.setString(7, d.getTelephone());
                pre.setString(8, d.getExp());
                pre.setString(9, d.getDescription());
                pre.setInt(10, d.getPaymentType());
                if (pre.executeUpdate() == 1) {
                    return true;
                }
            }else   System.out.println("da co");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        }
        return false;
    }
     
     public boolean addAdvertisement(Advertisement a) throws ClassNotFoundException, SQLException {
        String sql = "insert into Advertisement values(?,?,?,?,?,?,?,?)";
        try {
            Connection conn = DBUtils.connection();
            User u = new User();
            u.setUsername(a.getUsername());
            u.setPass(a.getPass());
            u.setEmail(a.getEmail());
            u.setTypeUser(1);
            if (addUser(u)) {
                PreparedStatement pre = conn.prepareStatement(sql);
                pre.setString(1, a.getUsername());
                pre.setString(2, a.getDesignation());
                pre.setString(3, a.getName());
                pre.setString(4, a.getAddress());
                pre.setString(5, a.getMobile());
                pre.setString(6, a.getTelephone());
                pre.setString(7, a.getDescription());
                pre.setInt(8, a.getPaymentType());
                if (pre.executeUpdate() == 1) {
                    return true;
                }
            } else if (!checkAdvertisement(u)) {
                PreparedStatement pre = conn.prepareStatement(sql);
                pre.setString(1, a.getUsername());
                pre.setString(2, a.getDesignation());
                pre.setString(3, a.getName());
                pre.setString(4, a.getAddress());
                pre.setString(5, a.getMobile());
                pre.setString(6, a.getTelephone());
                pre.setString(7, a.getDescription());
                pre.setInt(8, a.getPaymentType());
                if (pre.executeUpdate() == 1) {
                    return true;
                }
            }else   System.out.println("da co");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

    public boolean addUser(User u) throws ClassNotFoundException, SQLException {
        if (!checkUser(u)) {
            String sql = "insert into [User] values(?,?,?)";
            try {
                Connection conn = DBUtils.connection();
                PreparedStatement pre = conn.prepareStatement(sql);
                pre.setString(1, u.getUsername());
                pre.setString(2, u.getPass());
                pre.setString(3, u.getEmail());
                if (pre.executeUpdate() == 1) {
                    return true;
                }
            } catch (ClassNotFoundException | SQLException e) {
                System.out.println(e.getMessage());
            }
        }
        return false;
    }

    public boolean checkUser(User u) {
        String sql = "select * from [User]";
        try {
            Connection conn = DBUtils.connection();
            PreparedStatement pre = conn.prepareStatement(sql);
            ResultSet rs = pre.executeQuery();
            while (rs.next()) {
                if (rs.getString(1).equals(u.getUsername())) {
                    return true;
                }
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

    public boolean checkRegistration(User u) {
        String sql = "select * from Registration";
        try {
            Connection conn = DBUtils.connection();
            PreparedStatement pre = conn.prepareStatement(sql);
            ResultSet rs = pre.executeQuery();
            while (rs.next()) {
                if (rs.getString(2).equals(u.getUsername())) {
                    return true;
                }
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        }
        return false;
    }
    
    public boolean checkDriver(User u) {
        String sql = "select * from Driver";
        try {
            Connection conn = DBUtils.connection();
            PreparedStatement pre = conn.prepareStatement(sql);
            ResultSet rs = pre.executeQuery();
            while (rs.next()) {
                if (rs.getString(2).equals(u.getUsername())) {
                    return true;
                }
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        }
        return false;
    }
    
    public boolean checkAdvertisement(User u) {
        String sql = "select * from Advertisement";
        try {
            Connection conn = DBUtils.connection();
            PreparedStatement pre = conn.prepareStatement(sql);
            ResultSet rs = pre.executeQuery();
            while (rs.next()) {
                if (rs.getString(2).equals(u.getUsername())) {
                    return true;
                }
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        }
        return false;
    }
}
