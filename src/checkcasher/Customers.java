/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkcasher;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author deepp
 */
@Entity
@Table(name = "CUSTOMERS", catalog = "", schema = "DEEP")
@NamedQueries({
    @NamedQuery(name = "Customers.findAll", query = "SELECT c FROM Customers c")
    , @NamedQuery(name = "Customers.findById", query = "SELECT c FROM Customers c WHERE c.id = :id")
    , @NamedQuery(name = "Customers.findByFirstname", query = "SELECT c FROM Customers c WHERE c.firstname = :firstname")
    , @NamedQuery(name = "Customers.findByLastname", query = "SELECT c FROM Customers c WHERE c.lastname = :lastname")
    , @NamedQuery(name = "Customers.findByContact", query = "SELECT c FROM Customers c WHERE c.contact = :contact")
    , @NamedQuery(name = "Customers.findByNotes", query = "SELECT c FROM Customers c WHERE c.notes = :notes")
    , @NamedQuery(name = "Customers.findByAddress", query = "SELECT c FROM Customers c WHERE c.address = :address")
    , @NamedQuery(name = "Customers.findByCity", query = "SELECT c FROM Customers c WHERE c.city = :city")
    , @NamedQuery(name = "Customers.findByState", query = "SELECT c FROM Customers c WHERE c.state = :state")})
public class Customers implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "FIRSTNAME")
    private String firstname;
    @Column(name = "LASTNAME")
    private String lastname;
    @Column(name = "CONTACT")
    private String contact;
    @Column(name = "NOTES")
    private String notes;
    @Column(name = "ADDRESS")
    private String address;
    @Column(name = "CITY")
    private String city;
    @Column(name = "STATE")
    private String state;
    @Lob
    @Column(name = "PERSONSNAP")
    private Serializable personsnap;
    @Lob
    @Column(name = "IDSNAP")
    private Serializable idsnap;

    public Customers() {
    }

    public Customers(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        String oldFirstname = this.firstname;
        this.firstname = firstname;
        changeSupport.firePropertyChange("firstname", oldFirstname, firstname);
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        String oldLastname = this.lastname;
        this.lastname = lastname;
        changeSupport.firePropertyChange("lastname", oldLastname, lastname);
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        String oldContact = this.contact;
        this.contact = contact;
        changeSupport.firePropertyChange("contact", oldContact, contact);
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        String oldNotes = this.notes;
        this.notes = notes;
        changeSupport.firePropertyChange("notes", oldNotes, notes);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        String oldAddress = this.address;
        this.address = address;
        changeSupport.firePropertyChange("address", oldAddress, address);
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        String oldCity = this.city;
        this.city = city;
        changeSupport.firePropertyChange("city", oldCity, city);
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        String oldState = this.state;
        this.state = state;
        changeSupport.firePropertyChange("state", oldState, state);
    }

    public Serializable getPersonsnap() {
        return personsnap;
    }

    public void setPersonsnap(Serializable personsnap) {
        Serializable oldPersonsnap = this.personsnap;
        this.personsnap = personsnap;
        changeSupport.firePropertyChange("personsnap", oldPersonsnap, personsnap);
    }

    public Serializable getIdsnap() {
        return idsnap;
    }

    public void setIdsnap(Serializable idsnap) {
        Serializable oldIdsnap = this.idsnap;
        this.idsnap = idsnap;
        changeSupport.firePropertyChange("idsnap", oldIdsnap, idsnap);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Customers)) {
            return false;
        }
        Customers other = (Customers) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "checkcasher.Customers[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
