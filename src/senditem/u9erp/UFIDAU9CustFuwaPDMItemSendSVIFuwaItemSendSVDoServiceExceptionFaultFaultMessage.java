
package senditem.u9erp;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.1.12
 * 2017-07-18T10:53:32.684+08:00
 * Generated source version: 3.1.12
 */

@WebFault(name = "ServiceException", targetNamespace = "http://schemas.datacontract.org/2004/07/UFSoft.UBF.Service")
public class UFIDAU9CustFuwaPDMItemSendSVIFuwaItemSendSVDoServiceExceptionFaultFaultMessage extends java.lang.Exception {
    
    private senditem.u9erp.ServiceException serviceException;

    public UFIDAU9CustFuwaPDMItemSendSVIFuwaItemSendSVDoServiceExceptionFaultFaultMessage() {
        super();
    }
    
    public UFIDAU9CustFuwaPDMItemSendSVIFuwaItemSendSVDoServiceExceptionFaultFaultMessage(String message) {
        super(message);
    }
    
    public UFIDAU9CustFuwaPDMItemSendSVIFuwaItemSendSVDoServiceExceptionFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public UFIDAU9CustFuwaPDMItemSendSVIFuwaItemSendSVDoServiceExceptionFaultFaultMessage(String message, senditem.u9erp.ServiceException serviceException) {
        super(message);
        this.serviceException = serviceException;
    }

    public UFIDAU9CustFuwaPDMItemSendSVIFuwaItemSendSVDoServiceExceptionFaultFaultMessage(String message, senditem.u9erp.ServiceException serviceException, Throwable cause) {
        super(message, cause);
        this.serviceException = serviceException;
    }

    public senditem.u9erp.ServiceException getFaultInfo() {
        return this.serviceException;
    }
}