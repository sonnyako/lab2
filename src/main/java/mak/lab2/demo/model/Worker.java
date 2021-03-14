package mak.lab2.demo.model;

import java.time.Instant;
import java.util.Objects;

/**
 * @author sonnyako <Makydon Sofiia>
 * @version 1.0.0
 * @since 1.0.0
 */
public class Worker {
    private String id;
    private String name;
    private Address address;
    private String phoneNumber;
    private String email;
    private Resume summary;

    public Worker(String id, String name, Address address, String phoneNumber, String email, Resume summary) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.summary = summary;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Resume getSummary() {
        return summary;
    }

    public void setSummary(Resume summary) {
        this.summary = summary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Worker)) return false;
        Worker user = (Worker) o;
        return Objects.equals(id, user.id) &&
            Objects.equals(name, user.name) &&
            Objects.equals(address, user.address) &&
            Objects.equals(phoneNumber, user.phoneNumber) &&
            Objects.equals(email, user.email) &&
            Objects.equals(summary, user.summary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, address, phoneNumber, email, summary);
    }

    @Override
    public String toString() {
        return "\t User{" +
            "\t id" + this.id +
            "\t name" + this.name +
            "\t address" + this.address +
            "\t address" + this.address +
            "\t email" + this.email +
            "\t summary" + this.summary + "}";
    }

}
