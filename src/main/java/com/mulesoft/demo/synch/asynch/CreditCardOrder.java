package com.mulesoft.demo.synch.asynch;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 * Created by IntelliJ IDEA.
 * User: davideason
 * Date: 9/21/11
 * Time: 5:10 PM
 * To change this template use File | Settings | File Templates.
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class CreditCardOrder {

    public CreditCardOrder(){
        // default no-argument constructor
    }

    public CreditCardOrder(String cardNumber, String ccv, String name, double balance, double apr){
        setCardNumber(cardNumber);
        setCcv(ccv);
        setName(name);
        setBalance(balance);
        setApr(apr);
    }

    public  String cardNumber;

    public  String ccv;

    public String name;

    public Double balance;

    public Double apr;

    @XmlTransient
    public String getCardNumber(){
        return this.cardNumber;
    }

    public void setCardNumber(String cardNumber){
        this.cardNumber = cardNumber;
    }

    @XmlTransient
    public String getCcv(){
        return this.ccv;
    }

    public void setCcv(String ccv){
        this.ccv = ccv;
    }

    @XmlTransient
    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    @XmlTransient
    public Double getBalance(){
        return this.balance;
    }

    public void  setBalance(Double balance){
        this.balance = balance;
    }

    @XmlTransient
    public Double getApr(){
        return this.apr;
    }

    public void setApr(Double apr){
        this.apr = apr;
    }
}
