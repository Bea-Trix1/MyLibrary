package com.bea.MyLibrary.adapters.inbound;

import com.bea.MyLibrary.adapters.inbound.mapper.LivroRequestToLivroMapper;
import com.bea.MyLibrary.adapters.inbound.request.LivroRequest;
import com.bea.MyLibrary.application.core.domain.Livro;
import com.bea.MyLibrary.application.ports.in.SalvarLivroUsecasePort;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/livro")
@AllArgsConstructor
public class LivroController {

        private final  SalvarLivroUsecasePort salvarLivroUsecasePort;

        private final LivroRequestToLivroMapper livroRequestToLivroMapper;

        @PostMapping
        public Livro salvarUsuario(@RequestBody LivroRequest livroRequest){
            var livro = livroRequestToLivroMapper.mapper(livroRequest);
            return salvarLivroUsecasePort.salvarLivro(livro);
        }
}
