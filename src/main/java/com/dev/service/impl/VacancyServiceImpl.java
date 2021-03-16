package com.dev.service.impl;

import com.dev.model.Status;
import com.dev.model.Vacancy;
import com.dev.repository.VacancyRepository;
import com.dev.service.VacancyService;
import java.util.List;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class VacancyServiceImpl implements VacancyService {
    private final VacancyRepository vacancyRepository;

    public VacancyServiceImpl(VacancyRepository vacancyRepository) {
        this.vacancyRepository = vacancyRepository;
    }

    @Override
    public Vacancy add(Vacancy vacancy) {
        return vacancyRepository.save(vacancy);
    }

    @Override
    public Vacancy get(Long id) {
        return vacancyRepository.getOne(id);
    }

    @Override
    public List<Vacancy> findByStatus(Long userId, String status) {
        return vacancyRepository.findAllByStatus(userId, status);
    }

    @Override
    public List<Vacancy> findByCompany(Long userId, String company) {
        return vacancyRepository.findAllByCompany(userId, company);
    }

    @Override
    public List<Vacancy> getAll(Long userId, Pageable pageable) {
        return vacancyRepository.findAll(userId, pageable);
    }

    @Override
    public Vacancy update(Vacancy vacancy) {
        return vacancyRepository.save(vacancy);
    }

    @Override
    public void delete(Vacancy vacancy) {
        vacancyRepository.delete(vacancy);
    }
}
