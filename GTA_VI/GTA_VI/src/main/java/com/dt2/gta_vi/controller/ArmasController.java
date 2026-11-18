package com.dt2.gta_vi.controller;

import com.dt2.gta_vi.entities.Armas;
import com.dt2.gta_vi.repositories.ArmasRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/armas")
public class ArmasController {

    private final ArmasRepository repository;
    public ArmasController(ArmasRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    public Armas criarArma(@RequestBody Armas arma) {
        return repository.save(arma);
    }

    @GetMapping
    public List<Armas> mostrar(){
        return repository.findAll();
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable int id){
        repository.deleteById(id);
    }

    @GetMapping("/{id}")
    public Armas buscar(@PathVariable int id){
        return repository.findById(id).orElse(null);
    }

    @PutMapping("/{id}")
    public void atualizar(@PathVariable int id,
                          @RequestBody Armas a) {
        Armas armas = repository.getReferenceById(id);
        armas.setNome(a.getNome());
        armas.setCategoria(a.getCategoria());
        armas.setFabricante(a.getFabricante());
        armas.setImagem(a.getImagem());
        armas.setDescricao(a.getDescricao());
        repository.save(armas);
    }

}
