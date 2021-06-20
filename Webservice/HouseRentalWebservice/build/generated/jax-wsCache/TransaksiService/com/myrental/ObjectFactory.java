
package com.myrental;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.myrental package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Add_QNAME = new QName("http://myrental.com/", "add");
    private final static QName _AddResponse_QNAME = new QName("http://myrental.com/", "addResponse");
    private final static QName _CheckDays_QNAME = new QName("http://myrental.com/", "checkDays");
    private final static QName _CheckDaysResponse_QNAME = new QName("http://myrental.com/", "checkDaysResponse");
    private final static QName _Show_QNAME = new QName("http://myrental.com/", "show");
    private final static QName _ShowDataTrans_QNAME = new QName("http://myrental.com/", "showDataTrans");
    private final static QName _ShowDataTransResponse_QNAME = new QName("http://myrental.com/", "showDataTransResponse");
    private final static QName _ShowResponse_QNAME = new QName("http://myrental.com/", "showResponse");
    private final static QName _Update_QNAME = new QName("http://myrental.com/", "update");
    private final static QName _UpdateResponse_QNAME = new QName("http://myrental.com/", "updateResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.myrental
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Add }
     * 
     */
    public Add createAdd() {
        return new Add();
    }

    /**
     * Create an instance of {@link AddResponse }
     * 
     */
    public AddResponse createAddResponse() {
        return new AddResponse();
    }

    /**
     * Create an instance of {@link CheckDays }
     * 
     */
    public CheckDays createCheckDays() {
        return new CheckDays();
    }

    /**
     * Create an instance of {@link CheckDaysResponse }
     * 
     */
    public CheckDaysResponse createCheckDaysResponse() {
        return new CheckDaysResponse();
    }

    /**
     * Create an instance of {@link Show }
     * 
     */
    public Show createShow() {
        return new Show();
    }

    /**
     * Create an instance of {@link ShowDataTrans }
     * 
     */
    public ShowDataTrans createShowDataTrans() {
        return new ShowDataTrans();
    }

    /**
     * Create an instance of {@link ShowDataTransResponse }
     * 
     */
    public ShowDataTransResponse createShowDataTransResponse() {
        return new ShowDataTransResponse();
    }

    /**
     * Create an instance of {@link ShowResponse }
     * 
     */
    public ShowResponse createShowResponse() {
        return new ShowResponse();
    }

    /**
     * Create an instance of {@link Update }
     * 
     */
    public Update createUpdate() {
        return new Update();
    }

    /**
     * Create an instance of {@link UpdateResponse }
     * 
     */
    public UpdateResponse createUpdateResponse() {
        return new UpdateResponse();
    }

    /**
     * Create an instance of {@link Transaksi }
     * 
     */
    public Transaksi createTransaksi() {
        return new Transaksi();
    }

    /**
     * Create an instance of {@link MyConnection }
     * 
     */
    public MyConnection createMyConnection() {
        return new MyConnection();
    }

    /**
     * Create an instance of {@link Properti }
     * 
     */
    public Properti createProperti() {
        return new Properti();
    }

    /**
     * Create an instance of {@link Foto }
     * 
     */
    public Foto createFoto() {
        return new Foto();
    }

    /**
     * Create an instance of {@link Blob }
     * 
     */
    public Blob createBlob() {
        return new Blob();
    }

    /**
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Add }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://myrental.com/", name = "add")
    public JAXBElement<Add> createAdd(Add value) {
        return new JAXBElement<Add>(_Add_QNAME, Add.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://myrental.com/", name = "addResponse")
    public JAXBElement<AddResponse> createAddResponse(AddResponse value) {
        return new JAXBElement<AddResponse>(_AddResponse_QNAME, AddResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckDays }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://myrental.com/", name = "checkDays")
    public JAXBElement<CheckDays> createCheckDays(CheckDays value) {
        return new JAXBElement<CheckDays>(_CheckDays_QNAME, CheckDays.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckDaysResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://myrental.com/", name = "checkDaysResponse")
    public JAXBElement<CheckDaysResponse> createCheckDaysResponse(CheckDaysResponse value) {
        return new JAXBElement<CheckDaysResponse>(_CheckDaysResponse_QNAME, CheckDaysResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Show }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://myrental.com/", name = "show")
    public JAXBElement<Show> createShow(Show value) {
        return new JAXBElement<Show>(_Show_QNAME, Show.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShowDataTrans }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://myrental.com/", name = "showDataTrans")
    public JAXBElement<ShowDataTrans> createShowDataTrans(ShowDataTrans value) {
        return new JAXBElement<ShowDataTrans>(_ShowDataTrans_QNAME, ShowDataTrans.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShowDataTransResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://myrental.com/", name = "showDataTransResponse")
    public JAXBElement<ShowDataTransResponse> createShowDataTransResponse(ShowDataTransResponse value) {
        return new JAXBElement<ShowDataTransResponse>(_ShowDataTransResponse_QNAME, ShowDataTransResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShowResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://myrental.com/", name = "showResponse")
    public JAXBElement<ShowResponse> createShowResponse(ShowResponse value) {
        return new JAXBElement<ShowResponse>(_ShowResponse_QNAME, ShowResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Update }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://myrental.com/", name = "update")
    public JAXBElement<Update> createUpdate(Update value) {
        return new JAXBElement<Update>(_Update_QNAME, Update.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://myrental.com/", name = "updateResponse")
    public JAXBElement<UpdateResponse> createUpdateResponse(UpdateResponse value) {
        return new JAXBElement<UpdateResponse>(_UpdateResponse_QNAME, UpdateResponse.class, null, value);
    }

}
