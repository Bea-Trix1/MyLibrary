package com.bea.MyLibrary.adapters.inbound.mapper;

import com.bea.MyLibrary.adapters.inbound.entity.LivroEntity;
import com.bea.MyLibrary.adapters.inbound.request.LivroRequest;
import com.bea.MyLibrary.application.core.domain.Livro;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class LivroEntityToLivroMapper {
    public Livro mapper(LivroEntity livroEntity){
        var livro = new Livro();
        BeanUtils.copyProperties(livroEntity, livro);
        return livro;
    }
}
