package mak.lab2.demo.model;

import java.time.Instant;
import java.util.Date;
import java.util.Objects;

/**
 * @author sonnyako <Makydon Sofiia>
 * @version 1.0.0
 * @since 1.0.0
 */
public class Contract {
    private String id;
    private Company company;
    private Worker worker;
    private Vacancy vacancy;
    private Date date;
    private float commission;
    private Instant createdAt;
    private Instant updatedAt;

    public Contract(String id, Company company, Worker worker, Vacancy vacancy, Date date, float commission, Instant createdAt, Instant updatedAt) {
        this.id = id;
        this.company = company;
        this.worker = worker;
        this.vacancy = vacancy;
        this.date = date;
        this.commission = commission;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Contract() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public Worker getWorker() {
        return worker;
    }

    public void setWorker(Worker worker) {
        this.worker = worker;
    }

    public Vacancy getVacancy() {
        return vacancy;
    }

    public void setVacancy(Vacancy vacancy) {
        this.vacancy = vacancy;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public float getCommission() {
        return commission;
    }

    public void setCommission(float commission) {
        this.commission = commission;
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
        if (!(o instanceof Contract)) return false;
        Contract contract = (Contract) o;
        return Objects.equals(id, contract.id) &&
            Objects.equals(company, contract.company) &&
            Objects.equals(worker, contract.worker) &&
            Objects.equals(vacancy, contract.vacancy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, company, worker, vacancy);
    }

    @Override
    public String toString() {
        return " \nContract{" +
            "\t id - " + this.id +
            "\t company - " + this.company +
            "\t worker - " + this.worker +
            "\t vacancy - " + this.vacancy + "}";
    }

}
