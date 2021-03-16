package com.dev.service;

import com.dev.model.Status;
import com.dev.model.Vacancy;
import org.springframework.data.domain.Pageable;
import java.util.List;

public interface VacancyService {
    Vacancy add(Vacancy vacancy);

    Vacancy get(Long id);

    List<Vacancy> findByStatus(Long userId, String status);

    List<Vacancy> findByCompany(Long userId, String company);

    List<Vacancy> getAll(Long userId, Pageable pageable);

    Vacancy update(Vacancy vacancy);

    void delete(Vacancy vacancy);
}
