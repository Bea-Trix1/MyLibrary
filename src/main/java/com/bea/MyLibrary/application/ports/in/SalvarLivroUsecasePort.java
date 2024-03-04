package com.bea.MyLibrary.application.ports.in;

import com.bea.MyLibrary.application.core.domain.Livro;

public interface SalvarLivroUsecasePort {
    Livro salvarLivro(Livro livro);
}
