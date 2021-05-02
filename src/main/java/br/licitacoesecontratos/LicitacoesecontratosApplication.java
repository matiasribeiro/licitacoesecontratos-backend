package br.licitacoesecontratos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.data.web.config.EnableSpringDataWebSupport;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;

@SpringBootApplication
@ComponentScan({
	"br.licitacoesecontratos.controller",
	"br.licitacoesecontratos.form",
	"br.licitacoesecontratos.config",
	})
@EntityScan(basePackages = {"br.licitacoesecontratos.model"} )
@EnableMongoRepositories(basePackages = {"br.licitacoesecontratos.repository"})
@EnableSpringDataWebSupport
@EnableEncryptableProperties
@EnableCaching
public class LicitacoesecontratosApplication {

	public static void main(String[] args) {
		SpringApplication.run(LicitacoesecontratosApplication.class, args);
	}
}
