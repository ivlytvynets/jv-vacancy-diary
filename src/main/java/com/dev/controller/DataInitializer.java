package com.dev.controller;

import com.dev.model.Status;
import com.dev.model.User;
import com.dev.model.Vacancy;
import com.dev.service.UserService;
import com.dev.service.VacancyService;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import java.time.LocalDateTime;
import java.util.List;

@Component
public class DataInitializer {
    private final UserService userService;
    private final VacancyService vacancyService;

    public DataInitializer(UserService userService, VacancyService vacancyService) {
        this.userService = userService;
        this.vacancyService = vacancyService;
    }

    /*@PostConstruct
    public void inject() {
        Vacancy vacancy1 = new Vacancy();
        vacancy1.setLastStatusUpdate(LocalDateTime.now());
        vacancy1.setVacancyLink("link");
        vacancy1.setStatus(Status.APPLIED.toString());
        vacancy1.setPosition("jkll");
        vacancy1.setCompany("company3");
        vacancy1.setRecruiterContacts("....");
        vacancy1.setExpectedSalary(600);

        Vacancy vacancy2 = new Vacancy();
        vacancy2.setLastStatusUpdate(LocalDateTime.now());
        vacancy2.setVacancyLink("link4");
        vacancy2.setStatus(Status.APPLIED.toString());
        vacancy2.setPosition("jkcssdll");
        vacancy2.setCompany("company4");
        vacancy2.setRecruiterContacts("....");
        vacancy2.setExpectedSalary(500);

        Vacancy vacancy3 = new Vacancy();
        vacancy3.setLastStatusUpdate(LocalDateTime.now());
        vacancy3.setVacancyLink("link");
        vacancy3.setStatus(Status.APPLIED.toString());
        vacancy3.setPosition("jkll");
        vacancy3.setCompany("company3");
        vacancy3.setRecruiterContacts("....");
        vacancy3.setExpectedSalary(600);

        Vacancy vacancy4 = new Vacancy();
        vacancy4.setLastStatusUpdate(LocalDateTime.now());
        vacancy4.setVacancyLink("link4");
        vacancy4.setStatus(Status.APPLIED.toString());
        vacancy4.setPosition("jkcssdll");
        vacancy4.setCompany("company4");
        vacancy4.setRecruiterContacts("....");
        vacancy4.setExpectedSalary(500);

        Vacancy vacancy5 = new Vacancy();
        vacancy5.setLastStatusUpdate(LocalDateTime.now());
        vacancy5.setVacancyLink("link5");
        vacancy5.setStatus(Status.APPLIED.toString());
        vacancy5.setPosition("jkldsdsdl");
        vacancy5.setCompany("company5");
        vacancy5.setRecruiterContacts("....");
        vacancy5.setExpectedSalary(1000);

        Vacancy vacancy6 = new Vacancy();
        vacancy6.setLastStatusUpdate(LocalDateTime.now());
        vacancy6.setVacancyLink("link");
        vacancy6.setStatus(Status.APPLIED.toString());
        vacancy6.setPosition("jkll");
        vacancy6.setCompany("company3");
        vacancy6.setRecruiterContacts("....");
        vacancy6.setExpectedSalary(600);

        Vacancy vacancy7 = new Vacancy();
        vacancy7.setLastStatusUpdate(LocalDateTime.now());
        vacancy7.setVacancyLink("link4");
        vacancy7.setStatus(Status.APPLIED.toString());
        vacancy7.setPosition("jkcssdll");
        vacancy7.setCompany("company4");
        vacancy7.setRecruiterContacts("....");
        vacancy7.setExpectedSalary(500);

        Vacancy vacancy8 = new Vacancy();
        vacancy8.setLastStatusUpdate(LocalDateTime.now());
        vacancy8.setVacancyLink("link5");
        vacancy8.setStatus(Status.APPLIED.toString());
        vacancy8.setPosition("jkldsdsdl");
        vacancy8.setCompany("company5");
        vacancy8.setRecruiterContacts("....");
        vacancy8.setExpectedSalary(1000);

        vacancyService.add(vacancy1);
        vacancyService.add(vacancy2);
        vacancyService.add(vacancy3);
        vacancyService.add(vacancy4);
        vacancyService.add(vacancy5);
        vacancyService.add(vacancy6);
        vacancyService.add(vacancy7);
        vacancyService.add(vacancy8);

        User user = userService.findByEmail("admin@gmail.com");
        user.getVacancies().addAll(List.of(vacancy1, vacancy2, vacancy3, vacancy4, vacancy5, vacancy6, vacancy7, vacancy8));
        userService.update(user);
    }*/
}
