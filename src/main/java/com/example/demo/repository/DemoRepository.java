package com.example.demo.repository;

import com.example.demo.dto.DemoDto;
import com.example.demo.entity.DemoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DemoRepository extends JpaRepository<DemoEntity, Integer> {

    @Query("SELECT new com.example.demo.dto.DemoDto(entity.id, entity.value) FROM DemoEntity entity WHERE entity.value = :value")
    public List<DemoDto> findByValue(@Param("value") String value);
}
