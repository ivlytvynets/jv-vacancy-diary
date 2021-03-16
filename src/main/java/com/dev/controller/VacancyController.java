package com.dev.controller;

import com.dev.model.Vacancy;
import com.dev.model.dto.VacancyRequestDto;
import com.dev.model.dto.VacancyResponseDto;
import com.dev.service.UserService;
import com.dev.service.VacancyMapper;
import com.dev.service.VacancyService;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/vacancies")
public class VacancyController {
    private final UserService userService;
    private final VacancyService vacancyService;
    private final VacancyMapper vacancyMapper;

    public VacancyController(UserService userService, VacancyService vacancyService,
                             VacancyMapper vacancyMapper) {
        this.userService = userService;
        this.vacancyService = vacancyService;
        this.vacancyMapper = vacancyMapper;
    }

    @GetMapping
    public List<VacancyResponseDto> getAllVacancies(@PageableDefault(value=5, page=0) Pageable pageable,
                                            Authentication authentication) {
        return vacancyService.getAll(userService.findByEmail(authentication.getName())
                .getId(), pageable)
                .stream()
                .map(vacancyMapper::toDto)
                .collect(Collectors.toList());
    }

    @GetMapping("/status/{status}")
    public List<Vacancy> getAllVacanciesWithStatus(@PathVariable String status,
                                                      Authentication authentication) {
        return vacancyService.findByStatus(userService.findByEmail(authentication.getName())
                .getId(), status);
    }

    @GetMapping("/company/{company}")
    public List<VacancyResponseDto> getAllVacanciesWithCompany(@PathVariable String company,
                                                               Authentication authentication) {
        return vacancyService.findByCompany(userService.findByEmail(authentication.getName())
                .getId(), company)
                .stream()
                .map(vacancyMapper::toDto)
                .collect(Collectors.toList());
    }

    @PostMapping("/update/{id}")
    public void updateStatus(@PathVariable Long id, @RequestBody VacancyRequestDto dto) {
        Vacancy vacancy = vacancyService.get(id);
        vacancyMapper.fromDto(vacancy, dto);
        vacancy.setLastStatusUpdate(LocalDateTime.now());
        vacancyService.update(vacancy);
    }
}
