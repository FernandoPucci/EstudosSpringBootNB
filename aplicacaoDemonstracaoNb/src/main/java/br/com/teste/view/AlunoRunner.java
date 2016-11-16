/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.teste.view;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 *
 * @author fernandopucci
 */
@Component
public class AlunoRunner implements CommandLineRunner{

    @Autowired
    private AlunoView alunoView;

    @Override
    public void run(String... strings) throws Exception {
         java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                alunoView.setVisible(true);
            }
});
    }
}
