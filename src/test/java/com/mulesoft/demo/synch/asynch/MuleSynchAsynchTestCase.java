package com.mulesoft.demo.synch.asynch;

import org.mule.api.MuleMessage;
import org.mule.module.client.MuleClient;
import org.mule.tck.FunctionalTestCase;
import org.mule.transport.NullPayload;
/**
 * Created by IntelliJ IDEA.
 * User: davideason
 * Date: 9/21/11
 * Time: 10:01 PM
 * To change this template use File | Settings | File Templates.
 */

public class MuleSynchAsynchTestCase extends FunctionalTestCase
{

    public CreditCardOrder creditCardOrder;

    protected String getConfigResources()
    {
        return "mule-config.xml";
    }

    public void testSynchAsynch() throws Exception
    {
        MuleClient client = new MuleClient(muleContext);

        creditCardOrder = new CreditCardOrder("1224","227","WILLIAM SMITH",0.00,15.44);

        MuleMessage result = client.send("cxf:http://localhost:1082/mule/services/CreditCardOrderService?method=processOrder", creditCardOrder, null);
        assertNotNull(result);
        assertNull(result.getExceptionPayload());
        assertFalse(result.getPayload() instanceof NullPayload);
        assertEquals("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><orderSummary><creditCardOrder><cardNumber>1224</cardNumber><ccv>227</ccv><name>WILLIAM SMITH</name><balance>0.0</balance><apr>15.44</apr></creditCardOrder><dateCreated>", result.getPayloadAsString().substring(0,224));
    }

}
