
package querymaterial.org.ufida;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.1.12
 * 2017-08-01T18:33:50.306+08:00
 * Generated source version: 3.1.12
 */

@WebFault(name = "ServiceException", targetNamespace = "http://schemas.datacontract.org/2004/07/UFSoft.UBF.Service")
public class UFIDAU9ISVItemIBatchQueryItemByDTOSRVDoServiceExceptionFaultFaultMessage extends java.lang.Exception {
    
    private querymaterial.org.datacontract.schemas._2004._07.ufsoft_ubf.ServiceException serviceException;

    public UFIDAU9ISVItemIBatchQueryItemByDTOSRVDoServiceExceptionFaultFaultMessage() {
        super();
    }
    
    public UFIDAU9ISVItemIBatchQueryItemByDTOSRVDoServiceExceptionFaultFaultMessage(String message) {
        super(message);
    }
    
    public UFIDAU9ISVItemIBatchQueryItemByDTOSRVDoServiceExceptionFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public UFIDAU9ISVItemIBatchQueryItemByDTOSRVDoServiceExceptionFaultFaultMessage(String message, querymaterial.org.datacontract.schemas._2004._07.ufsoft_ubf.ServiceException serviceException) {
        super(message);
        this.serviceException = serviceException;
    }

    public UFIDAU9ISVItemIBatchQueryItemByDTOSRVDoServiceExceptionFaultFaultMessage(String message, querymaterial.org.datacontract.schemas._2004._07.ufsoft_ubf.ServiceException serviceException, Throwable cause) {
        super(message, cause);
        this.serviceException = serviceException;
    }

    public querymaterial.org.datacontract.schemas._2004._07.ufsoft_ubf.ServiceException getFaultInfo() {
        return this.serviceException;
    }
}
