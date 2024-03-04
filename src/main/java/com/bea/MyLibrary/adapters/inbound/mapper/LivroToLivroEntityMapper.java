package com.bea.MyLibrary.adapters.inbound.mapper;

import com.bea.MyLibrary.adapters.inbound.entity.LivroEntity;
import com.bea.MyLibrary.application.core.domain.Livro;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class LivroToLivroEntityMapper {
        public LivroEntity mapper(Livro livro){
            var livroEntity = new LivroEntity();
            BeanUtils.copyProperties(livro, livroEntity);
            return livroEntity;
        }
}
