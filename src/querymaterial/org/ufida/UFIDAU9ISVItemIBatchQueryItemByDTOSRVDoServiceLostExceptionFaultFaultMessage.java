
package querymaterial.org.ufida;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.1.12
 * 2017-08-01T18:33:50.368+08:00
 * Generated source version: 3.1.12
 */

@WebFault(name = "ServiceLostException", targetNamespace = "http://schemas.datacontract.org/2004/07/UFSoft.UBF.Service")
public class UFIDAU9ISVItemIBatchQueryItemByDTOSRVDoServiceLostExceptionFaultFaultMessage extends java.lang.Exception {
    
    private querymaterial.org.datacontract.schemas._2004._07.ufsoft_ubf.ServiceLostException serviceLostException;

    public UFIDAU9ISVItemIBatchQueryItemByDTOSRVDoServiceLostExceptionFaultFaultMessage() {
        super();
    }
    
    public UFIDAU9ISVItemIBatchQueryItemByDTOSRVDoServiceLostExceptionFaultFaultMessage(String message) {
        super(message);
    }
    
    public UFIDAU9ISVItemIBatchQueryItemByDTOSRVDoServiceLostExceptionFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public UFIDAU9ISVItemIBatchQueryItemByDTOSRVDoServiceLostExceptionFaultFaultMessage(String message, querymaterial.org.datacontract.schemas._2004._07.ufsoft_ubf.ServiceLostException serviceLostException) {
        super(message);
        this.serviceLostException = serviceLostException;
    }

    public UFIDAU9ISVItemIBatchQueryItemByDTOSRVDoServiceLostExceptionFaultFaultMessage(String message, querymaterial.org.datacontract.schemas._2004._07.ufsoft_ubf.ServiceLostException serviceLostException, Throwable cause) {
        super(message, cause);
        this.serviceLostException = serviceLostException;
    }

    public querymaterial.org.datacontract.schemas._2004._07.ufsoft_ubf.ServiceLostException getFaultInfo() {
        return this.serviceLostException;
    }
}
