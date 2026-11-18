package com.dt2.gta_vi.controller;

import com.dt2.gta_vi.entities.Missoes;
import com.dt2.gta_vi.repositories.MissoesRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/missoes")
public class MissoesController {

    private final MissoesRepository repository;
    public MissoesController(MissoesRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    public Missoes criarMissoes(@RequestBody Missoes m) {
        return repository.save(m);
    }

    @GetMapping
    public List<Missoes> mostrar(){
        return repository.findAll();
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable int id){
        repository.deleteById(id);
    }

    @GetMapping("/{id}")
    public Missoes buscar(@PathVariable int id){
        return repository.findById(id).orElse(null);
    }

    @PutMapping("/{id}")
    public void atualizar(@PathVariable int id,
                          @RequestBody Missoes m) {
        Missoes missoes = repository.getReferenceById(id);
        missoes.setNome(m.getNome());
        missoes.setLocal(m.getLocal());
        missoes.setDificuldade(m.getDificuldade());
        missoes.setImagem(m.getImagem());
        missoes.setDescricao(m.getDescricao());
        repository.save(missoes);
    }

}