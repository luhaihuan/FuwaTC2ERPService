
package alterbom.org.datacontract.schemas._2004._07.system;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

import alterbom.org.datacontract.schemas._2004._07.ufsoft_ubf.ServiceExceptionDetail;


/**
 * <p>ExceptionDetail complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="ExceptionDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="HelpLink" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InnerException" type="{http://schemas.datacontract.org/2004/07/System.ServiceModel}ExceptionDetail" minOccurs="0"/&gt;
 *         &lt;element name="Message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="StackTrace" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExceptionDetail", namespace = "http://schemas.datacontract.org/2004/07/System.ServiceModel", propOrder = {
    "helpLink",
    "innerException",
    "message",
    "stackTrace",
    "type"
})
@XmlSeeAlso({
    ServiceExceptionDetail.class
})
public class ExceptionDetail {

    @XmlElementRef(name = "HelpLink", namespace = "http://schemas.datacontract.org/2004/07/System.ServiceModel", type = JAXBElement.class, required = false)
    protected JAXBElement<String> helpLink;
    @XmlElementRef(name = "InnerException", namespace = "http://schemas.datacontract.org/2004/07/System.ServiceModel", type = JAXBElement.class, required = false)
    protected JAXBElement<ExceptionDetail> innerException;
    @XmlElementRef(name = "Message", namespace = "http://schemas.datacontract.org/2004/07/System.ServiceModel", type = JAXBElement.class, required = false)
    protected JAXBElement<String> message;
    @XmlElementRef(name = "StackTrace", namespace = "http://schemas.datacontract.org/2004/07/System.ServiceModel", type = JAXBElement.class, required = false)
    protected JAXBElement<String> stackTrace;
    @XmlElementRef(name = "Type", namespace = "http://schemas.datacontract.org/2004/07/System.ServiceModel", type = JAXBElement.class, required = false)
    protected JAXBElement<String> type;

    /**
     * ��ȡhelpLink���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHelpLink() {
        return helpLink;
    }

    /**
     * ����helpLink���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHelpLink(JAXBElement<String> value) {
        this.helpLink = value;
    }

    /**
     * ��ȡinnerException���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ExceptionDetail }{@code >}
     *     
     */
    public JAXBElement<ExceptionDetail> getInnerException() {
        return innerException;
    }

    /**
     * ����innerException���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ExceptionDetail }{@code >}
     *     
     */
    public void setInnerException(JAXBElement<ExceptionDetail> value) {
        this.innerException = value;
    }

    /**
     * ��ȡmessage���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMessage() {
        return message;
    }

    /**
     * ����message���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMessage(JAXBElement<String> value) {
        this.message = value;
    }

    /**
     * ��ȡstackTrace���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStackTrace() {
        return stackTrace;
    }

    /**
     * ����stackTrace���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStackTrace(JAXBElement<String> value) {
        this.stackTrace = value;
    }

    /**
     * ��ȡtype���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getType() {
        return type;
    }

    /**
     * ����type���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setType(JAXBElement<String> value) {
        this.type = value;
    }

}