
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package com.validar.validaciontarjetacredito;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.7.18
 * 2017-04-30T11:29:10.799-05:00
 * Generated source version: 2.7.18
 * 
 */

@javax.jws.WebService(
                      serviceName = "VaidarTarjetaCredito",
                      portName = "VaidarTarjetaCreditoService",
                      targetNamespace = "http://www.validar.com/ValidacionTarjetaCredito/",
                      wsdlLocation = "file:/C:/WorkSpaceKall/ValidacionTarjetaCredito/WebContent/ValidarTarjeraCredito.wsdl",
                      endpointInterface = "com.validar.validaciontarjetacredito.ValidateCreditCard")
                      
public class ValidateCreditCardImpl implements ValidateCreditCard {

    private static final Logger LOG = Logger.getLogger(ValidateCreditCardImpl.class.getName());

    /* (non-Javadoc)
     * @see com.validar.validaciontarjetacredito.ValidateCreditCard#verifyCC(com.validar.validaciontarjetacredito.CreditCard  creditCard )*
     */
    public boolean verifyCC(CreditCard creditCard) throws CreditCardValidationFaultMessage    { 
        LOG.info("Executing operation verifyCC");
        System.out.println(creditCard);
        try {
            boolean _return = false; 
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        //throw new CreditCardValidationFaultMessage("CreditCardValidationFaultMessage...");
    }

}
