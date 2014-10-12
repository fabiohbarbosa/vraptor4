package com.wordpress.fabiohbarbosa.vraptor4.model.repository;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

import org.hibernate.Criteria;
import org.hibernate.Session;

import com.wordpress.fabiohbarbosa.vraptor4.model.entity.Empresa;

@RequestScoped
public class EmpresaRepository {

    @Inject
    private Session session;

    private Criteria createCriteria() {
        return session.createCriteria(Empresa.class);
    }

    @SuppressWarnings("unchecked")
    public List<Empresa> list() {
        return createCriteria().list();
    }
}