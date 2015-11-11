package com.idomine;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.idomine.model.Autor;
import com.idomine.model.Livro;
import com.idomine.model.Usuario;
import com.idomine.model.enums.Genero;
import com.idomine.model.enums.UsuarioSituacao;
import com.idomine.repository.AutorRepository;
import com.idomine.repository.LivroRepository;
import com.idomine.repository.UsuarioRepository;

@SpringBootApplication
public class BibliotecaApplication {
	
    public static void main(String[] args) {
     
    	ConfigurableApplicationContext app =
    				SpringApplication.run(BibliotecaApplication.class, args);
    	
    	AutorRepository autorRep = app.getBean(AutorRepository.class);
    	LivroRepository livroRep = app.getBean(LivroRepository.class);
    	UsuarioRepository usuarioRep = app.getBean(UsuarioRepository.class);

    	/**
    	 * adiconado registros de autores e livros
    	 */
    	
    	for ( int i=1;i<=10;i++){
    		Autor autor = autorRep.save( new Autor(0,"autor-"+i ));
    		
    		System.out.println(autor);
    		
    		for (int j=1;j<=10;j++){
    			Livro  livro = new Livro(0,"livro-"+j+" autor-" + i,autor,Genero.FICCAO);
    			livroRep.save( livro);
    			System.out.println(livro);
    		}
    	}
    	
    	
    	/**
    	 * adicionando usuários
    	 */
    	for (int i=1;i<=10;i++){
    		usuarioRep.save(
    				 new Usuario( 
    						  0,
    						  "usuario-"+i ,
    						  "login-"+i ,
    						  "senha-"+i ,
    						  UsuarioSituacao.ATIVO, 
    						  "email@email-"+i+".com" , 
    						  new Date()
    						  )
    				 );
    	}
    	
    }
}
