package querymaterial.org.ufida;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.1.12
 * 2017-08-01T18:33:50.387+08:00
 * Generated source version: 3.1.12
 * 
 */
@WebService(targetNamespace = "http://www.UFIDA.org", name = "UFIDA.U9.ISV.Item.IBatchQueryItemByDTOSRV")
@XmlSeeAlso({querymaterial.org.datacontract.schemas._2004._07.ufsoft_ubf.ObjectFactory.class, querymaterial.data.util.ubf.ufsoft.ObjectFactory.class, querymaterial.org.datacontract.schemas._2004._07.system.ObjectFactory.class, querymaterial.org.datacontract.schemas._2004._07.ufsoft.ObjectFactory.class, querymaterial.org.ufida.entitydata.ObjectFactory.class, querymaterial.com.microsoft.schemas._2003._10.serialization.ObjectFactory.class, ObjectFactory.class, querymaterial.exceptions.ubf.ufsoft.ObjectFactory.class, querymaterial.org.datacontract.schemas._2004._07.ufsoft_ubf_util.ObjectFactory.class, querymaterial.org.datacontract.schemas._2004._07.ufsoft_ubf_pl.ObjectFactory.class, querymaterial.com.microsoft.schemas._2003._10.serialization.arrays.ObjectFactory.class})
public interface UFIDAU9ISVItemIBatchQueryItemByDTOSRV {

    @Action(input = "http://www.UFIDA.org/UFIDA.U9.ISV.Item.IBatchQueryItemByDTOSRV/Do", output = "http://www.UFIDA.org/UFIDA.U9.ISV.Item.IBatchQueryItemByDTOSRV/DoResponse", fault = {@FaultAction(className = UFIDAU9ISVItemIBatchQueryItemByDTOSRVDoServiceExceptionFaultFaultMessage.class, value = "http://www.UFIDA.org/UFIDA.U9.ISV.Item.IBatchQueryItemByDTOSRV/DoServiceExceptionFault"), @FaultAction(className = UFIDAU9ISVItemIBatchQueryItemByDTOSRVDoExceptionFaultFaultMessage.class, value = "http://www.UFIDA.org/UFIDA.U9.ISV.Item.IBatchQueryItemByDTOSRV/DoExceptionFault"), @FaultAction(className = UFIDAU9ISVItemIBatchQueryItemByDTOSRVDoExceptionBaseFaultFaultMessage.class, value = "http://www.UFIDA.org/UFIDA.U9.ISV.Item.IBatchQueryItemByDTOSRV/DoExceptionBaseFault"), @FaultAction(className = UFIDAU9ISVItemIBatchQueryItemByDTOSRVDoServiceLostExceptionFaultFaultMessage.class, value = "http://www.UFIDA.org/UFIDA.U9.ISV.Item.IBatchQueryItemByDTOSRV/DoServiceLostExceptionFault"), @FaultAction(className = UFIDAU9ISVItemIBatchQueryItemByDTOSRVDoServiceExceptionDetailFaultFaultMessage.class, value = "http://www.UFIDA.org/UFIDA.U9.ISV.Item.IBatchQueryItemByDTOSRV/DoServiceExceptionDetailFault")})
    @RequestWrapper(localName = "Do", targetNamespace = "http://www.UFIDA.org", className = "org.ufida.Do")
    @WebMethod(operationName = "Do", action = "http://www.UFIDA.org/UFIDA.U9.ISV.Item.IBatchQueryItemByDTOSRV/Do")
    @ResponseWrapper(localName = "DoResponse", targetNamespace = "http://www.UFIDA.org", className = "org.ufida.DoResponse")
    public void _do(
        @WebParam(name = "context", targetNamespace = "http://www.UFIDA.org")
        java.lang.Object context,
        @WebParam(name = "queryItemDTOs", targetNamespace = "http://www.UFIDA.org")
        querymaterial.org.ufida.entitydata.ArrayOfUFIDAU9ISVItemQueryItemDTOData queryItemDTOs,
        @WebParam(name = "contextDTO", targetNamespace = "http://www.UFIDA.org")
        querymaterial.org.ufida.entitydata.UFIDAU9CBOPubControllerContextDTOData contextDTO,
        @WebParam(mode = WebParam.Mode.OUT, name = "DoResult", targetNamespace = "http://www.UFIDA.org")
        javax.xml.ws.Holder<querymaterial.org.ufida.entitydata.ArrayOfUFIDAU9ISVItemItemMasterDTOData> doResult,
        @WebParam(mode = WebParam.Mode.OUT, name = "outMessages", targetNamespace = "http://www.UFIDA.org")
        javax.xml.ws.Holder<querymaterial.exceptions.ubf.ufsoft.ArrayOfMessageBase> outMessages
    ) throws UFIDAU9ISVItemIBatchQueryItemByDTOSRVDoServiceExceptionFaultFaultMessage, UFIDAU9ISVItemIBatchQueryItemByDTOSRVDoExceptionFaultFaultMessage, UFIDAU9ISVItemIBatchQueryItemByDTOSRVDoExceptionBaseFaultFaultMessage, UFIDAU9ISVItemIBatchQueryItemByDTOSRVDoServiceLostExceptionFaultFaultMessage, UFIDAU9ISVItemIBatchQueryItemByDTOSRVDoServiceExceptionDetailFaultFaultMessage;
}
