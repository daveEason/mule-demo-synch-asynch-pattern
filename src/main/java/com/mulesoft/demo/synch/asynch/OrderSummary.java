package com.mulesoft.demo.synch.asynch;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * User: davideason
 * Date: 9/21/11
 * Time: 6:58 PM
 * To change this template use File | Settings | File Templates.
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class OrderSummary {

    public CreditCardOrder creditCardOrder;

    public Date dateCreated;

    public Date activationDate;

    public String processingCenter;

    @XmlTransient
    public CreditCardOrder getCreditCardOrder(){
        return this.creditCardOrder;
    }

    public void setCreditCardOrder(CreditCardOrder creditCardOrder){
        this.creditCardOrder = creditCardOrder;
    }
    @XmlTransient
    public Date getDateCreated(){
        return this.dateCreated;
    }

    public void setDateCreated(Date dateCreated){
        this.dateCreated = dateCreated;
    }
    @XmlTransient
    public Date getActivationDate(){
        return this.activationDate;
    }

    public void setActivationDate(Date activationDate){
        this.activationDate = activationDate;
    }
    @XmlTransient
    public String getProcessingCenter(){
        return processingCenter;
    }

    public void setProcessingCenter(String processingCenter){
        this.processingCenter = processingCenter;
    }

}
