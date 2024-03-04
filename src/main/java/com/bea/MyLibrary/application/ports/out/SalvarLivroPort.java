package com.bea.MyLibrary.application.ports.out;

import com.bea.MyLibrary.application.core.domain.Livro;

public interface SalvarLivroPort {
    Livro salvarLivro(Livro livro);
}
