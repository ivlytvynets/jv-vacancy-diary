package com.dev.model.dto;

public class VacancyRequestDto {
    private String company;
    private String position;
    private int expectedSalary;
    private String vacancyLink;
    private String recruiterContacts;
    private String status;

    public String getCompany() {
        return company;
    }

    public String getPosition() {
        return position;
    }

    public int getExpectedSalary() {
        return expectedSalary;
    }

    public String getVacancyLink() {
        return vacancyLink;
    }

    public String getRecruiterContacts() {
        return recruiterContacts;
    }

    public String getStatus() {
        return status;
    }
}
