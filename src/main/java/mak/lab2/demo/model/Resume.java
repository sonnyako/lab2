package mak.lab2.demo.model;

import java.time.Instant;
import java.util.List;
import java.util.Objects;

/**
 * @author sonnyako <Makydon Sofiia>
 * @version 1.0.0
 * @since 1.0.0
 */
public class Resume {
    private String id;
    private String experience;
    private List<HardSkillType> hardSkills;
    private List<SoftSkillType> softSkills;
    private String education;
    private List<ActivityType> activityTypes;
    private Instant createdAt;
    private Instant updatedAt;

    public Resume(String id, String experience, List<HardSkillType> hardSkills, List<SoftSkillType> softSkills, String education, List<ActivityType> activityTypes, Instant createdAt, Instant updatedAt) {
        this.id = id;
        this.experience = experience;
        this.hardSkills = hardSkills;
        this.softSkills = softSkills;
        this.education = education;
        this.activityTypes = activityTypes;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public List<HardSkillType> getHardSkills() {
        return hardSkills;
    }

    public void setHardSkills(List<HardSkillType> hardSkills) {
        this.hardSkills = hardSkills;
    }

    public List<SoftSkillType> getSoftSkills() {
        return softSkills;
    }

    public void setSoftSkills(List<SoftSkillType> softSkills) {
        this.softSkills = softSkills;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public List<ActivityType> getActivityTypes() {
        return activityTypes;
    }

    public void setActivityTypes(List<ActivityType> activityTypes) {
        this.activityTypes = activityTypes;
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
        if (!(o instanceof Resume)) return false;
        Resume resume = (Resume) o;
        return Objects.equals(id, resume.id) &&
            Objects.equals(experience, resume.experience) &&
            Objects.equals(hardSkills, resume.hardSkills) &&
            Objects.equals(softSkills, resume.softSkills) &&
            Objects.equals(education, resume.education) &&
            Objects.equals(activityTypes, resume.activityTypes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, experience, hardSkills, softSkills, education, activityTypes);
    }

    @Override
    public String toString() {
        return " \t Summary{" +
            "\t id - " + this.id +
            "\t experience - " + this.experience +
            "\t hardSkills - " + this.hardSkills +
            "\t softSkills - " + this.softSkills +
            "\t education - " + this.education +
            "\t activity - " + this.activityTypes + "}";
    }

}


