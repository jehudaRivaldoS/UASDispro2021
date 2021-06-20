
package com.myrental;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for properti complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="properti"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://myrental.com/}myConnection"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="alamat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="deskripsi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="foto" type="{http://myrental.com/}foto" minOccurs="0"/&gt;
 *         &lt;element name="harga" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="kota" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nama" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="rating" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="tipe_properti" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "properti", propOrder = {
    "alamat",
    "deskripsi",
    "foto",
    "harga",
    "id",
    "kota",
    "nama",
    "rating",
    "tipeProperti"
})
public class Properti
    extends MyConnection
{

    protected String alamat;
    protected String deskripsi;
    protected Foto foto;
    protected int harga;
    protected int id;
    protected String kota;
    protected String nama;
    protected double rating;
    @XmlElement(name = "tipe_properti")
    protected String tipeProperti;

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
     * Gets the value of the deskripsi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeskripsi() {
        return deskripsi;
    }

    /**
     * Sets the value of the deskripsi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeskripsi(String value) {
        this.deskripsi = value;
    }

    /**
     * Gets the value of the foto property.
     * 
     * @return
     *     possible object is
     *     {@link Foto }
     *     
     */
    public Foto getFoto() {
        return foto;
    }

    /**
     * Sets the value of the foto property.
     * 
     * @param value
     *     allowed object is
     *     {@link Foto }
     *     
     */
    public void setFoto(Foto value) {
        this.foto = value;
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
     * Gets the value of the kota property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKota() {
        return kota;
    }

    /**
     * Sets the value of the kota property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKota(String value) {
        this.kota = value;
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
     * Gets the value of the rating property.
     * 
     */
    public double getRating() {
        return rating;
    }

    /**
     * Sets the value of the rating property.
     * 
     */
    public void setRating(double value) {
        this.rating = value;
    }

    /**
     * Gets the value of the tipeProperti property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipeProperti() {
        return tipeProperti;
    }

    /**
     * Sets the value of the tipeProperti property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipeProperti(String value) {
        this.tipeProperti = value;
    }

}
