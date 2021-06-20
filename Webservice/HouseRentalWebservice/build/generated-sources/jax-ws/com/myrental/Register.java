
package com.myrental;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for register complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="register"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="username" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nama" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="alamat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nomor_telepon" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tanggal_lahir" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tempat_lahir" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "register", propOrder = {
    "username",
    "password",
    "nama",
    "alamat",
    "nomorTelepon",
    "tanggalLahir",
    "tempatLahir"
})
public class Register {

    protected String username;
    protected String password;
    protected String nama;
    protected String alamat;
    @XmlElement(name = "nomor_telepon")
    protected String nomorTelepon;
    @XmlElement(name = "tanggal_lahir")
    protected String tanggalLahir;
    @XmlElement(name = "tempat_lahir")
    protected String tempatLahir;

    /**
     * Gets the value of the username property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets the value of the username property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsername(String value) {
        this.username = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Gets the value of the nama property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNama() {
        return nama;
    }

    /**
     * Sets the value of the nama property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNama(String value) {
        this.nama = value;
    }

    /**
     * Gets the value of the alamat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlamat() {
        return alamat;
    }

    /**
     * Sets the value of the alamat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlamat(String value) {
        this.alamat = value;
    }

    /**
     * Gets the value of the nomorTelepon property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomorTelepon() {
        return nomorTelepon;
    }

    /**
     * Sets the value of the nomorTelepon property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomorTelepon(String value) {
        this.nomorTelepon = value;
    }

    /**
     * Gets the value of the tanggalLahir property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTanggalLahir() {
        return tanggalLahir;
    }

    /**
     * Sets the value of the tanggalLahir property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTanggalLahir(String value) {
        this.tanggalLahir = value;
    }

    /**
     * Gets the value of the tempatLahir property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTempatLahir() {
        return tempatLahir;
    }

    /**
     * Sets the value of the tempatLahir property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTempatLahir(String value) {
        this.tempatLahir = value;
    }

}
