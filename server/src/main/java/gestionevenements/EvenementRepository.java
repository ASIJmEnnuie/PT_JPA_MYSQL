package gestionevenements;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface EvenementRepository extends CrudRepository<Evenement, Integer> {

    List<Evenement> findByNomEvt(String nomEvt);
}
