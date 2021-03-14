package mak.lab2.demo.model;

import java.time.Instant;
import java.util.List;
import java.util.Objects;

/**
 * @author sonnyako <Makydon Sofiia>
 * @version 1.0.0
 * @since 1.0.0
 */
public class Vacancy {
    private String id;
    private String position;
    private double salary;
    private String description;
    private List<RequirementType> requirements;
    private Company company;
    private Instant createdAt;
    private Instant updatedAt;

    public Vacancy(String id, String position, double salary, String description, List<RequirementType> requirements, Company company, Instant createdAt, Instant updatedAt) {
        this.id = id;
        this.position = position;
        this.salary = salary;
        this.description = description;
        this.requirements = requirements;
        this.company = company;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<RequirementType> getRequirements() {
        return requirements;
    }

    public void setRequirements(List<RequirementType> requirements) {
        this.requirements = requirements;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
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
        if (!(o instanceof Vacancy)) return false;
        Vacancy vacancy = (Vacancy) o;
        return Double.compare(vacancy.salary, salary) == 0 &&
            Objects.equals(id, vacancy.id) &&
            Objects.equals(position, vacancy.position) &&
            Objects.equals(description, vacancy.description) &&
            Objects.equals(requirements, vacancy.requirements) &&
            Objects.equals(company, vacancy.company);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, position, salary, description, requirements, company);
    }

    @Override
    public String toString() {
        return "\t Vacancy{" +
            " \t id - " + this.id +
            "\t position - " + this.position +
            "\t salary - " + this.salary +
            "\t description - " + this.description +
            "\t requirements - " + this.requirements +
            "\t company - " + this.company + "}";
    }

}
