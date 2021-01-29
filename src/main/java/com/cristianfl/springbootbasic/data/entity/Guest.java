package com.cristianfl.springbootbasic.data.entity;

import javax.persistence.*;

@Entity
public class Guest {
    @Id
    @Column(name="GUEST_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long guestId;
    @Column(name="FIRST_NAME")
    private String guestFirstName;
    @Column(name="LAST_NAME")
    private String guestLastName;
    @Column(name="EMAIL_ADDRESS")
    private String guestEmailAddress;
    @Column(name="ADDRESS")
    private String guestAddres;
    @Column(name="COUNTRY")
    private String guestCountry;
    @Column(name="STATE")
    private String guestState;
    @Column(name="PHONE_NUMBER")
    private String guestPhoneNumber;

    public long getGuestId() {
        return guestId;
    }

    public void setGuestId(long guestId) {
        this.guestId = guestId;
    }

    public String getGuestFirstName() {
        return guestFirstName;
    }

    public void setGuestFirstName(String guestFirstName) {
        this.guestFirstName = guestFirstName;
    }

    public String getGuestLastName() {
        return guestLastName;
    }

    public void setGuestLastName(String guestLastName) {
        this.guestLastName = guestLastName;
    }

    public String getGuestEmailAddress() {
        return guestEmailAddress;
    }

    public void setGuestEmailAddress(String guestEmailAddress) {
        this.guestEmailAddress = guestEmailAddress;
    }

    public String getGuestAddres() {
        return guestAddres;
    }

    public void setGuestAddres(String guestAddres) {
        this.guestAddres = guestAddres;
    }

    public String getGuestCountry() {
        return guestCountry;
    }

    public void setGuestCountry(String guestCountry) {
        this.guestCountry = guestCountry;
    }

    public String getGuestState() {
        return guestState;
    }

    public void setGuestState(String guestState) {
        this.guestState = guestState;
    }

    public String getGuestPhoneNumber() {
        return guestPhoneNumber;
    }

    public void setGuestPhoneNumber(String guestPhoneNumber) {
        this.guestPhoneNumber = guestPhoneNumber;
    }
}
