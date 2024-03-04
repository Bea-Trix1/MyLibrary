package com.bea.MyLibrary.adapters.outbound.repository;

import com.bea.MyLibrary.application.core.domain.Livro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface LivroRepository extends JpaRepository<LivroRepository, String> {
}
