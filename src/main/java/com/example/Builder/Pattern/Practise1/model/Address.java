package com.example.Builder.Pattern.Practise1.model;

public class Address {

    private String street;
    private String city;
    private String state;
    private double pincode;

    public Address(){}

    public Address(AddressBuilder addressBuilder){
        this.street= addressBuilder.street;
        this.city= addressBuilder.city;
        this.state=addressBuilder.state;
        this.pincode=addressBuilder.pincode;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setPincode(double pincode) {
        this.pincode = pincode;
    }

    public double getPincode() {
        return pincode;


    }

    public static class AddressBuilder{
        private String street;
        private String city;
        private String state;
        private double pincode;

        public AddressBuilder street(String s){
            this.street = s;
            return this;
        }

        public AddressBuilder city(String c){
            this.city=c;
            return this;
        }

        public AddressBuilder state(String s) {
            this.state=s;
            return this;
        }

        public AddressBuilder pincode(double p) {
            this.pincode=p;
            return this;
        }

        public Address build(){
            return new Address(this);
        }
    }
}
