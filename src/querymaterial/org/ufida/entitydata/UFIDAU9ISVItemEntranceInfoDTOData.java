
package querymaterial.org.ufida.entitydata;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>UFIDA.U9.ISV.Item.EntranceInfoDTOData complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="UFIDA.U9.ISV.Item.EntranceInfoDTOData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.UFIDA.org/EntityData}UFSoft.UBF.Business.DataTransObjectBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="m_cIQCdoe" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.Pub.Controller.CommonArchiveDataDTOData" minOccurs="0"/&gt;
 *         &lt;element name="m_createdBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_createdOn" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="m_decriptionByChinese" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_decriptionByEnglish" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_iD" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="m_isDrawback" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="m_isWhole" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="m_modifiedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_modifiedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="m_packType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="m_sysVersion" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="m_tradeType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UFIDA.U9.ISV.Item.EntranceInfoDTOData", propOrder = {
    "mciqCdoe",
    "mCreatedBy",
    "mCreatedOn",
    "mDecriptionByChinese",
    "mDecriptionByEnglish",
    "mid",
    "mIsDrawback",
    "mIsWhole",
    "mModifiedBy",
    "mModifiedOn",
    "mPackType",
    "mSysVersion",
    "mTradeType"
})
public class UFIDAU9ISVItemEntranceInfoDTOData
    extends UFSoftUBFBusinessDataTransObjectBase
{

    @XmlElementRef(name = "m_cIQCdoe", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> mciqCdoe;
    @XmlElementRef(name = "m_createdBy", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mCreatedBy;
    @XmlElement(name = "m_createdOn")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mCreatedOn;
    @XmlElementRef(name = "m_decriptionByChinese", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mDecriptionByChinese;
    @XmlElementRef(name = "m_decriptionByEnglish", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mDecriptionByEnglish;
    @XmlElement(name = "m_iD")
    protected Long mid;
    @XmlElement(name = "m_isDrawback")
    protected Boolean mIsDrawback;
    @XmlElement(name = "m_isWhole")
    protected Boolean mIsWhole;
    @XmlElementRef(name = "m_modifiedBy", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mModifiedBy;
    @XmlElement(name = "m_modifiedOn")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mModifiedOn;
    @XmlElement(name = "m_packType")
    protected Integer mPackType;
    @XmlElement(name = "m_sysVersion")
    protected Long mSysVersion;
    @XmlElement(name = "m_tradeType")
    protected Integer mTradeType;

    /**
     * ��ȡmciqCdoe���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> getMCIQCdoe() {
        return mciqCdoe;
    }

    /**
     * ����mciqCdoe���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public void setMCIQCdoe(JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> value) {
        this.mciqCdoe = value;
    }

    /**
     * ��ȡmCreatedBy���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMCreatedBy() {
        return mCreatedBy;
    }

    /**
     * ����mCreatedBy���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMCreatedBy(JAXBElement<String> value) {
        this.mCreatedBy = value;
    }

    /**
     * ��ȡmCreatedOn���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMCreatedOn() {
        return mCreatedOn;
    }

    /**
     * ����mCreatedOn���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMCreatedOn(XMLGregorianCalendar value) {
        this.mCreatedOn = value;
    }

    /**
     * ��ȡmDecriptionByChinese���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMDecriptionByChinese() {
        return mDecriptionByChinese;
    }

    /**
     * ����mDecriptionByChinese���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMDecriptionByChinese(JAXBElement<String> value) {
        this.mDecriptionByChinese = value;
    }

    /**
     * ��ȡmDecriptionByEnglish���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMDecriptionByEnglish() {
        return mDecriptionByEnglish;
    }

    /**
     * ����mDecriptionByEnglish���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMDecriptionByEnglish(JAXBElement<String> value) {
        this.mDecriptionByEnglish = value;
    }

    /**
     * ��ȡmid���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMID() {
        return mid;
    }

    /**
     * ����mid���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMID(Long value) {
        this.mid = value;
    }

    /**
     * ��ȡmIsDrawback���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsDrawback() {
        return mIsDrawback;
    }

    /**
     * ����mIsDrawback���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsDrawback(Boolean value) {
        this.mIsDrawback = value;
    }

    /**
     * ��ȡmIsWhole���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsWhole() {
        return mIsWhole;
    }

    /**
     * ����mIsWhole���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsWhole(Boolean value) {
        this.mIsWhole = value;
    }

    /**
     * ��ȡmModifiedBy���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMModifiedBy() {
        return mModifiedBy;
    }

    /**
     * ����mModifiedBy���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMModifiedBy(JAXBElement<String> value) {
        this.mModifiedBy = value;
    }

    /**
     * ��ȡmModifiedOn���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMModifiedOn() {
        return mModifiedOn;
    }

    /**
     * ����mModifiedOn���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMModifiedOn(XMLGregorianCalendar value) {
        this.mModifiedOn = value;
    }

    /**
     * ��ȡmPackType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMPackType() {
        return mPackType;
    }

    /**
     * ����mPackType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMPackType(Integer value) {
        this.mPackType = value;
    }

    /**
     * ��ȡmSysVersion���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMSysVersion() {
        return mSysVersion;
    }

    /**
     * ����mSysVersion���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMSysVersion(Long value) {
        this.mSysVersion = value;
    }

    /**
     * ��ȡmTradeType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMTradeType() {
        return mTradeType;
    }

    /**
     * ����mTradeType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMTradeType(Integer value) {
        this.mTradeType = value;
    }

}