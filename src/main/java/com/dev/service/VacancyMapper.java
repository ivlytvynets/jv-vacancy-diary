package com.dev.service;

import com.dev.model.Vacancy;
import com.dev.model.dto.VacancyRequestDto;
import com.dev.model.dto.VacancyResponseDto;
import org.springframework.stereotype.Component;

@Component
public class VacancyMapper {
    public VacancyResponseDto toDto(Vacancy vacancy) {
        VacancyResponseDto dto = new VacancyResponseDto();
        dto.setId(vacancy.getId());
        dto.setCompany(vacancy.getCompany());
        dto.setStatus(vacancy.getStatus());
        dto.setVacancyLink(vacancy.getVacancyLink());
        dto.setPosition(vacancy.getPosition());
        dto.setExpectedSalary(vacancy.getExpectedSalary());
        dto.setRecruiterContacts(vacancy.getRecruiterContacts());
        dto.setLastStatusUpdate(vacancy.getLastStatusUpdate());
        return dto;
    }

    public Vacancy fromDto(Vacancy vacancy, VacancyRequestDto dto) {
        if (dto.getCompany() != null) {
            vacancy.setCompany(dto.getCompany());
        }
        if (dto.getVacancyLink() != null) {
            vacancy.setVacancyLink(dto.getVacancyLink());
        }
        if (dto.getPosition() != null) {
            vacancy.setPosition(dto.getPosition());
        }
        if (dto.getExpectedSalary() != 0) {
            vacancy.setExpectedSalary(dto.getExpectedSalary());
        }
        if (dto.getRecruiterContacts() != null) {
            vacancy.setRecruiterContacts(dto.getRecruiterContacts());
        }
        if (dto.getStatus() != null) {
            vacancy.setStatus(dto.getStatus());
        }
        return vacancy;
    }
}
