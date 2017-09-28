
package senditem.u9erp;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ErrorMessage complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="ErrorMessage"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="errDescriptor" type="{http://schemas.datacontract.org/2004/07/UFSoft.UBF}ErrorDescriptor"/&gt;
 *         &lt;element name="errorType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="innerMessages" type="{http://schemas.datacontract.org/2004/07/UFSoft.UBF}ArrayOfErrorMessage" minOccurs="0"/&gt;
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ErrorMessage", namespace = "http://schemas.datacontract.org/2004/07/UFSoft.UBF", propOrder = {
    "errDescriptor",
    "errorType",
    "innerMessages",
    "message"
})
public class ErrorMessage {

    @XmlElement(namespace = "http://schemas.datacontract.org/2004/07/UFSoft.UBF", required = true, nillable = true)
    protected ErrorDescriptor errDescriptor;
    @XmlElement(namespace = "http://schemas.datacontract.org/2004/07/UFSoft.UBF", required = true, nillable = true)
    protected String errorType;
    @XmlElementRef(name = "innerMessages", namespace = "http://schemas.datacontract.org/2004/07/UFSoft.UBF", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfErrorMessage> innerMessages;
    @XmlElementRef(name = "message", namespace = "http://schemas.datacontract.org/2004/07/UFSoft.UBF", type = JAXBElement.class, required = false)
    protected JAXBElement<String> message;

    /**
     * ��ȡerrDescriptor���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ErrorDescriptor }
     *     
     */
    public ErrorDescriptor getErrDescriptor() {
        return errDescriptor;
    }

    /**
     * ����errDescriptor���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorDescriptor }
     *     
     */
    public void setErrDescriptor(ErrorDescriptor value) {
        this.errDescriptor = value;
    }

    /**
     * ��ȡerrorType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorType() {
        return errorType;
    }

    /**
     * ����errorType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorType(String value) {
        this.errorType = value;
    }

    /**
     * ��ȡinnerMessages���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfErrorMessage }{@code >}
     *     
     */
    public JAXBElement<ArrayOfErrorMessage> getInnerMessages() {
        return innerMessages;
    }

    /**
     * ����innerMessages���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfErrorMessage }{@code >}
     *     
     */
    public void setInnerMessages(JAXBElement<ArrayOfErrorMessage> value) {
        this.innerMessages = value;
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

}