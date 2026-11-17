package com.dt2.gta_vi.repositories;

import com.dt2.gta_vi.entities.Personagem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonagemRepository extends JpaRepository<Personagem, Integer> {
}
