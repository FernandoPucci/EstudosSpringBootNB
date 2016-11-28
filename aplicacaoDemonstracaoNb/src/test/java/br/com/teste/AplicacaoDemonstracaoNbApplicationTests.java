package br.com.teste;


import br.com.teste.dao.AlunoDAO;
import br.com.teste.model.Aluno;
import java.util.Date;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class AplicacaoDemonstracaoNbApplicationTests {

    @Autowired
    AlunoDAO alunoDAO;
    
    
	@Test
	public void contextLoads() {
            new SpringApplicationBuilder(AplicacaoDemonstracaoNbApplicationTests.class)
                .headless(false)
                .web(false)
                .run();
	}
        
        @Test
        public void tester(){
        
            Aluno aluno = new Aluno("ZE", "silva", new Date());
            alunoDAO.save(aluno);
            
        }

}
