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
public class PaymentType {
    
    private int ptId;
    private float price;
    private int paymentType;

    public PaymentType() {
    }

    public int getPtId() {
        return ptId;
    }

    public void setPtId(int ptId) {
        this.ptId = ptId;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(int paymentType) {
        this.paymentType = paymentType;
    }

    @Override
    public String toString() {
        return "PaymentType{" + "ptId=" + ptId + ", price=" + price + ", paymentType=" + paymentType + '}';
    }
    
    
    
}
