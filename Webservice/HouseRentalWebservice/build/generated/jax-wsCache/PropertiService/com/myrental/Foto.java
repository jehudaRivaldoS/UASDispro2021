
package com.myrental;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for foto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="foto"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://myrental.com/}myConnection"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="foto1" type="{http://myrental.com/}blob" minOccurs="0"/&gt;
 *         &lt;element name="foto2" type="{http://myrental.com/}blob" minOccurs="0"/&gt;
 *         &lt;element name="foto3" type="{http://myrental.com/}blob" minOccurs="0"/&gt;
 *         &lt;element name="foto4" type="{http://myrental.com/}blob" minOccurs="0"/&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="properti" type="{http://myrental.com/}properti" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "foto", propOrder = {
    "foto1",
    "foto2",
    "foto3",
    "foto4",
    "id",
    "properti"
})
public class Foto
    extends MyConnection
{

    protected Blob foto1;
    protected Blob foto2;
    protected Blob foto3;
    protected Blob foto4;
    protected int id;
    protected Properti properti;

    /**
     * Gets the value of the foto1 property.
     * 
     * @return
     *     possible object is
     *     {@link Blob }
     *     
     */
    public Blob getFoto1() {
        return foto1;
    }

    /**
     * Sets the value of the foto1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Blob }
     *     
     */
    public void setFoto1(Blob value) {
        this.foto1 = value;
    }

    /**
     * Gets the value of the foto2 property.
     * 
     * @return
     *     possible object is
     *     {@link Blob }
     *     
     */
    public Blob getFoto2() {
        return foto2;
    }

    /**
     * Sets the value of the foto2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Blob }
     *     
     */
    public void setFoto2(Blob value) {
        this.foto2 = value;
    }

    /**
     * Gets the value of the foto3 property.
     * 
     * @return
     *     possible object is
     *     {@link Blob }
     *     
     */
    public Blob getFoto3() {
        return foto3;
    }

    /**
     * Sets the value of the foto3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Blob }
     *     
     */
    public void setFoto3(Blob value) {
        this.foto3 = value;
    }

    /**
     * Gets the value of the foto4 property.
     * 
     * @return
     *     possible object is
     *     {@link Blob }
     *     
     */
    public Blob getFoto4() {
        return foto4;
    }

    /**
     * Sets the value of the foto4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Blob }
     *     
     */
    public void setFoto4(Blob value) {
        this.foto4 = value;
    }

    /**
     * Gets the value of the id property.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Gets the value of the properti property.
     * 
     * @return
     *     possible object is
     *     {@link Properti }
     *     
     */
    public Properti getProperti() {
        return properti;
    }

    /**
     * Sets the value of the properti property.
     * 
     * @param value
     *     allowed object is
     *     {@link Properti }
     *     
     */
    public void setProperti(Properti value) {
        this.properti = value;
    }

}
