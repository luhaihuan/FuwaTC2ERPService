package take_number.call_net;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.0.1
 * 2017-07-13T09:18:21.648+08:00
 * Generated source version: 3.0.1
 * 
 */
@WebService(targetNamespace = "http://tempuri.org/", name = "CreateItemForSDByCustSVSoap")
@XmlSeeAlso({ObjectFactory.class})
public interface CreateItemForSDByCustSVSoap {

    @WebMethod(operationName = "Do", action = "http://tempuri.org/Do")
    @RequestWrapper(localName = "Do", targetNamespace = "http://tempuri.org/", className = "take_number.call_net.Do")
    @ResponseWrapper(localName = "DoResponse", targetNamespace = "http://tempuri.org/", className = "take_number.call_net.DoResponse")
    @WebResult(name = "DoResult", targetNamespace = "http://tempuri.org/")
    public java.lang.String _do(
        @WebParam(name = "strdt", targetNamespace = "http://tempuri.org/")
        java.lang.String strdt,
        @WebParam(name = "orgID", targetNamespace = "http://tempuri.org/")
        java.lang.String orgID,
        @WebParam(name = "userID", targetNamespace = "http://tempuri.org/")
        java.lang.String userID,
        @WebParam(name = "userCode", targetNamespace = "http://tempuri.org/")
        java.lang.String userCode,
        @WebParam(name = "userName", targetNamespace = "http://tempuri.org/")
        java.lang.String userName
    );
}
