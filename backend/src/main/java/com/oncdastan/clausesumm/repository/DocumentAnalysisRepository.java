package com.oncdastan.clausesumm.repository;

import com.oncdastan.clausesumm.model.entity.DocumentAnalysis;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface DocumentAnalysisRepository extends JpaRepository<DocumentAnalysis, UUID> {
}
