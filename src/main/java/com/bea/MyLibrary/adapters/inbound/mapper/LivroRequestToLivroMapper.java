package com.bea.MyLibrary.adapters.inbound.mapper;

import com.bea.MyLibrary.adapters.inbound.request.LivroRequest;
import com.bea.MyLibrary.application.core.domain.Livro;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class LivroRequestToLivroMapper {
    public Livro mapper(LivroRequest livroRequest){
        var livro = new Livro();
        BeanUtils.copyProperties(livroRequest, livro);
        return livro;
    }
}
