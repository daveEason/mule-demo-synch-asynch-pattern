package com.mulesoft.demo.synch.asynch;

import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

/**
 * Created by IntelliJ IDEA.
 * User: davideason
 * Date: 9/21/11
 * Time: 5:09 PM
 */

@WebService
public interface ICreditCardService {

    /**
     * Process an order.
     *
     * @param creditCardOrder
     * @return
     */

    @WebResult(name = "OrderSummary")
    public OrderSummary processOrder(@WebParam(name = "creditCardOrder") CreditCardOrder creditCardOrder);

}
