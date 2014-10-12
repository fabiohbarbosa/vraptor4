package com.wordpress.fabiohbarbosa.vraptor4.controller;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.view.Results;

import com.wordpress.fabiohbarbosa.vraptor4.model.repository.EmpresaRepository;

@Controller
@Path("/empresa")
public class EmpresaController {
    @Inject
    private Result result;
    @Inject
    private EmpresaRepository empresaRepository;

    @Get 
    @Path("/list")
    public void listAll() {
        result.use(Results.json())
            .withoutRoot()
            .from(empresaRepository.list())
            .serialize();
    }
}