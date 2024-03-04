package com.bea.MyLibrary.config;

import com.bea.MyLibrary.adapters.outbound.SalvarLivroAdapter;
import com.bea.MyLibrary.application.core.Usecase.SalvarLivroUsecase;
import org.checkerframework.framework.qual.DefaultFor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.enterprise.context.Dependent;
import javax.enterprise.inject.Default;

@Dependent
public class Config {

    @Default
    public SalvarLivroUsecase salvarLivroUsecase(SalvarLivroAdapter salvarLivroAdapter){
        return new SalvarLivroUsecase(salvarLivroAdapter);
    }
}