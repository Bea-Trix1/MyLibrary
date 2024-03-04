package com.bea.MyLibrary.application.core.Usecase;

import com.bea.MyLibrary.application.core.domain.Livro;
import com.bea.MyLibrary.application.ports.in.SalvarLivroUsecasePort;
import com.bea.MyLibrary.application.ports.out.SalvarLivroPort;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class SalvarLivroUsecase implements SalvarLivroUsecasePort {

    private final SalvarLivroPort salvarLivroPort;

    @Override
    public Livro salvarLivro(Livro livro){
        var livros = salvarLivroPort.salvarLivro(livro);
        livro.setNome("nome");

        return salvarLivroPort.salvarLivro(livros);
    }


}
