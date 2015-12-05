/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

/**
 *
 * @author hung
 */
public class Driver {
    
    private int dId;
    private String username;
    private String pass;
    private String email;
    private int typeUser;
    private String name;
    private String contact;
    private String address;
    private String city;
    private String mobile;
    private String telephone;
    private String exp;
    private String description;
    private int paymentType;

    public Driver() {
    }

    public Driver(int dId, String username, String pass, String email, int typeUser, String name, String contact, String address, String city, String mobile, String telephone, String exp, String description, int paymentType) {
        this.dId = dId;
        this.username = username;
        this.pass = pass;
        this.email = email;
        this.typeUser = typeUser;
        this.name = name;
        this.contact = contact;
        this.address = address;
        this.city = city;
        this.mobile = mobile;
        this.telephone = telephone;
        this.exp = exp;
        this.description = description;
        this.paymentType = paymentType;
    }

    public int getdId() {
        return dId;
    }

    public void setdId(int dId) {
        this.dId = dId;
    }

    public String getUsername() {
        return username;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTypeUser() {
        return typeUser;
    }

    public void setTypeUser(int typeUser) {
        this.typeUser = typeUser;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getExp() {
        return exp;
    }

    public void setExp(String exp) {
        this.exp = exp;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(int paymentType) {
        this.paymentType = paymentType;
    }

    @Override
    public String toString() {
        return "Driver{" + "dId=" + dId + ", username=" + username + ", name=" + name + ", contact=" + contact + ", address=" + address + ", city=" + city + ", mobile=" + mobile + ", telephone=" + telephone + ", exp=" + exp + ", description=" + description + ", paymentType=" + paymentType + '}';
    }
    
    
}
