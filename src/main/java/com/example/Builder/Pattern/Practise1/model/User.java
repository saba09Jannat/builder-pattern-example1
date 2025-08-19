package com.example.Builder.Pattern.Practise1.model;

public class User {

    private String firstName;
    private String lastName;
    private int age;
    private Address address;

    public User(UserBuilder user){
        this.firstName = user.firstName;
        this.lastName = user.lastName;
        this.age = user.age;
        this.address=user.address;
    }

    public User(){}

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public Address getAddress() {
        return address;
    }

    public static class UserBuilder{

        private String firstName;
        private  String lastName;
        private int age;
        private Address address;

        public UserBuilder firstName(String fname){
            this.firstName=fname;
            return this;
        }

        public UserBuilder lastName(String lname){
            this.lastName=lname;
            return this;
        }

        public UserBuilder age(int a){
            this.age = a;
            return  this;
        }

        public UserBuilder address(Address address){
            this.address = address;
            return this;
        }

        public User build(){
            return new User(this);
        }
    }
}
