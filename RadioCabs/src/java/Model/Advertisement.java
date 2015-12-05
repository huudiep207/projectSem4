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
public class Advertisement {
    private int aId;
    private String username;
    private String pass;
    private String email;
    private int typeUser;
    private String name;
    private String designation;
    private String address;
    private String mobile;
    private String telephone;
    private String description;
    private int paymentType;

    public Advertisement() {
    }

    public Advertisement(int aId, String username, String pass, String email, int typeUser, String name, String designation, String address, String mobile, String telephone, String description, int paymentType) {
        this.aId = aId;
        this.username = username;
        this.pass = pass;
        this.email = email;
        this.typeUser = typeUser;
        this.name = name;
        this.designation = designation;
        this.address = address;
        this.mobile = mobile;
        this.telephone = telephone;
        this.description = description;
        this.paymentType = paymentType;
    }
    
    

    public int getaId() {
        return aId;
    }

    public void setaId(int aId) {
        this.aId = aId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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
        return "Advertisement{" + "aId=" + aId + ", username=" + username + ", name=" + name + ", designation=" + designation + ", address=" + address + ", mobile=" + mobile + ", telephone=" + telephone + ", description=" + description + ", paymentType=" + paymentType + '}';
    }
    
    
}
