package com.gustavosant.dslist.repositories;

import com.gustavosant.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {

}
