package br.com.atavares.apipedido.controller;

import br.com.atavares.apipedido.model.Produto;
import br.com.atavares.apipedido.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("produtos")
public class ProdutoController {

    @Autowired
    private ProdutoRepository produtoRepository;

    @GetMapping
    public List<Produto> findAll(){
        return produtoRepository.findAll();
    }

    @GetMapping("{id}")
    public Produto findById(@PathVariable("id") Integer id){
        return produtoRepository.findById(id).get();
    }

    @GetMapping
    public List<Produto> buscar(@RequestParam("nome") String nome){
        return produtoRepository.findByNome(nome);
    }

    @PostMapping
    public Produto save(@RequestBody Produto produto){
        //produto.setId(UUID.randomUUID().toString());
        produtoRepository.save(produto);
        return produto;
    }

}
