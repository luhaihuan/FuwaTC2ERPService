
package senditem.u9erp;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.1.12
 * 2017-07-18T10:53:32.720+08:00
 * Generated source version: 3.1.12
 */

@WebFault(name = "ExceptionBase", targetNamespace = "http://schemas.datacontract.org/2004/07/UFSoft.UBF")
public class UFIDAU9CustFuwaPDMItemSendSVIFuwaItemSendSVDoExceptionBaseFaultFaultMessage extends java.lang.Exception {
    
    private senditem.u9erp.ExceptionBase exceptionBase;

    public UFIDAU9CustFuwaPDMItemSendSVIFuwaItemSendSVDoExceptionBaseFaultFaultMessage() {
        super();
    }
    
    public UFIDAU9CustFuwaPDMItemSendSVIFuwaItemSendSVDoExceptionBaseFaultFaultMessage(String message) {
        super(message);
    }
    
    public UFIDAU9CustFuwaPDMItemSendSVIFuwaItemSendSVDoExceptionBaseFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public UFIDAU9CustFuwaPDMItemSendSVIFuwaItemSendSVDoExceptionBaseFaultFaultMessage(String message, senditem.u9erp.ExceptionBase exceptionBase) {
        super(message);
        this.exceptionBase = exceptionBase;
    }

    public UFIDAU9CustFuwaPDMItemSendSVIFuwaItemSendSVDoExceptionBaseFaultFaultMessage(String message, senditem.u9erp.ExceptionBase exceptionBase, Throwable cause) {
        super(message, cause);
        this.exceptionBase = exceptionBase;
    }

    public senditem.u9erp.ExceptionBase getFaultInfo() {
        return this.exceptionBase;
    }
}