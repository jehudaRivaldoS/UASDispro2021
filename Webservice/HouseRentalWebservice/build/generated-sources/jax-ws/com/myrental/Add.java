
package com.myrental;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for add complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="add"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="user" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="properti" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="harga" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="tanggal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="durasi_sewa" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="jumlah_orang" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="tipe_pembayaran" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nomor_kartu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="catatan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "add", propOrder = {
    "user",
    "properti",
    "harga",
    "tanggal",
    "durasiSewa",
    "jumlahOrang",
    "tipePembayaran",
    "nomorKartu",
    "catatan",
    "status"
})
public class Add {

    protected String user;
    protected int properti;
    protected int harga;
    protected String tanggal;
    @XmlElement(name = "durasi_sewa")
    protected int durasiSewa;
    @XmlElement(name = "jumlah_orang")
    protected int jumlahOrang;
    @XmlElement(name = "tipe_pembayaran")
    protected String tipePembayaran;
    @XmlElement(name = "nomor_kartu")
    protected String nomorKartu;
    protected String catatan;
    protected int status;

    /**
     * Gets the value of the user property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUser() {
        return user;
    }

    /**
     * Sets the value of the user property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUser(String value) {
        this.user = value;
    }

    /**
     * Gets the value of the properti property.
     * 
     */
    public int getProperti() {
        return properti;
    }

    /**
     * Sets the value of the properti property.
     * 
     */
    public void setProperti(int value) {
        this.properti = value;
    }

    /**
     * Gets the value of the harga property.
     * 
     */
    public int getHarga() {
        return harga;
    }

    /**
     * Sets the value of the harga property.
     * 
     */
    public void setHarga(int value) {
        this.harga = value;
    }

    /**
     * Gets the value of the tanggal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTanggal() {
        return tanggal;
    }

    /**
     * Sets the value of the tanggal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTanggal(String value) {
        this.tanggal = value;
    }

    /**
     * Gets the value of the durasiSewa property.
     * 
     */
    public int getDurasiSewa() {
        return durasiSewa;
    }

    /**
     * Sets the value of the durasiSewa property.
     * 
     */
    public void setDurasiSewa(int value) {
        this.durasiSewa = value;
    }

    /**
     * Gets the value of the jumlahOrang property.
     * 
     */
    public int getJumlahOrang() {
        return jumlahOrang;
    }

    /**
     * Sets the value of the jumlahOrang property.
     * 
     */
    public void setJumlahOrang(int value) {
        this.jumlahOrang = value;
    }

    /**
     * Gets the value of the tipePembayaran property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipePembayaran() {
        return tipePembayaran;
    }

    /**
     * Sets the value of the tipePembayaran property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipePembayaran(String value) {
        this.tipePembayaran = value;
    }

    /**
     * Gets the value of the nomorKartu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomorKartu() {
        return nomorKartu;
    }

    /**
     * Sets the value of the nomorKartu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomorKartu(String value) {
        this.nomorKartu = value;
    }

    /**
     * Gets the value of the catatan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCatatan() {
        return catatan;
    }

    /**
     * Sets the value of the catatan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCatatan(String value) {
        this.catatan = value;
    }

    /**
     * Gets the value of the status property.
     * 
     */
    public int getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     */
    public void setStatus(int value) {
        this.status = value;
    }

}
