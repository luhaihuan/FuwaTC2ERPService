
package alterbom.org.ufida;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.1.12
 * 2017-07-25T17:19:22.174+08:00
 * Generated source version: 3.1.12
 */

@WebFault(name = "Exception", targetNamespace = "http://schemas.datacontract.org/2004/07/System")
public class UFIDAU9ISVMFGBOMIImportBOMSvDoExceptionFaultFaultMessage extends java.lang.Exception {
    
    private alterbom.org.datacontract.schemas._2004._07.system.Exception exception;

    public UFIDAU9ISVMFGBOMIImportBOMSvDoExceptionFaultFaultMessage() {
        super();
    }
    
    public UFIDAU9ISVMFGBOMIImportBOMSvDoExceptionFaultFaultMessage(String message) {
        super(message);
    }
    
    public UFIDAU9ISVMFGBOMIImportBOMSvDoExceptionFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public UFIDAU9ISVMFGBOMIImportBOMSvDoExceptionFaultFaultMessage(String message, alterbom.org.datacontract.schemas._2004._07.system.Exception exception) {
        super(message);
        this.exception = exception;
    }

    public UFIDAU9ISVMFGBOMIImportBOMSvDoExceptionFaultFaultMessage(String message, alterbom.org.datacontract.schemas._2004._07.system.Exception exception, Throwable cause) {
        super(message, cause);
        this.exception = exception;
    }

    public alterbom.org.datacontract.schemas._2004._07.system.Exception getFaultInfo() {
        return this.exception;
    }
}
