package br.com.teste;

import br.com.teste.view.AlunoView;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AplicacaoDemonstracaoNbApplication {

    public static void main(String[] args) {
//        SpringApplication.run(AplicacaoDemonstracaoNbApplication.class, args);;
        //SWING
        new SpringApplicationBuilder(AplicacaoDemonstracaoNbApplication.class)
                .headless(false)
                .web(false)
                .run(args);


    }

    @Bean
    public AlunoView alunoView() {
        return new AlunoView();
    }
}
