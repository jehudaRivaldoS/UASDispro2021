
package com.myrental;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for transaksi complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="transaksi"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://myrental.com/}myConnection"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="catatan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="durasi_sewa" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="harga" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="jumlah_orang" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="nomor_kartu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="properti" type="{http://myrental.com/}properti" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="tanggal_penyewaan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tipe_pembayaran" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="user" type="{http://myrental.com/}user" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "transaksi", propOrder = {
    "catatan",
    "durasiSewa",
    "harga",
    "id",
    "jumlahOrang",
    "nomorKartu",
    "properti",
    "status",
    "tanggalPenyewaan",
    "tipePembayaran",
    "user"
})
public class Transaksi
    extends MyConnection
{

    protected String catatan;
    @XmlElement(name = "durasi_sewa")
    protected int durasiSewa;
    protected int harga;
    protected int id;
    @XmlElement(name = "jumlah_orang")
    protected int jumlahOrang;
    @XmlElement(name = "nomor_kartu")
    protected String nomorKartu;
    protected Properti properti;
    protected int status;
    @XmlElement(name = "tanggal_penyewaan")
    protected String tanggalPenyewaan;
    @XmlElement(name = "tipe_pembayaran")
    protected String tipePembayaran;
    protected User user;

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

    /**
     * Gets the value of the tanggalPenyewaan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTanggalPenyewaan() {
        return tanggalPenyewaan;
    }

    /**
     * Sets the value of the tanggalPenyewaan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTanggalPenyewaan(String value) {
        this.tanggalPenyewaan = value;
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
     * Gets the value of the user property.
     * 
     * @return
     *     possible object is
     *     {@link User }
     *     
     */
    public User getUser() {
        return user;
    }

    /**
     * Sets the value of the user property.
     * 
     * @param value
     *     allowed object is
     *     {@link User }
     *     
     */
    public void setUser(User value) {
        this.user = value;
    }

}
