package syncbom.org.tempuri;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

import com.teamcenter.clientx.WSconfig;

import syncbom.org.ufida.UFIDAU9CustFuwaPDMSyncBomCompontInfoSVISyncBomInfoSV;

/**
 * This class was generated by Apache CXF 3.1.12
 * 2017-07-28T09:57:49.555+08:00
 * Generated source version: 3.1.12
 * 
 */
@WebServiceClient(name = "SyncBomInfoSVStub", 
                  wsdlLocation = "http://192.168.2.70/U9/Services/UFIDA.U9.Cust.Fuwa.PDM.SyncBomCompontInfoSV.ISyncBomInfoSV.svc?wsdl",
                  targetNamespace = "http://tempuri.org/") 
public class SyncBomInfoSVStub extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://tempuri.org/", "SyncBomInfoSVStub");
    public final static QName BasicHttpBindingUFIDAU9CustFuwaPDMSyncBomCompontInfoSVISyncBomInfoSV = new QName("http://tempuri.org/", "BasicHttpBinding_UFIDA.U9.Cust.Fuwa.PDM.SyncBomCompontInfoSV.ISyncBomInfoSV");
    static {
        URL url = null;
        try {
            url = new URL(WSconfig.getUrl() + "U9/Services/UFIDA.U9.Cust.Fuwa.PDM.SyncBomCompontInfoSV.ISyncBomInfoSV.svc?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(SyncBomInfoSVStub.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://192.168.2.70/U9/Services/UFIDA.U9.Cust.Fuwa.PDM.SyncBomCompontInfoSV.ISyncBomInfoSV.svc?wsdl");
        } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        WSDL_LOCATION = url;
    }

    public SyncBomInfoSVStub(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public SyncBomInfoSVStub(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SyncBomInfoSVStub() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public SyncBomInfoSVStub(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public SyncBomInfoSVStub(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public SyncBomInfoSVStub(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns UFIDAU9CustFuwaPDMSyncBomCompontInfoSVISyncBomInfoSV
     */
    @WebEndpoint(name = "BasicHttpBinding_UFIDA.U9.Cust.Fuwa.PDM.SyncBomCompontInfoSV.ISyncBomInfoSV")
    public UFIDAU9CustFuwaPDMSyncBomCompontInfoSVISyncBomInfoSV getBasicHttpBindingUFIDAU9CustFuwaPDMSyncBomCompontInfoSVISyncBomInfoSV() {
        return super.getPort(BasicHttpBindingUFIDAU9CustFuwaPDMSyncBomCompontInfoSVISyncBomInfoSV, UFIDAU9CustFuwaPDMSyncBomCompontInfoSVISyncBomInfoSV.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns UFIDAU9CustFuwaPDMSyncBomCompontInfoSVISyncBomInfoSV
     */
    @WebEndpoint(name = "BasicHttpBinding_UFIDA.U9.Cust.Fuwa.PDM.SyncBomCompontInfoSV.ISyncBomInfoSV")
    public UFIDAU9CustFuwaPDMSyncBomCompontInfoSVISyncBomInfoSV getBasicHttpBindingUFIDAU9CustFuwaPDMSyncBomCompontInfoSVISyncBomInfoSV(WebServiceFeature... features) {
        return super.getPort(BasicHttpBindingUFIDAU9CustFuwaPDMSyncBomCompontInfoSVISyncBomInfoSV, UFIDAU9CustFuwaPDMSyncBomCompontInfoSVISyncBomInfoSV.class, features);
    }

}
