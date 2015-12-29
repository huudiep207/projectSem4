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
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author hung
 */
@ManagedBean(name="controller")
@SessionScoped
public class Controller {
    
    public List<Driver> getAllDriver(){
        List<Driver> list = new LinkedList<>();
        String sql = "select * from Driver";
        try {
            Connection conn = DBUtils.connection();
            ResultSet rs = conn.prepareStatement(sql).executeQuery();
            while (rs.next()) {  
                Driver d = new Driver();
                d.setdId(rs.getInt(1));
                d.setUsername(rs.getString(2));
                d.setName(rs.getString(3));
                d.setContact(rs.getString(4));
                d.setAddress(rs.getString(5));
                d.setCity(rs.getString(6));
                d.setMobile(rs.getString(7));
                d.setTelephone(rs.getString(8));
                d.setExp(rs.getString(9));
                d.setDescription(rs.getString(10));
                d.setPaymentType(rs.getInt(11));
                list.add(d);
            }
        } catch (ClassNotFoundException | SQLException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    
    public Driver getDriver(String username){
        String sql = "select * from Driver where UserName ="+username;
        Driver d = new Driver();
        try {
            Connection conn = DBUtils.connection();
            ResultSet rs = conn.prepareStatement(sql).executeQuery();
            while (rs.next()) {
                d.setdId(rs.getInt(1));
                d.setUsername(rs.getString(2));
                d.setName(rs.getString(3));
                d.setContact(rs.getString(4));
                d.setAddress(rs.getString(5));
                d.setCity(rs.getString(6));
                d.setMobile(rs.getString(7));
                d.setTelephone(rs.getString(8));
                d.setExp(rs.getString(9));
                d.setDescription(rs.getString(10));
                d.setPaymentType(rs.getInt(11));
            }
            conn.close();
        } catch (ClassNotFoundException | SQLException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
        return d;
    }
    
    public Driver getDriverById(int id){
        String sql = "select * from Driver where DId ="+id;
        Driver d = new Driver();
        try {
            Connection conn = DBUtils.connection();
            ResultSet rs = conn.prepareStatement(sql).executeQuery();
            while (rs.next()) {
                d.setdId(rs.getInt(1));
                d.setUsername(rs.getString(2));
                d.setName(rs.getString(3));
                d.setContact(rs.getString(4));
                d.setAddress(rs.getString(5));
                d.setCity(rs.getString(6));
                d.setMobile(rs.getString(7));
                d.setTelephone(rs.getString(8));
                d.setExp(rs.getString(9));
                d.setDescription(rs.getString(10));
                d.setPaymentType(rs.getInt(11));
            }
            conn.close();
        } catch (ClassNotFoundException | SQLException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
        return d;
    }
    
    public List<Registration> getAllRegistration() throws InstantiationException, IllegalAccessException{
        List<Registration> list = new LinkedList<>();
        String sql = "select * from Registration";
        try {
            Connection conn = DBUtils.connection();
            ResultSet rs = conn.prepareStatement(sql).executeQuery();
            while (rs.next()) {  
                Registration r = new Registration();
                r.setrId(rs.getInt(1));
                r.setUsername(rs.getString(2));
                r.setDesignation(rs.getString(3));
                r.setName(rs.getString(4));
                r.setAddress(rs.getString(5));
                r.setMobile(rs.getString(6));
                r.setTelephone(rs.getString(7));
                r.setFax(rs.getString(8));
                r.setPaymentType(rs.getInt(9));
                list.add(r);
            }
            conn.close();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    
    public Registration getRegistration(String username){
        String sql = "select * from Registration where UserName ="+username;
        Registration r = new Registration();
        try {
            Connection conn = DBUtils.connection();
            ResultSet rs = conn.prepareStatement(sql).executeQuery();
            while (rs.next()) {
                r.setrId(rs.getInt(1));
                r.setUsername(rs.getString(2));
                r.setDesignation(rs.getString(3));
                r.setName(rs.getString(4));
                r.setAddress(rs.getString(5));
                r.setMobile(rs.getString(6));
                r.setTelephone(rs.getString(7));
                r.setFax(rs.getString(8));
                r.setPaymentType(rs.getInt(9));
            }
            conn.close();
        } catch (ClassNotFoundException | SQLException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
        return r;
    }
    
    public Registration getRegistrationById(int id){
        String sql = "select * from Registration where RId ="+id;
        Registration r = new Registration();
        try {
            Connection conn = DBUtils.connection();
            ResultSet rs = conn.prepareStatement(sql).executeQuery();
            while (rs.next()) {
                r.setrId(rs.getInt(1));
                r.setUsername(rs.getString(2));
                r.setDesignation(rs.getString(3));
                r.setName(rs.getString(4));
                r.setAddress(rs.getString(5));
                r.setMobile(rs.getString(6));
                r.setTelephone(rs.getString(7));
                r.setFax(rs.getString(8));
                r.setPaymentType(rs.getInt(9));
            }
            conn.close();
        } catch (ClassNotFoundException | SQLException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
        return r;
    }
    
    public List<Advertisement> getAllAdvertisement(){
        List<Advertisement> list = new LinkedList<>();
        String sql = "select * from Advertisement";
        try {
            Connection conn = DBUtils.connection();
            ResultSet rs = conn.prepareStatement(sql).executeQuery();
            while (rs.next()) {  
                Advertisement a = new Advertisement();
                a.setaId(rs.getInt(1));
                a.setUsername(rs.getString(2));
                a.setDesignation(rs.getString(3));
                a.setName(rs.getString(4));
                a.setAddress(rs.getString(5));
                a.setMobile(rs.getString(6));
                a.setTelephone(rs.getString(7));
                a.setDescription(rs.getString(8));
                a.setPaymentType(rs.getInt(9));
                list.add(a);
            }
            conn.close();
        } catch (ClassNotFoundException | SQLException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    
    public Advertisement getAdvertisement(String username){
        String sql = "select * from Advertisement where UserName = "+username;
        Advertisement a = new Advertisement();
        try {
            Connection conn = DBUtils.connection();
            ResultSet rs = conn.prepareStatement(sql).executeQuery();
            while (rs.next()) {
                a.setaId(rs.getInt(1));
                a.setUsername(rs.getString(2));
                a.setDesignation(rs.getString(3));
                a.setName(rs.getString(4));
                a.setAddress(rs.getString(5));
                a.setMobile(rs.getString(6));
                a.setTelephone(rs.getString(7));
                a.setDescription(rs.getString(8));
                a.setPaymentType(rs.getInt(9));
            }
            conn.close();
        } catch (ClassNotFoundException | SQLException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
        return a;
    }
    
    public Advertisement getAdvertisementById(int id){
        String sql = "select * from Advertisement where AId ="+id;
        Advertisement a = new Advertisement();
        try {
            Connection conn = DBUtils.connection();
            ResultSet rs = conn.prepareStatement(sql).executeQuery();
            while (rs.next()) {
                a.setaId(rs.getInt(1));
                a.setUsername(rs.getString(2));
                a.setDesignation(rs.getString(3));
                a.setName(rs.getString(4));
                a.setAddress(rs.getString(5));
                a.setMobile(rs.getString(6));
                a.setTelephone(rs.getString(7));
                a.setDescription(rs.getString(8));
                a.setPaymentType(rs.getInt(9));
            }
            conn.close();
        } catch (ClassNotFoundException | SQLException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
        return a;
    }

    public boolean addRegistration(Registration r) throws ClassNotFoundException, SQLException {
        String sql = "insert into Registration values(?,?,?,?,?,?,?,?,?)";
        try {
            Connection conn = DBUtils.connection();
            User u = new User();
            u.setUsername(r.getUsername());
            u.setPass(r.getPass());
            u.setEmail(r.getEmail());
            u.setTypeUser(1);
            if (addUser(u)) {
                PreparedStatement pre = conn.prepareStatement(sql);
                pre.setString(1, null);
                pre.setString(2, r.getUsername());
                pre.setString(3, r.getDesignation());
                pre.setString(4, r.getName());
                pre.setString(5, r.getAddress());
                pre.setString(6, r.getMobile());
                pre.setString(7, r.getTelephone());
                pre.setString(8, r.getFax());
                pre.setInt(9, r.getPaymentType());
                if (pre.executeUpdate() == 1) {
                    return true;
                }
            } else if (!checkRegistration(u.getUsername())) {
                PreparedStatement pre = conn.prepareStatement(sql);
                pre.setString(1, null);
                pre.setString(2, r.getUsername());
                pre.setString(3, r.getDesignation());
                pre.setString(4, r.getName());
                pre.setString(5, r.getAddress());
                pre.setString(6, r.getMobile());
                pre.setString(7, r.getTelephone());
                pre.setString(8, r.getFax());
                pre.setInt(9, r.getPaymentType());
                if (pre.executeUpdate() == 1) {
                    return true;
                }
            }
            conn.close();
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        } catch (InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public boolean addDriver(Driver d) throws ClassNotFoundException, SQLException {
        String sql = "insert into Driver values(?,?,?,?,?,?,?,?,?,?,?)";
        try {
            Connection conn = DBUtils.connection();
            User u = new User();
            u.setUsername(d.getUsername());
            u.setPass(d.getPass());
            u.setEmail(d.getEmail());
            u.setTypeUser(1);
            if (addUser(u)) {
                PreparedStatement pre = conn.prepareStatement(sql);
                pre.setString(1, null);
                pre.setString(2, d.getUsername());
                pre.setString(3, d.getName());
                pre.setString(4, d.getContact());
                pre.setString(5, d.getAddress());
                pre.setString(6, d.getCity());
                pre.setString(7, d.getMobile());
                pre.setString(8, d.getTelephone());
                pre.setString(9, d.getExp());
                pre.setString(10, d.getDescription());
                pre.setInt(11, d.getPaymentType());
                if (pre.executeUpdate() == 1) {
                    return true;
                }
            } else if (!checkDriver(u.getUsername())) {
                PreparedStatement pre = conn.prepareStatement(sql);
                pre.setString(1, null);
                pre.setString(2, d.getUsername());
                pre.setString(3, d.getName());
                pre.setString(4, d.getContact());
                pre.setString(5, d.getAddress());
                pre.setString(6, d.getCity());
                pre.setString(7, d.getMobile());
                pre.setString(8, d.getTelephone());
                pre.setString(9, d.getExp());
                pre.setString(10, d.getDescription());
                pre.setInt(11, d.getPaymentType());
                if (pre.executeUpdate() == 1) {
                    return true;
                }
            }
            conn.close();
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        } catch (InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
     
    public boolean addAdvertisement(Advertisement a) throws ClassNotFoundException, SQLException {
        String sql = "insert into Advertisement values(?,?,?,?,?,?,?,?,?)";
        try {
            Connection conn = DBUtils.connection();
            User u = new User();
            u.setUsername(a.getUsername());
            u.setPass(a.getPass());
            u.setEmail(a.getEmail());
            u.setTypeUser(1);
            if (addUser(u)) {
                PreparedStatement pre = conn.prepareStatement(sql);
                pre.setString(1, null);
                pre.setString(2, a.getUsername());
                pre.setString(3, a.getDesignation());
                pre.setString(4, a.getName());
                pre.setString(5, a.getAddress());
                pre.setString(6, a.getMobile());
                pre.setString(7, a.getTelephone());
                pre.setString(8, a.getDescription());
                pre.setInt(9, a.getPaymentType());
                if (pre.executeUpdate() == 1) {
                    return true;
                }
            } else if (!checkAdvertisement(u.getUsername())) {
                PreparedStatement pre = conn.prepareStatement(sql);
                pre.setString(1, null);
                pre.setString(2, a.getUsername());
                pre.setString(3, a.getDesignation());
                pre.setString(4, a.getName());
                pre.setString(5, a.getAddress());
                pre.setString(6, a.getMobile());
                pre.setString(7, a.getTelephone());
                pre.setString(8, a.getDescription());
                pre.setInt(9, a.getPaymentType());
                if (pre.executeUpdate() == 1) {
                    return true;
                }
            }
            conn.close();
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        } catch (InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public boolean addUser(User u) throws ClassNotFoundException, SQLException {
        if (!checkUser(u.getUsername())) {
            String sql = "insert into User values(?,?,?,?)";
            try {
                Connection conn = DBUtils.connection();
                PreparedStatement pre = conn.prepareStatement(sql);
                pre.setString(1, u.getUsername());
                pre.setString(2, u.getPass());
                pre.setString(3, u.getEmail());
                pre.setInt(4, 1);
                if (pre.executeUpdate() == 1) {
                    return true;
                }
                conn.close();
            } catch (ClassNotFoundException | SQLException e) {
                System.out.println(e.getMessage());
            } catch (InstantiationException | IllegalAccessException ex) {
                Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return false;
    }

    public boolean checkUser(String username) {
        String sql = "select * from User";
        try {
            Connection conn = DBUtils.connection();
            PreparedStatement pre = conn.prepareStatement(sql);
            ResultSet rs = pre.executeQuery();
            while (rs.next()) {
                if (rs.getString(1).equals(username)) {
                    return true;
                }
            }
            conn.close();
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        } catch (InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public User getUser(String username) {
        String sql = "select * from User";
        User u = new User();
        try {
            Connection conn = DBUtils.connection();
            PreparedStatement pre = conn.prepareStatement(sql);
            ResultSet rs = pre.executeQuery();
            while (rs.next()) {
                u.setUsername(rs.getString(1));
                u.setPass(rs.getString(2));
                u.setEmail(rs.getString(3));
                u.setTypeUser(rs.getInt(4));
            }
            conn.close();
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        } catch (InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
        return u;
    }
    
    public boolean checkEmail(String email) {
        String sql = "select * from User";
        try {
            Connection conn = DBUtils.connection();
            PreparedStatement pre = conn.prepareStatement(sql);
            ResultSet rs = pre.executeQuery();
            while (rs.next()) {
                if (rs.getString(3).equals(email)) {
                    return true;
                }
            }
            conn.close();
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        } catch (InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public boolean checkRegistration(String username) {
        String sql = "select * from Registration";
        try {
            Connection conn = DBUtils.connection();
            PreparedStatement pre = conn.prepareStatement(sql);
            ResultSet rs = pre.executeQuery();
            while (rs.next()) {
                if (rs.getString(2).equals(username)) {
                    return true;
                }
            }
            conn.close();
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        } catch (InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public boolean checkDriver(String username) {
        String sql = "select * from Driver";
        try {
            Connection conn = DBUtils.connection();
            PreparedStatement pre = conn.prepareStatement(sql);
            ResultSet rs = pre.executeQuery();
            while (rs.next()) {
                if (rs.getString(2).equals(username)) {
                    return true;
                }
            }
            conn.close();
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        } catch (InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public boolean checkAdvertisement(String username) {
        String sql = "select * from Advertisement";
        try {
            Connection conn = DBUtils.connection();
            PreparedStatement pre = conn.prepareStatement(sql);
            ResultSet rs = pre.executeQuery();
            while (rs.next()) {
                if (rs.getString(2).equals(username)) {
                    return true;
                }
            }
            conn.close();
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        } catch (InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public boolean signin(User user){
        String sql = "select * from User";
        try {
            Connection conn = DBUtils.connection();
            PreparedStatement pre = conn.prepareStatement(sql);
            ResultSet rs = pre.executeQuery();
            while (rs.next()) {
                if (rs.getString(1).equals(user.getUsername()) && rs.getString(2).equals(user.getPass())) {
                    return true;
                }
            }
            conn.close();
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        } catch (InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public static void main(String[] args) {
        Controller c = new Controller();
        System.out.println(c.getDriverById(2));
    }
    
}
