package com.dev.model.dto;

import java.time.LocalDateTime;

public class VacancyResponseDto {
    private Long id;
    private String company;
    private String position;
    private int expectedSalary;
    private String vacancyLink;
    private String recruiterContacts;
    private String status;
    private LocalDateTime lastStatusUpdate;

    public void setId(Long id) {
        this.id = id;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setExpectedSalary(int expectedSalary) {
        this.expectedSalary = expectedSalary;
    }

    public void setVacancyLink(String vacancyLink) {
        this.vacancyLink = vacancyLink;
    }

    public void setRecruiterContacts(String recruiterContacts) {
        this.recruiterContacts = recruiterContacts;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setLastStatusUpdate(LocalDateTime lastStatusUpdate) {
        this.lastStatusUpdate = lastStatusUpdate;
    }
}
