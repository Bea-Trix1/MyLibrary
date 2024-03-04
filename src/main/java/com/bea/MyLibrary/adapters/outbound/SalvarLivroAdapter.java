package com.bea.MyLibrary.adapters.outbound;

import com.bea.MyLibrary.adapters.inbound.mapper.LivroEntityToLivroMapper;
import com.bea.MyLibrary.adapters.inbound.mapper.LivroToLivroEntityMapper;
import com.bea.MyLibrary.adapters.outbound.repository.LivroRepository;
import com.bea.MyLibrary.application.core.domain.Livro;
import com.bea.MyLibrary.application.ports.out.SalvarLivroPort;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class SalvarLivroAdapter implements SalvarLivroPort {

    private final LivroRepository livroRepository;

    private final LivroToLivroEntityMapper livroToLivroEntityMapper;

    private final LivroEntityToLivroMapper livroEntityToLivroMapper;

    @Override
    @Transactional
    public Livro salvarLivro(Livro livro) {
        var livroEntity = livroToLivroEntityMapper.mapper(livro);
        livroEntity.setLivro(livroEntity);

        return livroEntityToLivroMapper.mapper(livroEntity);
    }
}
