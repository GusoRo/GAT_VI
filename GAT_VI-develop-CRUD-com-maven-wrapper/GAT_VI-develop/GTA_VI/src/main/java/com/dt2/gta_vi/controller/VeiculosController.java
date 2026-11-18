package com.dt2.gta_vi.controller;

import com.dt2.gta_vi.entities.Veiculos;
import com.dt2.gta_vi.repositories.VeiculosRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/veiculos")
public class VeiculosController {

    private final VeiculosRepository repository;
    public VeiculosController(VeiculosRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    public Veiculos criarVeiculos(@RequestBody Veiculos v) {
        return repository.save(v);
    }

    @GetMapping
    public List<Veiculos> mostrar(){
        return repository.findAll();
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable int id){
        repository.deleteById(id);
    }

    @GetMapping("/{id}")
    public Veiculos buscar(@PathVariable int id){
        return repository.findById(id).orElse(null);
    }

    @PutMapping("/{id}")
    public void atualizar(@PathVariable int id,
                          @RequestBody Veiculos v) {
        Veiculos veiculos = repository.getReferenceById(id);
        veiculos.setNome(v.getNome());
        veiculos.setMarca(v.getMarca());
        veiculos.setTipo(v.getTipo());
        veiculos.setImagem(v.getImagem());
        veiculos.setDescricao(v.getDescricao());
        repository.save(veiculos);
    }

}