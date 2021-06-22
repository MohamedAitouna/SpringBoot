package com.example.startstart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.startstart.model.FeatureToggle;

@Repository
public interface FeatureToggleRepository extends JpaRepository<FeatureToggle, Long> {

}
