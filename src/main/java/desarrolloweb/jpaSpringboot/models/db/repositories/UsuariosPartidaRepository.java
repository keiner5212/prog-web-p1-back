package desarrolloweb.jpaSpringboot.models.db.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import desarrolloweb.jpaSpringboot.models.db.entities.UsuarioPartida;

@RepositoryRestResource
public interface UsuariosPartidaRepository  extends JpaRepository<UsuarioPartida, Long>{
    
}
