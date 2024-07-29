package net.media.training.live.srp;

public class Address {
    private String addressStreet;
    private String addressCity;
    private String addressCountry;

    public Address(String addressStreet, String addressCity, String addressCountry) {
        this.addressStreet = addressStreet;
        this.addressCity = addressCity;
        this.addressCountry = addressCountry;
    }

    public void setStreet(String addressStreet) {
        this.addressStreet = addressStreet;
    }

    public void setCity(String addressCity) {
        this.addressCity = addressCity;
    }

    public void setCountry(String addressCountry) {
        this.addressCountry = addressStreet;
    }

    public String getStreet() {
        return this.addressStreet;
    }

    public String getCity() {
        return this.addressCity;
    }

    public String getCountry() {
        return this.addressCountry;
    }

}
