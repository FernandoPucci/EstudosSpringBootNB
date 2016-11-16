/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.teste.dao;

import br.com.teste.model.Aluno;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 *
 * @author fernandopucci
 */
@Repository
public interface AlunoDAO extends CrudRepository<Aluno, Long> {
    
}
