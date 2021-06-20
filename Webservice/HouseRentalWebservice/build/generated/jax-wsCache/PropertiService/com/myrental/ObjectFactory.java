
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

    private final static QName _ShowDataProp_QNAME = new QName("http://myrental.com/", "showDataProp");
    private final static QName _ShowDataPropResponse_QNAME = new QName("http://myrental.com/", "showDataPropResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.myrental
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ShowDataProp }
     * 
     */
    public ShowDataProp createShowDataProp() {
        return new ShowDataProp();
    }

    /**
     * Create an instance of {@link ShowDataPropResponse }
     * 
     */
    public ShowDataPropResponse createShowDataPropResponse() {
        return new ShowDataPropResponse();
    }

    /**
     * Create an instance of {@link Properti }
     * 
     */
    public Properti createProperti() {
        return new Properti();
    }

    /**
     * Create an instance of {@link MyConnection }
     * 
     */
    public MyConnection createMyConnection() {
        return new MyConnection();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ShowDataProp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://myrental.com/", name = "showDataProp")
    public JAXBElement<ShowDataProp> createShowDataProp(ShowDataProp value) {
        return new JAXBElement<ShowDataProp>(_ShowDataProp_QNAME, ShowDataProp.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShowDataPropResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://myrental.com/", name = "showDataPropResponse")
    public JAXBElement<ShowDataPropResponse> createShowDataPropResponse(ShowDataPropResponse value) {
        return new JAXBElement<ShowDataPropResponse>(_ShowDataPropResponse_QNAME, ShowDataPropResponse.class, null, value);
    }

}
