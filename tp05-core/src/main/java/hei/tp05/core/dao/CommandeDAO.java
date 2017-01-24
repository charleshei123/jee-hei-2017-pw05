package hei.tp05.core.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import hei.tp05.core.entity.Commande;

public interface CommandeDAO extends JpaRepository<Commande, Long> {
}
