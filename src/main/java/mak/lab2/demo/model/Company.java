package mak.lab2.demo.model;

import java.time.Instant;
import java.util.Objects;

/**
 * @author sonnyako <Makydon Sofiia>
 * @version 1.0.0
 * @since 1.0.0
 */
public class Company {
    private String id;
    private String name;
    private Address address;
    private String phoneNumber;
    private String email;
    private String description;
    private Instant createdAt;
    private Instant updatedAt;

    public Company(String id, String name, Address address, String phoneNumber, String email, String description, Instant createdAt, Instant updatedAt) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.description = description;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Instant createdAt) {
        this.createdAt = createdAt;
    }

    public Instant getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Instant updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Company)) return false;
        Company company = (Company) o;
        return Objects.equals(id, company.id) && Objects.equals(name, company.name) && Objects.equals(address, company.address) && Objects.equals(phoneNumber, company.phoneNumber) && Objects.equals(email, company.email) && Objects.equals(description, company.description) && Objects.equals(createdAt, company.createdAt) && Objects.equals(updatedAt, company.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, address, phoneNumber, email, description, createdAt, updatedAt);
    }

    @Override
    public String toString() {
        return "\t Company{" +
            "\t id - " + this.id +
            "\t name - " + this.name +
            "\t address - " + this.address +
            "\t email - " + this.email +
            "\t phoneNumber - " + this.phoneNumber +
            "\t description - " + this.description + "}";
    }
}
