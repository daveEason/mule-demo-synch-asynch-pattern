package com.mulesoft.demo.synch.asynch;

import org.apache.commons.lang.time.DateUtils;

import javax.jws.WebService;
import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * User: davideason
 * Date: 9/21/11
 * Time: 9:26 PM
 * To change this template use File | Settings | File Templates.
 */
@WebService(endpointInterface = "com.mulesoft.demo.synch.asynch.ICreditCardService", serviceName = "CreditCardService")
public class CreditCardServiceImpl implements ICreditCardService {

    public OrderSummary processOrder(CreditCardOrder creditCardOrder){

        OrderSummary summary = new OrderSummary();
        Date currentDate = new Date();
        Date activationDate = DateUtils.addWeeks(currentDate,2);
        String localProcessingCenter = "OAKLAND/CA";

        summary.setCreditCardOrder(creditCardOrder);
        summary.setDateCreated(currentDate);
        summary.setActivationDate(activationDate);
        summary.setProcessingCenter(localProcessingCenter);

        return summary;
    }
}
