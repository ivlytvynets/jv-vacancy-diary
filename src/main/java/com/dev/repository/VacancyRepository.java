package com.dev.repository;

import com.dev.model.Vacancy;
import java.util.List;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface VacancyRepository extends JpaRepository<Vacancy, Long> {
    @Query(value = "select * from vacancy v inner join user_vacancies uv "
            + "on uv.vacancies_id = v.id where uv.user_id = :user_id and v.status = :status",
            nativeQuery = true)
    List<Vacancy> findAllByStatus(@Param("user_id") Long userId, @Param("status") String status);
    @Query(value = "select * from vacancy v inner join user_vacancies uv "
            + "on uv.vacancies_id = v.id where uv.user_id = :user_id and v.company = :company",
            nativeQuery = true)
    List<Vacancy> findAllByCompany(@Param("user_id") Long userId,
                                   @Param("company") String company);

    @Query(value = "select * from vacancy v inner join user_vacancies uv "
            + "on uv.vacancies_id = v.id where uv.user_id = :user_id", nativeQuery = true)
    List<Vacancy> findAll(@Param("user_id") Long userId, Pageable pageable);
}
