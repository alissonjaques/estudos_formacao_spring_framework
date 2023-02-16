package med.voll.api.domain.model.medico;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicoRepository extends JpaRepository<Medico, Long> { // tipo objeto / tipo chave primária
    Page<Medico> findAllByAtivoTrue(Pageable paginacao);
}